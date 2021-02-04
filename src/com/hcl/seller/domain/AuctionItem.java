package com.hcl.seller.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="auction_item")
public class AuctionItem {
	@Id
	@SequenceGenerator(name="auction_item_seq", sequenceName="auction_item_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="auction_item_seq")
	private int id;
	@Column
	private String title;
	@Column
	private String condition;
	@Column
	private Timestamp startDate;
	@Column
	private Timestamp endDate;
	@Column
	private Double startingPrice;
	@Column
	private String photoURL;

	public AuctionItem(int id, String title, String condition, Timestamp startDate, Timestamp endDate,
			Double startingPrice, String photoURL) {
		this(title, condition, startDate, endDate, startingPrice, photoURL);
		this.id = id;
	}

	public AuctionItem(String title, String condition, Timestamp startDate, Timestamp endDate, Double startingPrice,
			String photoURL) {
		super();
		this.title = title;
		this.condition = condition;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startingPrice = startingPrice;
		this.photoURL = photoURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AuctionItem() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
