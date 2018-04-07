package com.bookingApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookingApp.Entity.ReviewEntity;

@Repository("reviewrepository")
public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {

	
	@Query("select re from ReviewEntity re where re.hotelEntity.hotelId=:hotel_id")
	List<ReviewEntity> getReviews(@Param("hotel_id") int hotel_id);
}
