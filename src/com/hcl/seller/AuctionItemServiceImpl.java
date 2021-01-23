package com.hcl.seller;

import java.io.InputStream;

public class AuctionItemServiceImpl implements AuctionItemService {

	@Override
	public Boolean submitAuctionItem(
			Integer userId, 
			String title, 
			String condition, 
			Integer timePeriod,
			Double startingPrice, 
			InputStream photoStream) {
		
		return null;
		
	}

	

}
