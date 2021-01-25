package com.hcl.seller;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.hcl.seller.dao.AuctionItemDAO;
import com.hcl.seller.dao.AuctionItemDAOImpl;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.seller.util.PhotoManager;
import com.hcl.seller.util.PhotoManagerImpl;

public class AuctionItemServiceImpl implements AuctionItemService {
	private AuctionItemDAO auctionItemDAO;
	private PhotoManager photoManager;

	public AuctionItemServiceImpl(String resourcePath) {
		super();
		auctionItemDAO = new AuctionItemDAOImpl();
		photoManager = new PhotoManagerImpl(resourcePath);
	}

	@Override
	public Boolean submitAuctionItem(String title, String condition, Integer timePeriod,
			Double startingPrice, InputStream photo) {

		Date auctionStart = new Date();
		long milliseconds = auctionStart.getTime();

		milliseconds += (timePeriod * 24 * 60 * 60 * 1000);
		Date auctionEnd = new Date(milliseconds);

		Timestamp startDate = new Timestamp(auctionStart.getTime());
		Timestamp endDate = new Timestamp(auctionEnd.getTime());
		
		String photoURL = photoManager.savePhoto(photo);

		System.out.println(photoURL);
		
		return auctionItemDAO.insertAuctionItem(title, condition, startDate, endDate, startingPrice, photoURL);

	}

	@Override
	public List<AuctionItem> getAllAuctionItems() {
		
		return auctionItemDAO.getAllAuctionItems();
	}

}
