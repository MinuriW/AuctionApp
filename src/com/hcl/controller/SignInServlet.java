package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.controller.notification.Notification;
import com.hcl.user.service.UserService;

@WebServlet(name = "signIn", urlPatterns = { "/signIn" })
public class SignInServlet extends AbstractUserServlet {

	private static final int SESSION_INTERVAL = 5 * 60; // Five minutes in seconds
	private static final String SIGNIN_ERROR = "SIGNIN_ERROR";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Check for incoming errors
		Notification error = (Notification) request.getAttribute("ERROR");
		if (error != null) {
			doGet(request, response);
		} else {
			// Invalidate any previous sessions
			request.getSession().invalidate();

			String username = request.getParameter("username");
			String password = request.getParameter("password");

			UserService userService = getUserService();

			Boolean isSignedIn = userService.signInUser(username, password);

			String resourcePath = null;

			if (isSignedIn) {

				// create a session and set username as attribute
				HttpSession httpSession = request.getSession();
				httpSession.setMaxInactiveInterval(SESSION_INTERVAL);
				httpSession.setAttribute("username", username);

				// set resource path to auctionItems.jsp
				resourcePath = "viewAuctionItems";

			} else { // forward to sign in
				request.setAttribute(SIGNIN_ERROR, true);
				resourcePath = "signin.jsp";
			}

			RequestDispatcher rd = request.getRequestDispatcher(resourcePath);
			rd.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
		rd.forward(request, response);
	}

}
