package com.bookingApp.Model;

import javax.persistence.Column;

public class Hotel {

	
	String hotelName;
	String city;
	String date;
	int roomsNumber;
	int stars;
	int isWifiAvailable;
	int isresturentAvailable;
	int isAirconditioned;
	int isMealAvailable;
	public Hotel(String hotelName, String city, String date, int roomsNumber, int stars, int isWifiAvailable,
			int isresturentAvailable, int isAirconditioned, int isMealAvailable) {
		
		this.hotelName = hotelName;
		this.city = city;
		this.date = date;
		this.roomsNumber = roomsNumber;
		this.stars = stars;
		this.isWifiAvailable = isWifiAvailable;
		this.isresturentAvailable = isresturentAvailable;
		this.isAirconditioned = isAirconditioned;
		this.isMealAvailable = isMealAvailable;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
