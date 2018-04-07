package com.bookingApp.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class ReviewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "review_id")
	int id;
	@Column(name = "comments")
	String comments;
	@Column(name = "star")
	int star;
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	HotelEntity hotelEntity;
	@ManyToOne
	@JoinColumn(name = "user_id")
	UserEntity userEntity;
	@Column(name = "date")
	Date date;

	public Date getDate() {
		return date;
	}

	@PrePersist
	public void setDate() {
		this.date = new Date();
	}

	public ReviewEntity() {
	}

	public ReviewEntity(String comments, int star, HotelEntity hotelEntity, UserEntity userEntity) {
		this.comments = comments;
		this.star = star;
		this.hotelEntity = hotelEntity;
		this.userEntity = userEntity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public HotelEntity getHotelEntity() {
		return hotelEntity;
	}

	public void setHotelEntity(HotelEntity hotelEntity) {
		this.hotelEntity = hotelEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

}
