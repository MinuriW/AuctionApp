package com.hcl.seller.dao;

import java.sql.Timestamp;

public interface AuctionItemDAO {
	public Boolean insertAuctionItem(
			String title, 
			String condition, 
			Timestamp startDate,
			Timestamp endDate,
			Double startingPrice,
			String photoURL );
}
