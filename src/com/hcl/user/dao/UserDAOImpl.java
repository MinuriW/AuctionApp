package com.hcl.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hcl.user.domain.User;
import com.hcl.util.DbConnection;
import com.hcl.util.DbConnectionImpl;
import com.hcl.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	//private static final String SELECT_USER_BY_EMAIL = "SELECT * FROM auction_item WHERE email=?";
	//private static final String INSERT_USER = "INSERT INTO \"user\" VALUES (user_id_seq.NEXTVAL, ?, ?, ?, ?)";
	SessionFactory sessionFactory = HibernateUtil.geSessionFactory();
	private DbConnection dbConnection;

	public UserDAOImpl() {
		super();
		dbConnection = new DbConnectionImpl();
	}

	@Override
	public User getUserByEmail(String email) {
		Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user=(User)session.get(User.class,email);
        session.getTransaction().commit();
        return user;


	}

	@Override
	public Boolean insertUser(String username, String firstName, String lastName, String email, String password) {


		Session session = sessionFactory.openSession();

		session.beginTransaction();

		boolean isSaved = true;

		try {
			session.save(email);
		} catch (HibernateException e) {
			isSaved = false;
		}

		session.getTransaction().commit();

		return isSaved;
	}

}
