package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CartDao;
import com.cdac.dto.Cart;
@Service
public class CartServiceImple implements CartService{
	
	@Autowired
	private CartDao cartDao;

	@Override
	public void addBookCart(Cart cart) {
		cartDao.insertBookCart(cart);
		
	}

	@Override
	public List<Cart> selectAllCart() {
		return cartDao.selectAllCart();
	}
	
	
	@Override
	public void removeBookCart(int cart_id) {
		cartDao.deleteBookCart(cart_id);
		
	}

}
