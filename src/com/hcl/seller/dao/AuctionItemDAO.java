package com.hcl.seller.dao;

import java.io.InputStream;
import java.util.Date;

public interface AuctionItemDAO {
	public Boolean insertAuctionItem(
			String title, 
			String condition, 
			Date startDate,
			Double startingPrice,
			InputStream photoStream );
}
