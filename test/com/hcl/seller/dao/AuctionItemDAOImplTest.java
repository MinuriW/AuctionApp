package com.hcl.seller.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.dao.UserDAO;
import com.hcl.user.dao.UserDAOImpl;
import com.hcl.user.domain.User;

class AuctionItemDAOImplTest {

	private AuctionItemDAO dao = null;
	private AuctionItem auctionItem = null;
	private UserDAO userDAO = null;
	private String username = "john.hoover";
	private User user = new User(username, "john", "hoover", "john.h@abc.com", "johnH123");
	private boolean isUserInserted = false;

	@BeforeEach
	void initDAO() {
		dao = new AuctionItemDAOImpl();
		userDAO = new UserDAOImpl();

		if (!isUserInserted) {
			userDAO.insertUser(user);
			isUserInserted = true;
		}

		user = userDAO.getUserByUsername(username);

	}

	@Test
	@Disabled
	void testSubmitAuctionItem() {
		String title = "auction item";
		String description = "this is an item for auction";
		String condition = "condition";
		Timestamp startDate = new Timestamp(new Date().getTime());
		Timestamp endDate = new Timestamp(new Date().getTime() + 10000);
		Double startingPrice = 0.1;
		String photoURL = "/path/to/photo";

		auctionItem = new AuctionItem(title, description, condition, startDate, endDate, startingPrice, photoURL, false,
				user);

		assertTrue(dao.insertAuctionItem(auctionItem));

	}

	@Test
	void testGetAllAuctionItems() {
		List<AuctionItem> beforeResult = dao.getAllAuctionItems();
		String title = "auction item";
		String description = "this is an item for auction";
		String condition = "condition";
		Timestamp startDate = new Timestamp(new Date().getTime());
		Timestamp endDate = new Timestamp(new Date().getTime() + 10000);
		Double startingPrice = 0.1;
		String photoURL = "/path/to/photo";
		auctionItem = new AuctionItem(title, description, condition, startDate, endDate, startingPrice, photoURL, false,
				user);
		dao.insertAuctionItem(auctionItem);
		List<AuctionItem> result = dao.getAllAuctionItems();
		assertEquals(beforeResult.size(), result.size() - 1);
	}

	int submittedAuctionItemsSum(List<AuctionItem> items) {
		int sum = 0;
		if (items != null) {
			for (AuctionItem a : items) {
				if (!a.isPublished()) {
					sum += 1;
				}
			}
		}

		return sum;
	}

	@Test
	void testGetAllSubmittedItems() {
		List<AuctionItem> beforeResult = dao.getAllSubmittedItems(user);
		int beforeSum = submittedAuctionItemsSum(beforeResult);
		String title = "auction item";
		String description = "this is an item for auction";
		String condition = "condition";
		Timestamp startDate = new Timestamp(new Date().getTime());
		Timestamp endDate = new Timestamp(new Date().getTime() + 10000);
		Double startingPrice = 0.1;
		String photoURL = "/path/to/photo";
		auctionItem = new AuctionItem(title, description, condition, startDate, endDate, startingPrice, photoURL, false,
				user);
		dao.insertAuctionItem(auctionItem);
		List<AuctionItem> result = dao.getAllSubmittedItems(user);
		int afterSum = submittedAuctionItemsSum(result);
		assertEquals(beforeSum+1, afterSum);
	}
}
