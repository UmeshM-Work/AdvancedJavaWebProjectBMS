package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BookDao;
import com.cdac.dto.Book;


@Service
public class BookServiceImple implements BookService {
    
	@Autowired
	private BookDao bookDao;
	@Override
	public void addBook(Book book) {
		bookDao.insertBook(book);
		
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.deleteBook(bookId);
		
	}

	@Override
	public Book findBook(int bookId) {
		return bookDao.selectBook(bookId);
	}

	@Override
	public void modifyBook(Book book) {
		bookDao.updateBook(book);
		
	}

	@Override
	public List<Book> selectAll(int adminId) {
		return bookDao.selectAll(adminId);
	}

	@Override
	public List<Book> selectAllUser() {
		return bookDao.selectAllUser();
	}

	@Override
	public List<Book> selectAllUserSearch(Book book) {
		return bookDao.selectAllUserSearch(book);
	}

}
