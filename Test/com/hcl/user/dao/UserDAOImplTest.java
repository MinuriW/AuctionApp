package com.hcl.user.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hcl.user.domain.User;

class UserDAOImplTest {

	@Test
	void testInsertUser() {
		User user = new User("john97","john", "wick", "j.k@gmail.com", "jk123");

		UserDAO dao = new UserDAOImpl();
		assertTrue(dao.insertUser(user));
	}

}