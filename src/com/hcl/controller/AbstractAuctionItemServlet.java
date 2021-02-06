package com.hcl.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import com.hcl.seller.service.AuctionItemService;
import com.hcl.seller.service.AuctionItemServiceImpl;

@WebServlet("/abstractAuctionItem")
public abstract class AbstractAuctionItemServlet extends AbstractUserServlet {
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
