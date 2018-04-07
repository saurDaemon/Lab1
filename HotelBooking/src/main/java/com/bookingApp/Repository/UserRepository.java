package com.bookingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookingApp.Entity.UserEntity;
import com.bookingApp.Model.User;

@Repository("userRepository")
public interface UserRepository  extends JpaRepository<UserEntity, Integer>{
	//this method is used for updating user details
	@Modifying
	@Transactional
    @Query("UPDATE UserEntity c SET c.dateOfTravelling = :date_of_travelling,"
    		+ "c.travellingCity = :travelling_city,c.purposeOfTravel=:purpose_of_travel,"
    		+ "c.phone=:phone,c.age=:age,c.address=:address WHERE c.userId= :user_id")
    int updateUser(@Param("user_id") int user_id, @Param("date_of_travelling") String date_of_travelling,
    		@Param("travelling_city") String travelling_city,@Param("purpose_of_travel") String purpose_of_travel,
    		@Param("phone") long phone,@Param("age") int age,
    		@Param("address") String address);

}
