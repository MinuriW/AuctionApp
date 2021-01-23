package com.hcl.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.seller.AuctionItemService;
import com.hcl.seller.AuctionItemServiceImpl;

@WebServlet("/submitAuctionItem")
public class SubmitAuctionItemServlet extends HttpServlet {
	private AuctionItemService auctionItemService;
	
	public SubmitAuctionItemServlet() {
		super();
		auctionItemService = new AuctionItemServiceImpl();
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Has a valid User Session
		HttpSession session = request.getSession(false);
		
		
		if(session != null) {
			Integer userId = (Integer) session.getAttribute("userId");
			// Get Form Data From Request 
			String title = request.getParameter("title");
			String condition = request.getParameter("condition");
			Integer timePeriod = Integer.parseInt(request.getParameter("timePeriod"));
			Double startingPrice = Double.parseDouble(request.getParameter("startingPrice"));
			InputStream photoStream = request.getPart("photo").getInputStream();
			
			Boolean isInserted = auctionItemService.submitAuctionItem(userId, title, condition, timePeriod, startingPrice, photoStream);
			
			if(isInserted) {
				// TODO: Send Success Message
				RequestDispatcher rd = request.getRequestDispatcher("auctionItems.jsp");
				rd.forward(request, response);
			} else {
				// TODO: Error Message
				RequestDispatcher rd = request.getRequestDispatcher("submitAuctionItem.jsp");
				rd.forward(request, response);
			}
			
			
		} else { // Session Expired
			// Dispatch to SignIn page
			
			RequestDispatcher rd = request.getRequestDispatcher("signIn.jsp");
			rd.forward(request, response);
		}
		
	}

}
