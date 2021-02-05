package com.hcl.seller.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.util.HibernateUtil;

public class AuctionItemDAOImpl implements AuctionItemDAO {

	@Override
	public Boolean insertAuctionItem(AuctionItem auctionItem) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Boolean isSaved = true;

		try {
			session.save(auctionItem);
		} catch (HibernateException e) {
			isSaved = false;
		}

		session.getTransaction().commit();

		return isSaved;
	}

	@Override
	public AuctionItem getAuctionItemById(int id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AuctionItem auctionItem = (AuctionItem) session.get(AuctionItem.class, new Integer(id));

		session.getTransaction().commit();

		return auctionItem;
	}

	public List<AuctionItem> getAllAuctionItems() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		String hql = "from AuctionItem order by id asc";
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		List<AuctionItem> list = query.list();
		session.getTransaction().commit();

		return list;

	}

}
