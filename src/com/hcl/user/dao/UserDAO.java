package com.hcl.user.dao;

import com.hcl.user.domain.User;

public interface UserDAO {
	public User getUserByEmail(String email);
	
	public Boolean insertUser(String firstName, String lastName, String email, String password); 
	
	
}
