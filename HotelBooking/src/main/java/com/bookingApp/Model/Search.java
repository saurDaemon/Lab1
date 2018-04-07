package com.bookingApp.Model;

public class Search {
	String city;
	String Date;
	int roomsRequired;
	int travellers;
	int hotelStar;
	int hasWifi;
	int hasRestaurant;
	int hasAirConditioning;
	int mealsIncluded;
	
	
	
	public Search(String city, String date, int roomsRequired, int travellers, int hotelStar, int hasWifi,
			int hasRestaurant, int hasAirConditioning, int mealsIncluded) {
		this.city = city;
		Date = date;
		this.roomsRequired = roomsRequired;
		this.travellers = travellers;
		this.hotelStar = hotelStar;
		this.hasWifi = hasWifi;
		this.hasRestaurant = hasRestaurant;
		this.hasAirConditioning = hasAirConditioning;
		this.mealsIncluded = mealsIncluded;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getRoomsRequired() {
		return roomsRequired;
	}
	public void setRoomsRequired(int roomsRequired) {
		this.roomsRequired = roomsRequired;
	}
	public int getTravellers() {
		return travellers;
	}
	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}
	public int getHotelStar() {
		return hotelStar;
	}
	public void setHotelStar(int hotelStar) {
		this.hotelStar = hotelStar;
	}
	public int getHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(int hasWifi) {
		this.hasWifi = hasWifi;
	}
	public int getHasRestaurant() {
		return hasRestaurant;
	}
	public void setHasRestaurant(int hasRestaurant) {
		this.hasRestaurant = hasRestaurant;
	}
	public int getHasAirConditioning() {
		return hasAirConditioning;
	}
	public void setHasAirConditioning(int hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}
	public int getMealsIncluded() {
		return mealsIncluded;
	}
	public void setMealsIncluded(int mealsIncluded) {
		this.mealsIncluded = mealsIncluded;
	}
	
	
	

}
