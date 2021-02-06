package com.hcl.user.service;

import com.hcl.user.domain.User;

public interface UserService {
	public Boolean checkEmail(String email);
	
	public Boolean signupUser(String username, String firstName, String lastName, String email, String password);
	
	public Boolean signInUser(String username, String password);
	
	public User findUser(String username);
}
