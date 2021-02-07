package com.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.controller.exception.InvalidUserException;
import com.hcl.controller.notification.Notification;
import com.hcl.user.domain.User;

@WebServlet("/placeBid")
public class PlaceBidServlet extends AbstractAuctionItemServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = null;
		boolean isContinueTransaction = true;

		try {
			user = getSessionUser(request);
		} catch (InvalidUserException e) {
			isContinueTransaction = false;
		}

		if (isContinueTransaction) {
			int auctionItemId = Integer.parseInt(request.getParameter("id"));
			double bidAmount = Double.parseDouble(request.getParameter("amount"));
		} else {
			System.out.println("Invalid User");
			RequestDispatcher rd = request.getRequestDispatcher("signIn");
			request.setAttribute("ERROR", Notification.INVALID_USER);
			
			rd.forward(request, response);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

}
