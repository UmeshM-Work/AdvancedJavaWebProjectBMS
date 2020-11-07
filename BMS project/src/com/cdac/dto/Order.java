package com.cdac.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bms_order")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "order_id")

	private int orderId;
	
	@Column(name = "order_authorNameOrder")
	private String authorNameOrder;
	
	@Column(name = "order_bookNameOrder")
	private String bookNameOrder;
	@Column(name = "order_bookPriceOrder")
	private float bookPriceOrder; 
	@Column(name = "order_orderDate")
	private Date orderDate;
	
	@Column(name = "order_user_id")
	private int userID;
	
	public Order() {
	
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", authorNameOrder=" + authorNameOrder + ", bookNameOrder=" + bookNameOrder
				+ ", bookPriceOrder=" + bookPriceOrder + ", orderDate=" + orderDate + ", userID=" + userID + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getAuthorNameOrder() {
		return authorNameOrder;
	}

	public void setAuthorNameOrder(String authorNameOrder) {
		this.authorNameOrder = authorNameOrder;
	}

	public String getBookNameOrder() {
		return bookNameOrder;
	}

	public void setBookNameOrder(String bookNameOrder) {
		this.bookNameOrder = bookNameOrder;
	}

	public float getBookPriceOrder() {
		return bookPriceOrder;
	}

	public void setBookPriceOrder(float bookPriceOrder) {
		this.bookPriceOrder = bookPriceOrder;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}



	
	
	
	
	

}
