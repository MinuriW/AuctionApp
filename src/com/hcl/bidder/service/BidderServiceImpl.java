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
	public Bid placeBid(User user, AuctionItem auctionItem, double amount) {
		
		Bid currentBid = auctionItem.getHighestBid();
		
		Bid bid = null;
		Bid insertedBid = null;
		if(currentBid == null) {
			bid = new Bid(auctionItem, user, amount);
			insertedBid = bidDAO.insertBid(bid);
		} else if (amount > currentBid.getAmount()) {
			bid = new Bid(auctionItem, user, amount);
			insertedBid = bidDAO.insertBid(bid);
		}
		
		return insertedBid;
	}

	@Override
	public Boolean cancelBid(Bid bid) {
		// TODO Auto-generated method stub
		return bidDAO.deleteBid(bid);
	}

}
