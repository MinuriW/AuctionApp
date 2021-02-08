package com.hcl.bidder.dao;

import com.hcl.bidder.domain.Bid;

public interface BidDAO {
	public Bid insertBid(Bid bid);

	public Boolean deleteBid(Bid bid);
	
	public Bid getBidById(int id);
}
