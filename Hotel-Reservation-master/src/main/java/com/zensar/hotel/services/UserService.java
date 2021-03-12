package com.zensar.hotel.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zensar.hotel.entity.User;
import com.zensar.hotel.temp.CurrentUser;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();
}
