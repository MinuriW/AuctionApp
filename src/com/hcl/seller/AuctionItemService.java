package com.hcl.seller;

import java.io.InputStream;

public interface AuctionItemService {
	
	// This method is used to submit an item for auction
	public Boolean submitAuctionItem(
			Integer userId,
			String title, 
			String condition, 
			Integer timePeriod,
			Double startingPrice,
			InputStream photoStream );
}
