package com.cdac.dao;	


import java.util.List;

import com.cdac.dto.Cart;
import com.cdac.dto.Order;

public interface OrderDao {

	
	void insertBookOrder(String authorNameOrder,String bookNameOrder,float bookPriceOrder,int userID);
	List<Order> selectAllOrder(int userID);
}
