package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Book;
import com.cdac.dto.Cart;

public interface CartDao {
	
	void insertBookCart(Cart cart);
	List<Cart> selectAllCart();
	
	void deleteBookCart(int cart_id);
}
