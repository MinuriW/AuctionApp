package com.hcl.user.service;

import com.hcl.user.dao.UserDAO;
import com.hcl.user.dao.UserDAOImpl;
import com.hcl.user.domain.User;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}
	
	@Override
	public Boolean checkEmail(String email) {
		User user = userDAO.getUserByEmail(email);
		return user==null;
	}
	
	public Boolean signupUser(String username, String firstName, String lastName, String email, String password) {
		return userDAO.insertUser(username, firstName, lastName, email, password);
	}
	
	
	
}
