package com.hcl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.controller.exception.InvalidUserException;
import com.hcl.user.domain.User;
import com.hcl.user.service.UserService;
import com.hcl.user.service.UserServiceImpl;


@WebServlet("/AbstractUserServlet")
public abstract class AbstractUserServlet extends HttpServlet {
	
    private UserService userService;
    
    public AbstractUserServlet() {
        super();
        userService = new UserServiceImpl();
    }

	public UserService getUserService() {
		return userService;
	}

	
	public User getSessionUser(HttpServletRequest request) throws InvalidUserException {
		HttpSession session = request.getSession(false);
		
		if(session == null) {
			throw new InvalidUserException();
		}
		
		String username = (String) session.getAttribute("username");
		
		if(username == null) {
			throw new InvalidUserException();
		}
		
		User user = userService.findUser(username);
		
		if(user == null) {
			throw new InvalidUserException();
		}
		
		return user;
	}
	
}
