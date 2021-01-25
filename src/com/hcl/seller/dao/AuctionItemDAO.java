package com.hcl.seller.dao;

import java.sql.Timestamp;
import java.util.List;

import com.hcl.seller.domain.AuctionItem;

public interface AuctionItemDAO {
	public Boolean insertAuctionItem(
			String title, 
			String condition, 
			Timestamp startDate,
			Timestamp endDate,
			Double startingPrice,
			String photoURL );
	
	public List<AuctionItem> getAllAuctionItems();
}
