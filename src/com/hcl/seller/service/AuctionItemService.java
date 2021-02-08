package com.hcl.seller.service;

import java.io.InputStream;
import java.util.List;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public interface AuctionItemService {
	
	// This method is used to submit an item for auction
	public Boolean submitAuctionItem(
			User user,
			String title,
			String description,
			String condition, 
			Integer timePeriod,
			Double startingPrice,
			InputStream photo );
	
	public List<AuctionItem> getAllAuctionItems();
	
	public List<AuctionItem> getAllSubmittedItems(User user);

	public AuctionItem getAuctionItemById(int Id);

	public Boolean updateHighestBid(AuctionItem auctionItem);
	
}


