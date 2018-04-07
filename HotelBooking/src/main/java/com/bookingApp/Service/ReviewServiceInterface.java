package com.bookingApp.Service;

import java.util.List;

import com.bookingApp.Entity.ReviewEntity;
import com.bookingApp.Model.Review;

public interface ReviewServiceInterface {
	
	public void setReview(int hotel_id,int user_id,Review review);
	
	public void deleteReview(int review_id);
	
	public List<ReviewEntity> seeReviews(int hotel_id);

}
