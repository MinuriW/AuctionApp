package com.hcl.util;

import java.util.ResourceBundle;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.bidder.domain.Bid;
import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			ResourceBundle rb = ResourceBundle.getBundle("oracle");
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.setProperty("hibernate.connection.url", rb.getString("db.url"));
			cfg.setProperty("hibernate.connection.username", rb.getString("db.username"));
			cfg.setProperty("hibernate.connection.password", rb.getString("db.password"));
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(AuctionItem.class);
			cfg.addAnnotatedClass(Bid.class);

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
