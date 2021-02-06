package com.hcl.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.hcl.controller.exception.InvalidUserException;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.seller.service.AuctionItemService;
import com.hcl.user.domain.User;

@WebServlet("/viewSubmittedItems")
public class ViewSubmittedItemsServlet extends AbstractAuctionItemServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = null;
		boolean isContinueTransaction = true;
		
		try {
			user = getSessionUser(request);
			
		}

		catch (InvalidUserException e) {
			isContinueTransaction = false;
		}
		
		if(isContinueTransaction) {
			AuctionItemService auctionItemService = getAuctionItemService();
			List<AuctionItem> items = auctionItemService.getAllSubmittedItems(user);
			request.setAttribute("itemlist", items);

			RequestDispatcher rd = request.getRequestDispatcher("viewSubmittedItems.jsp");
			rd.forward(request, response);
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

		

		
	}

}
