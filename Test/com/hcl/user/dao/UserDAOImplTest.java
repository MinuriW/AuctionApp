package com.hcl.user.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hcl.user.domain.User;

class UserDAOImplTest {
	private UserDAO userDAO = null;
	
	@BeforeEach
	void initDAO() {
		userDAO = new UserDAOImpl();
		
	}

	@Test
	@Disabled
	void testInsertUser() {
		User user = new User("john97","john", "wick", "j.k@gmail.com", "jk123");

		assertTrue(userDAO.insertUser(user));
	}
	
	@Test
	void testGetUserByUsername() {
		String username = "john.w";
		
		User user = new User(username, "john", "wick", "j.w@gmail.com", "jw123");
		
		userDAO.insertUser(user);
		
		User user2 = userDAO.getUserByUsername(username);
		
		assertAll("username", 
				()->assertNotNull(user2), 
				() -> assertEquals(username, user2.getUsername()));
		
		
	}

}