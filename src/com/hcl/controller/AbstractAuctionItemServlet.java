package com.hcl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.seller.service.AuctionItemService;
import com.hcl.seller.service.AuctionItemServiceImpl;

/**
 * Servlet implementation class AbstractAuctionItemServlet
 */
@WebServlet("/abstractAuctionItem")
public abstract class AbstractAuctionItemServlet extends HttpServlet {
	private AuctionItemService auctionItemService;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		String resourcePath = getServletContext().getRealPath("");
		auctionItemService = new AuctionItemServiceImpl(resourcePath);
	}

	public AuctionItemService getAuctionItemService() {
		return auctionItemService;
	}
	
	

}
