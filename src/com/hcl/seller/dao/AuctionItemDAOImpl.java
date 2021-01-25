package com.hcl.seller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.util.DbConnection;
import com.hcl.util.DbConnectionImpl;

public class AuctionItemDAOImpl implements AuctionItemDAO {
	private static final String INSERT_AUCTION_ITEM = "INSERT INTO auction_item VALUES( auction_item_id_seq.NEXTVAL, ?, ?, ?, ?, ?, ? )";
	private static final String SELECT_ALL_AUCTIONS = "SELECT * FROM auction_item WHERE end_date > SYSDATE";
	
	private DbConnection dbConnection;

	public AuctionItemDAOImpl() {
		super();
		dbConnection = new DbConnectionImpl();
	}

	@Override
	public Boolean insertAuctionItem(String title, String condition, Timestamp startDate, Timestamp endDate,
			Double startingPrice, String photoURL) {
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

	@Override
	public List<AuctionItem> getAllAuctionItems() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AuctionItem> auctionItems = null;
		
		try {
			con = dbConnection.getConnection();
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(SELECT_ALL_AUCTIONS);
			
			while(rs.next()) {
				
				Integer id = rs.getInt(1);
				String title = rs.getString(2);
				String condition = rs.getString(3);
				Timestamp startDate = rs.getTimestamp(4);
				Timestamp endDate = rs.getTimestamp(5);
				Double startingPrice = rs.getDouble(6);
				String photoURL =rs.getString(7);
				
				AuctionItem auctionItem = new AuctionItem(id, title, condition, startDate, endDate, startingPrice, photoURL);
				
				if(auctionItems == null) {
					auctionItems = new ArrayList<>();
				}
				
				auctionItems.add(auctionItem);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Closing all the Resources
		try {
			if(rs != null) {
				rs.close();
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if(con != null) {
				con.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return auctionItems;
	}

}
