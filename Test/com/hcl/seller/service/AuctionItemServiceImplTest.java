package com.hcl.seller.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hcl.seller.dao.AuctionItemDAO;
import com.hcl.seller.dao.AuctionItemDAOImpl;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.dao.UserDAO;
import com.hcl.user.dao.UserDAOImpl;
import com.hcl.user.domain.User;

public class AuctionItemServiceImplTest {

	private AuctionItemDAO dao = null;
	private AuctionItem auctionItem = null;
	private AuctionItemService service = null;
	private UserDAO userDAO = null;
	private String username = "john.huber";
	private User user = new User(username, "john", "huber", "john.huber@abc.com", "johnH123");
	private boolean isUserInserted = false;

	@BeforeEach
	void initDAO() {
		dao = new AuctionItemDAOImpl();
		userDAO = new UserDAOImpl();
		service = new AuctionItemServiceImpl("service");
		
		if(!isUserInserted) {
			userDAO.insertUser(user);
			isUserInserted = true;
		}
		
		user = userDAO.getUserByUsername(username);
	}

	@Test
	void testGetAllAuctionItems() {
		List<AuctionItem> beforeResult = service.getAllAuctionItems();
		String title = "auction item";
		String description = "this is an item for auction";
		String condition = "condition";
		Timestamp startDate = new Timestamp(new Date().getTime());
		Timestamp endDate = new Timestamp(new Date().getTime() + 10000);
		Double startingPrice = 0.1;
		String photoURL = "/path/to/photo";
		auctionItem = new AuctionItem(title, description, condition, startDate, endDate, startingPrice, photoURL,
				false, user);
		dao.insertAuctionItem(auctionItem);
		List<AuctionItem> result = service.getAllAuctionItems();
		assertEquals(beforeResult.size(), result.size() - 1);
	}
}
