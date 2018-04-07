package com.bookingApp.Service;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Entity.ReviewEntity;
import com.bookingApp.Entity.UserEntity;
import com.bookingApp.Model.Review;
import com.bookingApp.Repository.ReviewRepository;
import com.bookingApp.Repository.UserRepository;

import net.minidev.json.JSONArray;

@Service("reviewServiceImpl")
public class ReviewServiceImpl implements ReviewServiceInterface {

	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	 UserRepository userRepository;
	
	@Override
	public void setReview(int hotel_id,int user_id,Review review) {
		
		ReviewEntity reviewEntity=new ReviewEntity();
		
		HotelEntity hotel=new HotelEntity();
		hotel.setHotelId(hotel_id);
		UserEntity user=new UserEntity();
		user.setUserId(user_id);
		
		reviewEntity.setHotelEntity(hotel);
		reviewEntity.setUserEntity(user);
		reviewEntity.setComments(review.getComments());
		reviewEntity.setStar(review.getRating());
		reviewRepository.save(reviewEntity);
		
	}

	@Override
	public void deleteReview(int review_id) {
		reviewRepository.delete(review_id);		
	}

	@Override
	public List<ReviewEntity> seeReviews(int hotel_id) {
		List<ReviewEntity> list=reviewRepository.getReviews(hotel_id);
		
		return list;
	}

}
