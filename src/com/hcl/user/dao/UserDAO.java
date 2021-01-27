package com.hcl.user.dao;

import com.hcl.user.domain.User;

public interface UserDAO {
	public User getUserByEmail(String email);
	
	
}
