package com.hcl.seller.service;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.hcl.seller.dao.AuctionItemDAO;
import com.hcl.seller.dao.AuctionItemDAOImpl;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.seller.util.PhotoManager;
import com.hcl.seller.util.PhotoManagerImpl;
import com.hcl.user.domain.User;

public class AuctionItemServiceImpl implements AuctionItemService {
	private AuctionItemDAO auctionItemDAO;
	private PhotoManager photoManager;

	public AuctionItemServiceImpl(String resourcePath) {
		super();
		auctionItemDAO = new AuctionItemDAOImpl();
		photoManager = new PhotoManagerImpl(resourcePath);
	}

	@Override
	public Boolean submitAuctionItem(User user, String title, String description, String condition, Integer timePeriod,
			Double startingPrice, InputStream photo) {

		Date auctionStart = new Date();
		long milliseconds = auctionStart.getTime();

		milliseconds += (timePeriod * 24 * 60 * 60 * 1000);
		Date auctionEnd = new Date(milliseconds);

		Timestamp startDate = new Timestamp(auctionStart.getTime());
		Timestamp endDate = new Timestamp(auctionEnd.getTime());
		
		String photoURL = photoManager.savePhoto(photo);

		AuctionItem auctionItem = new AuctionItem(
				title, 
				description, 
				condition, 
				startDate, 
				endDate, 
				startingPrice, 
				photoURL, 
				false, 
				user);
		
		return auctionItemDAO.insertAuctionItem(auctionItem);

	}

	@Override
	public List<AuctionItem> getAllAuctionItems() {
		
		return auctionItemDAO.getAllAuctionItems();
	}
	
	

}
