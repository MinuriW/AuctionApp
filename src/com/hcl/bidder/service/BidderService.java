package com.hcl.bidder.service;

import com.hcl.bidder.domain.Bid;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public interface BidderService {
	public Bid placeBid(User user, AuctionItem auctionItem, double bid);

	public Boolean cancelBid(Bid bid);
	
}
