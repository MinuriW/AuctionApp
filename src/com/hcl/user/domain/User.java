package com.hcl.user.domain;

import java.util.List;

import javax.persistence.*;

import com.hcl.seller.domain.AuctionItem;

@Entity
@Table(name= "auction_user")
public class User {
	@Id
    @SequenceGenerator(name = "auction_user_seq", sequenceName = "auction_user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auction_user_seq")
	private Integer id;
	@Column
	private String username;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<AuctionItem> auctionItems;

	public User() {
		super();
	}

	public User(Integer id, String username, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	

	public User(String username, String firstName, String lastName, String email, String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
