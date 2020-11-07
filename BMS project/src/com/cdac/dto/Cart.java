package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bms_cart")
public class Cart {

	
	@Id
	@Column(name="cart_id")
	@GeneratedValue
	
	private int cart_id;
	public Cart(int cart_id) {
		super();
		this.cart_id = cart_id;
	}
	@Column(name="cart_book_author")
	private String CbookAuthor;
	@Column(name="cart_book_name")
	private String CbookName;
	@Column(name="cart_book_price")
	private float CbookPrice;
	
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private int userId;
	
		

	
	
	
	public Cart() {
		
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", CbookAuthor=" + CbookAuthor + ", CbookName=" + CbookName
				+ ", CbookPrice=" + CbookPrice + "]";
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getCbookAuthor() {
		return CbookAuthor;
	}
	public void setCbookAuthor(String cbookAuthor) {
		CbookAuthor = cbookAuthor;
	}
	public float getCbookPrice() {
		return CbookPrice;
	}
	public void setCbookPrice(float cbookPrice) {
		CbookPrice = cbookPrice;
	}
	public String getCbookName() {
		return CbookName;
	}
	public void setCbookName(String cbookName) {
		CbookName = cbookName;
	}
	
	
	
}
