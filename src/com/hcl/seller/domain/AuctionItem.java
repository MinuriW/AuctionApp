package com.hcl.seller.domain;

import java.sql.Timestamp;

public class AuctionItem {
	private Integer id;
	private String title;
	private String condition;
	private Timestamp startDate;
	private Timestamp endDate;
	private Double startingPrice;
	private String photoURL;

	public AuctionItem() {
		super();
	}

	public AuctionItem(Integer id, String title, String condition, Timestamp startDate, Timestamp endDate,
			Double startingPrice, String photoURL) {
		super();
		this.id = id;
		this.title = title;
		this.condition = condition;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startingPrice = startingPrice;
		this.photoURL = photoURL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Double getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(Double startingPrice) {
		this.startingPrice = startingPrice;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

}
