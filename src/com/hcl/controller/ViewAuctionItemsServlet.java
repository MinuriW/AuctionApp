package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.seller.service.AuctionItemService;

@WebServlet("/viewAuctionItems")
public class ViewAuctionItemsServlet extends AbstractAuctionItemServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AuctionItemService auctionItemService = getAuctionItemService();
	
		List<AuctionItem> items = auctionItemService.getAllAuctionItems();
		request.setAttribute("itemlist", items);

		RequestDispatcher rd = request.getRequestDispatcher("viewAuctionItems.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
