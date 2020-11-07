package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dao.UserDao;
import com.cdac.dto.Admin;
import com.cdac.dto.Book;
import com.cdac.dto.Cart;
import com.cdac.dto.User;
import com.cdac.service.BookService;
import com.cdac.service.CartService;

@Controller
public class CartController {

	
	 @Autowired
	    private CartService cartService;
	 @Autowired
	 private UserDao userDao;
	
	 @RequestMapping(value = "/book_add_cart.htm",method = RequestMethod.GET)
		public String bookAddCart(@RequestParam String CbookAuthor,@RequestParam String CbookName,@RequestParam float CbookPrice,ModelMap map,Cart cart ) {
	    	
		 cart.setCbookAuthor(CbookAuthor);
		cart.setCbookName(CbookName);
		cart.setCbookPrice(CbookPrice);
		
			
			cartService.addBookCart(cart);
			return "user_index";
		}
	 
	   @RequestMapping(value = "/show_cart.htm",method = RequestMethod.GET)
	  	public String allBook(ModelMap map,HttpSession session) {
	  		
	  		List<Cart> li = cartService.selectAllCart();
	  		map.put("cartList", li);
	  		return "show_cart";
	  	}
	   
	   
	   @RequestMapping(value = "/show_cart2.htm",method = RequestMethod.GET)
	  	public String allBook2(ModelMap map,HttpSession session,User user) {
	  		
	  		List<Cart> li = cartService.selectAllCart();
	  		map.put("cartList", li);
	  		int userId=((User)session.getAttribute("user")).getUserId();
	  		System.out.println(userId);
	  		
	  		
	  		List<User> ul=userDao.selectUser(userId);
	  		
	  		for(User us : ul)
	  		{
	  			session.setAttribute("user_name_1",us.getName());
	  			session.setAttribute("user_mobile_2",us.getMobile());
	  		}
	  		
	  		
	  		
	  		return "Reciept";
	  	}
	   
	   
	   @RequestMapping(value = "/book_delete_cart.htm",method = RequestMethod.GET)
		public String expenseDelete(@RequestParam int cart_id,ModelMap map,HttpSession session) {
			
			cartService.removeBookCart(cart_id); 
			
			List<Cart> li = cartService.selectAllCart();
			map.put("cartList", li);
			return "show_cart";
		}
	 
}
