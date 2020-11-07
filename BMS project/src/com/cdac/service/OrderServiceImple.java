package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.OrderDao;
import com.cdac.dto.Cart;
import com.cdac.dto.Order;


@Service
public class OrderServiceImple implements OrderService {

	
	@Autowired
	private OrderDao orderDao;
	

	
	

	





	@Override
	public List<Order> selectAllOrder(int userID) {
		return orderDao.selectAllOrder(userID);
	}











	











	@Override
	public void addBookOrder(String authorNameOrder, String bookNameOrder, float bookPriceOrder, int userID) {
		orderDao.insertBookOrder(authorNameOrder, bookNameOrder, bookPriceOrder, userID);
		
	}
	



		
	

}
