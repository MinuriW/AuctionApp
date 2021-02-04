package com.hcl.seller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.util.HibernateUtil;

public class AuctionItemDAOImpl implements AuctionItemDAO {

	@Override
	public Boolean insertAuctionItem(AuctionItem auctionItem) {
		
		return false;
	}

	@Override
	public AuctionItem getAuctionItemById(int id) {
		SessionFactory sessionFactory = HibernateUtil.geSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		AuctionItem auctionItem = (AuctionItem) session.get(AuctionItem.class, new Integer(id));
		
		session.getTransaction().commit();
		
		return auctionItem;
	}

	

}
