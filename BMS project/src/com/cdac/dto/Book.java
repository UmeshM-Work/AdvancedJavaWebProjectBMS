package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bms_book")
public class Book {
	
	@Id
	@Column(name="book_id")
	@GeneratedValue
	private int bookId;
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookAuthor=" + bookAuthor + ", bookName=" + bookName + ", bookPrice="
				+ bookPrice + ", bookQty=" + bookQty + ", adminId=" + adminId + "]";
	}
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_price")
	private float bookPrice;
	
	@Column(name="book_qty")
	private int bookQty;
	
	
	private int adminId;

	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Book() {
		
	}
	public Book(int bookId) {
		super();
		this.bookId = bookId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookQty() {
		return bookQty;
	}
	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}


	
	
	
	

	
	
}
