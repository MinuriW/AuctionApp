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
		User user = new User(username, firstName, lastName, email, password);
		return userDAO.insertUser(user);
	}

	@Override
	public Boolean signInUser(String username, String password) {
		
		User user = userDAO.getUserByUsername(username);
		
		if(user != null && user.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

	@Override
	public User findUser(String username) {
		
		return userDAO.getUserByUsername(username);
	}
	
	
	
	
	
}
