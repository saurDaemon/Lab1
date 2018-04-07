package com.bookingApp.Repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookingApp.Entity.HotelEntity;

@Repository("HotelRepository")
public interface HotelRepository extends JpaRepository<HotelEntity, Integer>{

	
	//this method is used for updating user details
		@Modifying
		@Transactional
	    @Query("UPDATE HotelEntity c SET "
	    		+ "c.hotelName = :hotelName,"
	    		+ "c.city = :city,"
	    		+ "c.roomsNumber=:roomsNumber,"
	    		+ "c.stars=:stars,"
	    		+ "c.isWifiAvailable=:isWifiAvailable,"
	    		+ "c.isresturentAvailable=:isresturentAvailable,"
	    		+ "c.isAirconditioned=:isAirconditioned,"
	    		+ "c.isMealAvailable=:isMealAvailable"
	    		+ " WHERE c.hotelId= :hotelId")
	    int updateHotel(@Param("hotelId") int hotelId,
	    		@Param("hotelName") String hotelName,
	    		@Param("city") String travelling_city,
	    		@Param("roomsNumber") int roomsNumber,
	    		@Param("stars") int stars,
	    		@Param("isWifiAvailable") int isWifiAvailable,
	    		@Param("isresturentAvailable") int isresturentAvailable,
	    		@Param("isAirconditioned") int isAirconditioned,
	    		@Param("isMealAvailable") int isMealAvailable);
		
		//this method to show resulted hotels on searched query
		
		
		@Query("select h from HotelEntity h  where "
				+ "h.city = :city and "
				+ "h.roomsNumber >=:roomsNumber and "
				+ "h.stars >=:stars and "
				+ "h.isWifiAvailable=:isWifiAvailable and "
				+ "h.isresturentAvailable=:isresturentAvailable and "
				+ "h.isAirconditioned=:isAirconditioned and "
				+ "h.isMealAvailable=:isMealAvailable"
				+ " "
				+ "order by h.stars desc")
		
	    public List<HotelEntity> getReleventHotels(
	    		@Param("city") String city,
	    		@Param("roomsNumber") int roomsNumber,
	    		@Param("stars") int stars,
	    		@Param("isWifiAvailable") int isWifiAvailable,
	    		@Param("isresturentAvailable") int isresturentAvailable,
	    		@Param("isAirconditioned") int isAirconditioned,
	    		@Param("isMealAvailable") int isMealAvailable)
	    		;
}
