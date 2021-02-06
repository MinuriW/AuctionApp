package com.hcl.user.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hcl.user.dao.UserDAO;
import com.hcl.user.dao.UserDAOImpl;
import com.hcl.user.domain.User;

class UserServiceImplTest {
	
	private UserDAO userDAO;
	private UserService userService;
	
	@BeforeEach
	void initDAO() {
		userDAO = new UserDAOImpl();
		userService = new UserServiceImpl();
	}

	@Test
	void testSignInUser() {
		String username = "thomas123";
		String password = "th123er";
		User user = new User(username, "thomas", "hoover", "t.h@gmail.com", password);
		userDAO.insertUser(user);
		
		assertTrue(userService.signInUser(username, password));
		
	}
	
	@Test
	void testFindUser() {
		String username = "thomas123";
		String password = "th123er";
		User user = new User(username, "thomas", "hoover", "t.h@gmail.com", password);
		userDAO.insertUser(user);
		
		User user2 = userService.findUser(username);
		
		assertAll("UserService", 
				()-> assertNotNull(user2),
				() -> assertEquals(username, user2.getUsername()));
	}

}
