package com.bookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="search")
public class SearchEntity {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="search_id")
	int id;
	@Column(name="city")
	String city;
	@Column(name="date")
	String date;
	@Column(name="roomsRequired")
	int roomsRequired;
	@Column(name="travellers")
	int travellers;
	@Column(name="hotelStar")
	int hotelStar;
	@Column(name="hasWifi")
	int hasWifi;
	@Column(name="hasRestaurant")
	int hasRestaurant;
	@Column(name="hasAirConditioning")
	int hasAirConditioning;
	@Column(name="mealsIncluded")
	int mealsIncluded;
	
	
	
	
	public SearchEntity(String city, String date, int roomsRequired, int travellers, int hotelStar, int hasWifi,
			int hasRestaurant, int hasAirConditioning, int mealsIncluded) {
		super();
		this.city = city;
		this.date = date;
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
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
