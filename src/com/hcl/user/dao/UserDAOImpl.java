package com.hcl.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hcl.user.domain.User;
import com.hcl.util.DbConnection;
import com.hcl.util.DbConnectionImpl;

public class UserDAOImpl implements UserDAO {

	private static final String SELECT_USER_BY_EMAIL = "SELECT * FROM auction_item WHERE email=?";
	private static final String INSERT_USER = "INSERT INTO \"user\" VALUES (user_id_seq.NEXTVAL, ?, ?, ?, ?)";

	private DbConnection dbConnection;

	public UserDAOImpl() {
		super();
		dbConnection = new DbConnectionImpl();
	}

	@Override
	public User getUserByEmail(String email) {
		Connection con = null;
		PreparedStatement pmt = null;
		ResultSet rs = null;

		User user = null;
		try {
			con = dbConnection.getConnection();
			pmt = con.prepareStatement(SELECT_USER_BY_EMAIL);
			pmt.setString(1, email);
			rs = pmt.executeQuery();

			if (rs.next()) {
				Integer id = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String email1 = rs.getString(4);
				String password = rs.getString(5);

				User u = new User(id, firstName, lastName, email1, password);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		try {
			if (rs != null) {
				rs.close();
			}

			if (pmt != null) {
				pmt.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return user;
	}

	@Override
	public Boolean insertUser(String firstName, String lastName, String email, String password) {
		Connection con = null;
		PreparedStatement pmt = null;

		int affectedRows = 0;
		try {
			con = dbConnection.getConnection();

			pmt = con.prepareStatement(INSERT_USER);

			pmt.setString(1, firstName);
			pmt.setString(2, lastName);
			pmt.setString(3, email);
			pmt.setString(4, password);

			affectedRows = pmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		try {
			if (pmt != null) {
				pmt.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// record created, return true
		if (affectedRows == 1) {
			return true;
		}

		return false;
	}

}
