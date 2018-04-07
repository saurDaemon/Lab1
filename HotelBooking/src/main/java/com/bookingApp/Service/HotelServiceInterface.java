package com.bookingApp.Service;

import com.bookingApp.Entity.HotelEntity;
import com.bookingApp.Model.Hotel;

public interface HotelServiceInterface {
	public void saveHotel(HotelEntity hotel);
	
	public void updateHotelDetails(int Hotel_id,Hotel hotel);
	
	public void deleteHotel(int hotel_id);

}
