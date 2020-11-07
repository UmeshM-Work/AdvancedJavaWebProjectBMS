package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Book;

public interface BookDao {
	void insertBook(Book book);
	void deleteBook(int bookId);
	Book selectBook(int bookId);
	void updateBook(Book book);
	List<Book> selectAll(int adminId);
	List<Book> selectAllUser();
	List<Book> selectAllUserSearch(Book book);
}
