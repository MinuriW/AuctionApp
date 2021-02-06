package com.hcl.seller.dao;


import java.util.List;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public interface AuctionItemDAO {
	public Boolean insertAuctionItem(AuctionItem auctionItem);
	
	public AuctionItem getAuctionItemById(int id);
	
	public List<AuctionItem> getAllAuctionItems();
	
	public List<AuctionItem> getAllSubmittedItems(User user);

}
