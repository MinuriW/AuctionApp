package com.hcl.seller.service;

import java.io.InputStream;

public interface AuctionItemService {
	
	// This method is used to submit an item for auction
	public Boolean submitAuctionItem(
			String title, 
			String condition, 
			Integer timePeriod,
			Double startingPrice,
			InputStream photo );
}
