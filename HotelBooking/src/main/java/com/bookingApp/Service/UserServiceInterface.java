package com.bookingApp.Service;

import com.bookingApp.Entity.UserEntity;
import com.bookingApp.Model.User;

public interface UserServiceInterface {
	//adding new user
	public void saveUser(UserEntity userEntity);
	
	//updatating new user
	
	public void updateUser(int user_id,UserEntity user);

}
