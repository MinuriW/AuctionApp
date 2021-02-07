package com.hcl.bidder.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hcl.seller.domain.AuctionItem;
import com.hcl.user.domain.User;

@Entity
@Table(name = "bid")
public class Bid {
	@Id
	@SequenceGenerator(name = "bid_seq", sequenceName = "bid_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bid_seq")
	@Column
	private int id;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "auction_item_id")
	private AuctionItem auctionItem;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "auction_user_id")
	private User user;

	public Bid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bid(AuctionItem auctionItem, User user) {
		super();
		this.auctionItem = auctionItem;
		this.user = user;
	}

	public Bid(int id, AuctionItem auctionItem, User user) {
		super();
		this.id = id;
		this.auctionItem = auctionItem;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AuctionItem getAuctionItem() {
		return auctionItem;
	}

	public void setAuctionItem(AuctionItem auctionItem) {
		this.auctionItem = auctionItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
