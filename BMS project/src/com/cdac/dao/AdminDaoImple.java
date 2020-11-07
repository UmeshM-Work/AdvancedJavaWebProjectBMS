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

import com.cdac.dto.Admin;
import com.cdac.dto.User;

@Repository
public class AdminDaoImple implements AdminDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertAdmin(Admin admin) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(admin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public boolean checkAdmin(Admin admin) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Admin where email = ? and password = ?");
				q.setString(0, admin.getEmail());
				q.setString(1, admin.getPassword());
				List<Admin> li = q.list();
				boolean flag = !li.isEmpty();
				admin.setAdminId(li.get(0).getAdminId()); 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}

	
	@Override
	public boolean verify_mail(Admin admin) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Admin where email = ?");
				q.setString(0, admin.getEmail());
				List<Admin> li = q.list();
				boolean flag = !li.isEmpty();
				admin.setEmail(li.get(0).getEmail()); 
				admin.setAdminId(li.get(0).getAdminId()); 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}
	
	
	@Override
	public void resetpass(Admin admin) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				
				session.update(admin);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
	
	

	@Override
	public boolean checkEmail(Admin admin) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Admin where email = ?");
				q.setString(0, admin.getEmail());
				
				List<Admin> li = q.list();
				boolean flag = !li.isEmpty();
				 
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	}
	

}
