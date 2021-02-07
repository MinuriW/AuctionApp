package com.hcl.bidder.service;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public interface BidderService {
	public Boolean placeBid(User user, AuctionItem auctionItem, double bid);
}
