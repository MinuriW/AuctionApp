package com.hcl.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.hcl.user.domain.User;
import com.hcl.util.DbConnection;
import com.hcl.util.DbConnectionImpl;
import com.hcl.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	//private static final String SELECT_USER_BY_EMAIL = "SELECT * FROM auction_item WHERE email=?";
	//private static final String INSERT_USER = "INSERT INTO \"user\" VALUES (user_id_seq.NEXTVAL, ?, ?, ?, ?)";
	
	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	private DbConnection dbConnection;

	public UserDAOImpl() {
		super();
		dbConnection = new DbConnectionImpl();
	}

	@Override
	public User getUserByEmail(String email) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
        session.beginTransaction();
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("email", email));
        List<User> results = cr.list();
        session.getTransaction().commit();
        
        
        if(results != null && results.size()!=0) {
        	return results.get(0);
        }
        return null;

	}

	@Override
	public Boolean insertUser(User user) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		boolean isSaved = true;

		try {
			session.save(user);
		} catch (HibernateException e) {
			isSaved = false;
		}

		session.getTransaction().commit();
		return isSaved;
	}

}
