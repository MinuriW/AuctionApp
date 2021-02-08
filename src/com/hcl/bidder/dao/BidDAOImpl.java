package com.hcl.bidder.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.bidder.domain.Bid;
import com.hcl.util.HibernateUtil;

public class BidDAOImpl implements BidDAO {

	@Override
	public Bid insertBid(Bid bid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		Boolean isInserted = true;

		try {
			session.save(bid);
		} catch (HibernateException e) {
			isInserted = false;
		}

		session.getTransaction().commit();

		return isInserted ? bid : null;
	}

	@Override
	public Boolean deleteBid(Bid bid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		Boolean isDeleted = true;

		try {
			session.delete(bid);
		} catch (HibernateException e) {
			isDeleted = false;
		}

		session.getTransaction().commit();

		return isDeleted;
	}

	@Override
	public Bid getBidById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		Bid bid = null;

		try {
			bid = (Bid) session.get(Bid.class, new Integer(id));
		} catch (HibernateException e) {
		}

		session.getTransaction().commit();

		return bid;
	}

}
