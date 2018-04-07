package com.bookingApp.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class HotelEntity {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hotel_id")
	int hotelId;
	@Column(name="hotel_name")
	String hotelName;
	@Column(name="city")
	String city;
	@Column(name="rooms_number")
	int roomsNumber;
	@Column(name="stars")
	int stars;
	@Column(name="is_wifi_available")
	int isWifiAvailable;
	@Column(name="is_resturent_available")
	int isresturentAvailable;
	@Column(name="is_air_conditioned")
	int isAirconditioned;
	@Column(name="is_meal_available")
	int isMealAvailable;
	
	@Column(name="date")
	Date date;
	
	

	public Date getDate() {
		return date;
	}
    @PrePersist
	public void setDate() {
		this.date = new Date();
	}

	public HotelEntity() {}
	
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public HotelEntity(String hotelName, String city, int roomsNumber, int stars, int isWifiAvailable,
			int isresturentAvailable, int isAirconditioned, int isMealAvailable) {
		this.hotelName = hotelName;
		this.city = city;
		this.roomsNumber = roomsNumber;
		this.stars = stars;
		this.isWifiAvailable = isWifiAvailable;
		this.isresturentAvailable = isresturentAvailable;
		this.isAirconditioned = isAirconditioned;
		this.isMealAvailable = isMealAvailable;
		//this.totalTravellers=totalTravellers;
	}
	
	
	public int getHotelId() {
		return hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getRoomsNumber() {
		return roomsNumber;
	}
	public void setRoomsNumber(int roomsNumber) {
		this.roomsNumber = roomsNumber;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public int getIsWifiAvailable() {
		return isWifiAvailable;
	}
	public void setIsWifiAvailable(int isWifiAvailable) {
		this.isWifiAvailable = isWifiAvailable;
	}
	public int getIsresturentAvailable() {
		return isresturentAvailable;
	}
	public void setIsresturentAvailable(int isresturentAvailable) {
		this.isresturentAvailable = isresturentAvailable;
	}
	public int getIsAirconditioned() {
		return isAirconditioned;
	}
	public void setIsAirconditioned(int isAirconditioned) {
		this.isAirconditioned = isAirconditioned;
	}
	public int getIsMealAvailable() {
		return isMealAvailable;
	}
	public void setIsMealAvailable(int isMealAvailable) {
		this.isMealAvailable = isMealAvailable;
	}
	
	
	

}
