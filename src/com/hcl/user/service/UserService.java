package com.hcl.user.service;

public interface UserService {
	public Boolean checkEmail(String email);
	
	public Boolean signupUser(String username, String firstName, String lastName, String email, String password);
}
