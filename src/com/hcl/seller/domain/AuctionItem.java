package com.hcl.seller.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hcl.user.domain.User;

@Entity
@Table(name = "auction_item")
public class AuctionItem {
	@Id
	@SequenceGenerator(name = "auction_item_seq", sequenceName = "auction_item_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auction_item_seq")
	private int id;
	@Column
	private String title;
	@Column
	private String condition;
	@Column
	private String description;
	@Column
	private Timestamp startDate;
	@Column
	private Timestamp endDate;
	@Column
	private Double startingPrice;
	@Column
	private String photoURL;
	@Column
	private boolean isPublished;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "auction_user_id")
	private User user;

	public AuctionItem(String title, String condition, String description, Timestamp startDate, Timestamp endDate,
			Double startingPrice, String photoURL, boolean isPublished, User user) {
		super();
		this.title = title;
		this.condition = condition;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startingPrice = startingPrice;
		this.photoURL = photoURL;
		this.isPublished = isPublished;
		this.user = user;
	}

	public AuctionItem(int id, String title, String condition, String description, Timestamp startDate,
			Timestamp endDate, Double startingPrice, String photoURL, boolean isPublished, User user) {
		super();
		this.id = id;
		this.title = title;
		this.condition = condition;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startingPrice = startingPrice;
		this.photoURL = photoURL;
		this.isPublished = isPublished;
		this.user = user;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;

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

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
