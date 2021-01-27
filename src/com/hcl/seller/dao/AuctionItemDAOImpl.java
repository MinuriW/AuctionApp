package com.hcl.seller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.hcl.util.DbConnection;
import com.hcl.util.DbConnectionImpl;

public class AuctionItemDAOImpl implements AuctionItemDAO {
	private static int id = 1;
	private static final String INSERT_AUCTION_ITEM = "INSERT INTO auction_item VALUES( auction_item_id_seq.NEXTVAL, ?, ?, ?, ?, ?, ? )";
	
	private DbConnection dbConnection;
	
	
	
	public AuctionItemDAOImpl() {
		super();
		dbConnection = new DbConnectionImpl();
	}



	@Override
	public Boolean insertAuctionItem(String title, String condition, Timestamp startDate, Timestamp endDate, Double startingPrice,
			String photoURL) {
		Connection con = null;
		PreparedStatement pmt = null;
		
		int affectedRows = 0;
		try {
			con = dbConnection.getConnection();
			
			pmt = con.prepareStatement(INSERT_AUCTION_ITEM);
			
			pmt.setString(1, title);
			pmt.setString(2, condition);
			pmt.setTimestamp(3, startDate);
			pmt.setTimestamp(4, endDate);
			pmt.setDouble(5, startingPrice);
			pmt.setString(6, photoURL);
			
			affectedRows = pmt.executeUpdate();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		try {
			if(pmt != null) {
				pmt.close();
			}
			
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		// record created, return true
		if(affectedRows == 1) {
			return true;
		}
		
		return false;
	}

	

}
