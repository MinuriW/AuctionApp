package com.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signout")
public class SignoutServlet extends AbstractUserServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getSession().invalidate();
		//UserService userService = getUserService();
		String resourcePath = null;
		resourcePath = "signin.jsp";

		RequestDispatcher rd = request.getRequestDispatcher(resourcePath);
		rd.forward(request, response);
	}

}
