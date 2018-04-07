package com.bookingApp.Controller;

import java.awt.PageAttributes.MediaType;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaTypeEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Entity.ReviewEntity;
import com.bookingApp.Entity.SearchEntity;
import com.bookingApp.Entity.UserEntity;
import com.bookingApp.Model.Hotel;
import com.bookingApp.Model.Review;
import com.bookingApp.Model.Search;
import com.bookingApp.Model.User;
import com.bookingApp.Service.HotelServiceInterface;
import com.bookingApp.Service.ReviewServiceInterface;
import com.bookingApp.Service.SearchServiceInterface;
import com.bookingApp.Service.UserServiceInterface;
import com.google.gson.JsonArray;

import net.minidev.json.JSONArray;

@Controller
@RestController
public class SearchController {

	@Autowired
	HotelServiceInterface hotelService;

	@Autowired
	SearchServiceInterface searchService;

	@Autowired
	UserServiceInterface userservice;

	@Autowired
	ReviewServiceInterface reviewService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String search() {

		System.out.println("m in root");
		return "welcome to the booking service";
	}

	// this method is used to search the hotels
	@RequestMapping(value = "/search/{city}/{Date}/{roomsRequired}/{travellers}/{hotelStar}/"
			+ "{hasWifi}/{hasRestaurant}/{hasAirConditioning}/{mealsIncluded}", method = RequestMethod.GET)
	@ResponseBody
	public String search(@PathVariable String city, @PathVariable String Date, @PathVariable int roomsRequired,
			@PathVariable int travellers, @PathVariable int hotelStar, @PathVariable int hasWifi,
			@PathVariable int hasRestaurant, @PathVariable int hasAirConditioning, @PathVariable int mealsIncluded) {
		SearchEntity search = new SearchEntity(city, Date, roomsRequired, travellers, hotelStar, hasWifi, hasRestaurant,
				hasAirConditioning, mealsIncluded);

		// this gets current date
		JSONObject jobject = new JSONObject();
		JsonArray jarray = new JsonArray();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate));
		String date = dtf.format(localDate);
		try {

			List<HotelEntity> HotelList = searchService.storeSearch(search);

			for (int i = 0; i < HotelList.size(); i++) {
				JSONObject jobj = new JSONObject();
				jobj.put("hotelId", HotelList.get(i).getHotelId());

				jobj.put("hotelName", HotelList.get(i).getHotelName());
				jobj.put("city", HotelList.get(i).getCity());
				jobj.put("roomsNumber", HotelList.get(i).getRoomsNumber());
				jobj.put("stars", HotelList.get(i).getStars());

				if (HotelList.get(i).getIsWifiAvailable() == 1) {
					jobj.put("isWifiAvailable", "Yes");
				} else {
					jobj.put("isWifiAvailable", "No");
				}
				if (HotelList.get(i).getIsresturentAvailable() == 1) {
					jobj.put("isresturentAvailable", "Yes");
				} else {
					jobj.put("isresturentAvailable", "No");
				}
				if (HotelList.get(i).getIsAirconditioned() == 1) {
					jobj.put("isAirconditioned", "Yes");
				} else {
					jobj.put("isAirconditioned", "No");
				}

				if (HotelList.get(i).getIsMealAvailable() == 1) {
					jobj.put("isMealAvailable", "Yes");
				} else {
					jobj.put("isMealAvailable", "No");
				}

				jarray.add(jobj.toString());
			}

			jobject.put("Hotels", jarray);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(jobject);

		return jobject.toString();
	}

	// this api is used show feedbacks

	@RequestMapping(value = "/feedback/{hotel_id}", method = RequestMethod.GET)
	@ResponseBody
	public String getEvent(@PathVariable int hotel_id) {

		List<ReviewEntity> feedback = reviewService.seeReviews(hotel_id);
		
		JSONObject jobject=new JSONObject();
		JSONArray jarray=new JSONArray();
		System.out.println(feedback.size());
		try{
		for (int i = 0; i < feedback.size(); i++) {
			System.out.println(i);
			JSONObject jobj=new JSONObject();
			jobj.put("rating", feedback.get(i).getStar());
			jobj.put("review", feedback.get(i).getComments());
			jobj.put("gender", feedback.get(i).getUserEntity().getSex());
			jobj.put("residential city", feedback.get(i).getUserEntity().getNativeCity());	
			jarray.add(jobj.toString());
		}
		jobject.put("feedbacks", jarray);
		System.out.println(jobject);
	}catch(Exception e) { e.printStackTrace();}
		return jobject.toString();
	}

	// this method is for adding new user
	// http://localhost:8080/add_user/
	@RequestMapping(value = "/add_user", method = RequestMethod.POST)
	public String addUser(@RequestBody UserEntity user) {
		userservice.saveUser(user);
		return "user is added";
	}

	// this method is for updating new user
	@RequestMapping(value = "/update_user/{user_id}", method = RequestMethod.PUT)
	public String updateUser(@PathVariable int user_id, @RequestBody UserEntity user) {
		userservice.updateUser(user_id, user);
		return "user is updated";
	}

	// this api is used to give feedback for the hotel
	@RequestMapping(value = "/add_review/{hotel_id}/{user_id}", method = RequestMethod.POST)
	@ResponseBody
	public String setReview(@PathVariable int hotel_id, @PathVariable int user_id, @RequestBody Review review) {

		reviewService.setReview(hotel_id, user_id, review);

		return "";
	}

	// this method adds new hotels
	@RequestMapping(value = "/add_hotel", method = RequestMethod.POST)
	@ResponseBody
	public String addHotel(@RequestBody HotelEntity hotel) {
		hotelService.saveHotel(hotel);
		return "hotel is registered";
	}

	// this method updates hotel information
	@RequestMapping(value = "/update_hotel/{hotel_id}", method = RequestMethod.PUT)
	@ResponseBody
	public void updateHotelDetails(@PathVariable int hotel_id, @RequestBody Hotel hotel) {
		hotelService.updateHotelDetails(hotel_id, hotel);
	}

	// this method deletes review
	@RequestMapping(value = "/delete_review/{review_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReview(@PathVariable int review_id) {
		reviewService.deleteReview(review_id);

	}

	// this hotel deletes hotel informatin
	@RequestMapping(value = "/delete_hotel/{hotel_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHotelInformation(@PathVariable int hotel_id) {

		hotelService.deleteHotel(hotel_id);
	}

}
