package com.hcl.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.controller.exception.InvalidUserException;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.seller.service.AuctionItemService;
import com.hcl.user.domain.User;

@WebServlet("/viewAuctionItem")
public class ViewAuctionItemServlet extends AbstractAuctionItemServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		User user = null;
		Boolean isContinueTransaction = true;
		try {
			user = getSessionUser(request);

		} catch (InvalidUserException e) {
			isContinueTransaction = false;
		}

		if (isContinueTransaction) {
			AuctionItemService auctionItemService = getAuctionItemService();

			int id = Integer.parseInt(request.getParameter("id"));
			AuctionItem item = auctionItemService.getAuctionItemById(id);
			request.setAttribute("item", item);

			RequestDispatcher rd = request.getRequestDispatcher("viewItem.jsp");
			rd.forward(request, response);

		} else {
			// User is not signed in
			RequestDispatcher rd = request.getRequestDispatcher("signIn");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
