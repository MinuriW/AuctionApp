package com.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.bidder.domain.Bid;
import com.hcl.bidder.service.BidderService;
import com.hcl.bidder.service.BidderServiceImpl;
import com.hcl.controller.exception.InvalidUserException;
import com.hcl.controller.notification.Notification;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

@WebServlet("/placeBid")
public class PlaceBidServlet extends AbstractAuctionItemServlet {
	
	private BidderService bidderService;
	
	public BidderService getBidderService() {
		return bidderService;
	}
	
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		bidderService = new BidderServiceImpl();
	}



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
			
			// find the item
			AuctionItem auctionItem = getAuctionItemService().getAuctionItemById(auctionItemId);
			
			// place a bid on the item
			Bid bid = getBidderService().placeBid(user, auctionItem, bidAmount);
			
			if(bid != null) {
				auctionItem.setHighestBid(bid);
				Boolean isUpdated = getAuctionItemService().updateHighestBid(auctionItem);
				
				if(isUpdated != null && isUpdated) {
					RequestDispatcher rd = request.getRequestDispatcher("viewAuctionItem");
					request.setAttribute("NOTIFICATION", Notification.SUCCESSFULL_BID);
					
					rd.forward(request, response);
				} else {
					Boolean isCancelled = getBidderService().cancelBid(bid);
					
					if(isCancelled != null && isCancelled) {
						RequestDispatcher rd = request.getRequestDispatcher("viewAuctionItem");
						request.setAttribute("NOTIFICATION", Notification.UNSUCCESSFULL_BID);
						
						rd.forward(request, response);
					} else {
						// TODO: Log system error
						System.out.println("Error: Bid is not cancelled.");
					}
				}
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("viewAuctionItem");
				request.setAttribute("NOTIFICATION", Notification.UNSUCCESSFULL_BID);
				
				rd.forward(request, response);
			}
			
		} else {
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
