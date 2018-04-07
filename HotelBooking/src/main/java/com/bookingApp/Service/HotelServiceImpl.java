package com.bookingApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Model.Hotel;
import com.bookingApp.Repository.HotelRepository;
import com.bookingApp.Repository.SearchRepository;

@Service("hotelServiceImpl")
public class HotelServiceImpl implements HotelServiceInterface {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public void saveHotel(HotelEntity hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public void updateHotelDetails(int hotel_id ,Hotel hotel) {
		
		hotelRepository.updateHotel(hotel_id, hotel.getHotelName(), hotel.getCity(), hotel.getRoomsNumber(),
			hotel.getStars(), hotel.getIsWifiAvailable(), hotel.getIsresturentAvailable()
			,hotel.getIsAirconditioned(), hotel.getIsMealAvailable());
		
		
	}
//this method deletes hotel 
	@Override
	public void deleteHotel(int hotel_id) {
		hotelRepository.delete(hotel_id);
		
	}

}
