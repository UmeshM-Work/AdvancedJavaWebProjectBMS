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
import com.cdac.dto.Cart;


@Repository
public class CartDaoImple implements CartDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertBookCart(final Cart cart) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(cart);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
	
	
	@Override
	public void deleteBookCart(final int cart_id) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Cart cart = new Cart(cart_id);
				session.delete(cart);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
	
	public List<Cart> selectAllCart() {
		List<Cart> list = hibernateTemplate.execute(new HibernateCallback<List<Cart>>() {

			public List<Cart> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Cart ");
				
				List<Cart> li = q.list();
			
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}

}
