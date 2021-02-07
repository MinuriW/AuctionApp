package com.hcl.bidder.service;

import com.hcl.bidder.dao.BidDAO;
import com.hcl.bidder.dao.BidDAOImpl;
import com.hcl.bidder.domain.Bid;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public class BidderServiceImpl implements BidderService {
	
	private BidDAO bidDAO;

	public BidderServiceImpl() {
		super();
		bidDAO = new BidDAOImpl();
	}

	@Override
	public Boolean placeBid(User user, AuctionItem auctionItem, double amount) {
		Bid bid = new Bid(auctionItem, user, amount);
		return bidDAO.insertBid(bid);
	}

}
