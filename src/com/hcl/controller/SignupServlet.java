package com.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.user.service.UserService;

@WebServlet("/signup")
public class SignupServlet extends AbstractUserServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserService userService = getUserService();

		Boolean isValidEmail = userService.checkEmail(email);

		if (isValidEmail) {
			Boolean isSignedUp = userService.signupUser(username, firstName, lastName, email, password);

			if (isSignedUp) {
				RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
				rs.forward(request, response);
			}
			else {
		        RequestDispatcher rs = request.getRequestDispatcher("signup.jsp");
		        rs.include(request, response);	
			}

		} 
		else {
			RequestDispatcher rs = request.getRequestDispatcher("signup.jsp");
	        rs.include(request, response);		
		}

	}

}
