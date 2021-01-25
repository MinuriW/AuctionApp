package com.hcl.seller;

import java.io.InputStream;
import java.util.List;

import com.hcl.seller.domain.AuctionItem;

public interface AuctionItemService {
	
	// This method is used to submit an item for auction
	public Boolean submitAuctionItem(
			String title, 
			String condition, 
			Integer timePeriod,
			Double startingPrice,
			InputStream photo );
	
	public List<AuctionItem> getAllAuctionItems();
}