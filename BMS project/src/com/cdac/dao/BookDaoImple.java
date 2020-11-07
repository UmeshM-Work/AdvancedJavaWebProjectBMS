package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Book;

@Repository
public class BookDaoImple implements BookDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertBook(final Book book) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(book);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteBook(final int bookId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Book book = new Book(bookId);
				session.delete(book);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Book selectBook(final int bookId) {
		Book bok = hibernateTemplate.execute(new HibernateCallback<Book>() {

			public Book doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Book book = (Book)session.get(Book.class, bookId);
				tr.commit();
				session.flush();
				session.close();
				return book;
			}
			
		});
		return bok;
	}

	@Override
	public void updateBook(Book book) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(book); 
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public List<Book> selectAll(int adminId) {
		List<Book> list = hibernateTemplate.execute(new HibernateCallback<List<Book>>() {

			public List<Book> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Book where adminId = ?");
				q.setInteger(0, adminId);
				List<Book> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}

	public List<Book> selectAllUser() {
		List<Book> list = hibernateTemplate.execute(new HibernateCallback<List<Book>>() {

			public List<Book> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Book ");
				
				List<Book> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}

	@Override
	public List<Book> selectAllUserSearch(Book book) {
		List<Book> list = hibernateTemplate.execute(new HibernateCallback<List<Book>>() {

			public List<Book> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Book where bookAuthor=?");
				q.setString(0,book.getBookAuthor());
				List<Book> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
		
	
	}

}
