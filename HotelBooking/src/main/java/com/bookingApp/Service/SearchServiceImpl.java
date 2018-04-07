package com.bookingApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Entity.SearchEntity;
import com.bookingApp.Model.Search;
import com.bookingApp.Repository.HotelRepository;
import com.bookingApp.Repository.SearchRepository;

@Service("SearchService")
public class SearchServiceImpl implements SearchServiceInterface{

	@Autowired
	SearchRepository searchRepository;
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public List<HotelEntity> storeSearch(SearchEntity search) {
		//this search query is saved for information gathering
		searchRepository.save(search);
		
		//this searchQuery returns the result
		List<HotelEntity> Hotellist=	hotelRepository.getReleventHotels(
				search.getCity(),
				search.getRoomsRequired(),
				search.getHotelStar(),
				search.getHasWifi()
				,search.getHasRestaurant(),
				search.getHasAirConditioning(),
				search.getMealsIncluded()
				
				);
		
		
		return Hotellist;
		
	}
	

}
