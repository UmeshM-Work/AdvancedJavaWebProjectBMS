package com.cdac.service;

import java.util.List;

import com.cdac.dto.Book;
public interface BookService {
	void addBook(Book book);
	void removeBook(int bookId);
	Book findBook(int bookId);
	void modifyBook(Book book);
	List<Book> selectAll(int adminId);
	List<Book> selectAllUser();
	List<Book> selectAllUserSearch(Book book);
}
