package com.bookingApp.Service;


import java.util.List;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Entity.SearchEntity;

public interface SearchServiceInterface {
	

	public List<HotelEntity> storeSearch(SearchEntity search);
	
}
