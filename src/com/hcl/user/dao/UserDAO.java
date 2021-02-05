package com.hcl.user.dao;

import com.hcl.user.domain.User;

public interface UserDAO {
	public User getUserByEmail(String email);
	
	//public Boolean insertUser(String username, String firstName, String lastName, String email, String password); 
	public Boolean insertUser(User user);
	
	public User getUserByUsername(String username);
	
}
