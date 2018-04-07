package com.bookingApp.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingApp.Entity.UserEntity;
import com.bookingApp.Repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserServiceInterface {
 @Autowired
 UserRepository userRepository;
	
 //this saves the user
	@Override
	public void saveUser(UserEntity user) {
		userRepository.save(user);
	}

	//updating old user
	@Override
	public void updateUser(int user_id, UserEntity user) {
		userRepository.updateUser(user_id,user.getDateOfTravelling(),
				user.getTravellingCity(),user.getPurposeOfTravel(),
				user.getPhone(),user.getAge(),user.getAddress());
		
	}

}
