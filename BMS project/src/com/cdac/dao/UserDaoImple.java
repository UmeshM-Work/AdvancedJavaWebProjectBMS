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

import com.cdac.dto.Cart;
import com.cdac.dto.User;
@Repository
public class UserDaoImple implements UserDao {
   
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertUser(User user) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}


	@Override
	public boolean checkUser(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where email = ? and password = ?");
				q.setString(0, user.getEmail());
				q.setString(1, user.getPassword());
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				user.setUserId(li.get(0).getUserId()); 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}
	
	@Override
	public boolean verify_mail(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where email = ?");
				q.setString(0, user.getEmail());
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				user.setEmail(li.get(0).getEmail()); 
				user.setUserId(li.get(0).getUserId()); 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}
	
	
	@Override
	public void resetpass(User user) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				
				session.update(user);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
	
	

	@Override
	public boolean checkEmail(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where email = ?");
				q.setString(0, user.getEmail());
				
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}
	
	@Override
	public String forgotPassword(String email) {
		String password = hibernateTemplate.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where email = ?");
				q.setString(0, email);
				List<User> li = q.list();
				String pass = null;
				if(!li.isEmpty())
					pass = li.get(0).getPassword();
				tr.commit();
				session.flush();
				session.close();
				return pass;
			}
			
		});
		return password;
	}


	@Override
	public List<User> selectUser(int userId) {
		
		

		List<User> list = hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where userId=? ");
				q.setInteger(0,userId);
				List<User> li = q.list();
			
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	
		
	}
	
	
	
}