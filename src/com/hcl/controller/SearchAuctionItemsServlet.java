package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.seller.AuctionItemService;
import com.hcl.seller.domain.AuctionItem;

/**
 * Servlet implementation class SearchAuctionItemsServlet
 */
@WebServlet("/searchAuctionItems")
public class SearchAuctionItemsServlet extends AbstractAuctionItemServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titleToSearch = request.getParameter("title");
		
		AuctionItemService auctionItemService = getAuctionItemService();
		
		List<AuctionItem> auctionItems = auctionItemService.getAuctionItemsByTitle(titleToSearch);
		
		// TODO: Send Response to AJAX request
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
