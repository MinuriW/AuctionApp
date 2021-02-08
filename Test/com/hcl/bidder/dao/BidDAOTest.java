package com.hcl.bidder.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hcl.bidder.domain.Bid;
import com.hcl.seller.dao.AuctionItemDAO;
import com.hcl.seller.dao.AuctionItemDAOImpl;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.dao.UserDAO;
import com.hcl.user.dao.UserDAOImpl;
import com.hcl.user.domain.User;

class BidDAOTest {
	
	private UserDAO userDAO;
	private AuctionItemDAO auctionItemDAO;
	private BidDAO bidDAO = null;
	
	private User user = null;
	
	private AuctionItem auctionItem = null;
	
	@BeforeEach
	void initTest() {
		userDAO = new UserDAOImpl();
		auctionItemDAO = new AuctionItemDAOImpl();
		bidDAO = new BidDAOImpl();
		
		if(user == null) {
			user = new User("jax1", "jax", "teller", "jax1.soa.com", "jax123");
			userDAO.insertUser(user);
			user = userDAO.getUserByUsername("jax1");
		}
		
		if(auctionItem == null) {
			auctionItem = new AuctionItem(
					"Awesome Ring", 
					"Old" , 
					"Super cool Viking ring for sale",
					new Timestamp(new Date().getTime()), 
					new Timestamp(new Date().getTime() + 1000 * 60 * 60 * 24 * 3),
					15000.0, "photos/url/path/to/photo", false, user);
			
			auctionItemDAO.insertAuctionItem(auctionItem);
			auctionItem = auctionItemDAO.getAllSubmittedItems(user).get(0);
		}
		
	}
	
	@Test
	void testInsertBid() {
		Bid bid = new  Bid(auctionItem, user, 15001.0);
		
		Bid insertedBid = bidDAO.insertBid(bid);
		
		assertNotNull(insertedBid);
	}

}
