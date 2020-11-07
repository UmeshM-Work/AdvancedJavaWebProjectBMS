package com.cdac.service;


import java.util.List;

import com.cdac.dto.Book;
import com.cdac.dto.Cart;

public interface CartService {
	
	void addBookCart(Cart cart);
	List<Cart> selectAllCart();
	
	void removeBookCart(int cart_id);

}
