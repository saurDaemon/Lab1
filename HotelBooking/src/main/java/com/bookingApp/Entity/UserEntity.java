package com.bookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	int userId;
	
	@Column(name="user_name")
	String userName;
	@Column(name="native_city")
	String nativeCity;
	@Column(name="travelling_city")
	String travellingCity;
	@Column(name="purpose_of_travel")
	String purposeOfTravel;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="age")
	int age;
	@Column(name="sex")
	int sex;
	@Column(name="address")
	String address;
	@Column(name="phone")
	long phone;
	@Column(name="date_of_travelling")
	String dateOfTravelling;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNativeCity() {
		return nativeCity;
	}
	public void setNativeCity(String nativeCity) {
		this.nativeCity = nativeCity;
	}
	public String getTravellingCity() {
		return travellingCity;
	}
	public void setTravellingCity(String travellingCity) {
		this.travellingCity = travellingCity;
	}
	public String getPurposeOfTravel() {
		return purposeOfTravel;
	}
	public void setPurposeOfTravel(String purposeOfTravel) {
		this.purposeOfTravel = purposeOfTravel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDateOfTravelling() {
		return dateOfTravelling;
	}
	public void setDateOfTravelling(String dateOfTravelling) {
		this.dateOfTravelling = dateOfTravelling;
	}
	
	

}
