package com.hcl.seller.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hcl.seller.domain.AuctionItem;

class AuctionItemDAOImplTest {
	
	private AuctionItemDAO dao = null;
	private AuctionItem auctionItem = null; 
	
	@BeforeEach
	void initDAO() {
		dao = new AuctionItemDAOImpl();
		
	}

	@Test
	void testSubmitAuctionItem() {
		String title = "auction item";
		String description = "this is an item for auction";
		String condition = "condition";
		Timestamp startDate = new Timestamp(new Date().getTime());
		Timestamp endDate = new Timestamp(new Date().getTime() +  10000);
		Double startingPrice = 0.1;
		String photoURL = "/path/to/photo";
		auctionItem = new AuctionItem(title, description, condition, startDate, endDate, startingPrice, photoURL);
		
		assertTrue(dao.insertAuctionItem(auctionItem));
		
	}

}
