package com.hcl.bidder.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.bidder.domain.Bid;
import com.hcl.util.HibernateUtil;

public class BidDAOImpl implements BidDAO {

	@Override
	public Boolean insertBid(Bid bid) {
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
		
		return isInserted;
	}

}
