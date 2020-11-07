package com.cdac.service;

import java.util.List;

import com.cdac.dto.Cart;
import com.cdac.dto.Order;

public interface OrderService {
	
	
	
	void addBookOrder(String authorNameOrder,String bookNameOrder,float bookPriceOrder,int userID);
	
	List<Order> selectAllOrder(int userID);
	

}
