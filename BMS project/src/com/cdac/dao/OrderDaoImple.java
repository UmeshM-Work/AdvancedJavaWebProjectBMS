package com.cdac.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Cart;
import com.cdac.dto.Order;

@Repository
public class OrderDaoImple implements OrderDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertBookOrder(String authorNameOrder,String bookNameOrder,float bookPriceOrder,int userID) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
			Order order=new Order();
			order.setAuthorNameOrder(authorNameOrder);
				order.setBookNameOrder(bookNameOrder);
				order.setBookPriceOrder(bookPriceOrder);
				order.setOrderDate(new Date());
				order.setUserID(userID);
				
				session.save(order);
				
				
				tr.commit();
				
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	
		
	}
	
	public List<Order> selectAllOrder(int userID) {
		List<Order> list = hibernateTemplate.execute(new HibernateCallback<List<Order>>() {
		
			
		
			public List<Order> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Order where userID=?");
				
				q.setInteger(0,userID);
				
				System.out.println("helllllllllllllllo"+userID);
				
				List<Order> li = q.list();
			
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}

}
