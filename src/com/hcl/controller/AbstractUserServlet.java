package com.hcl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	
}
