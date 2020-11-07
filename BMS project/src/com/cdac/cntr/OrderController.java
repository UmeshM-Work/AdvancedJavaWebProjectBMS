package com.cdac.cntr;

import javax.servlet.http.HttpSession;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Admin;
import com.cdac.dto.Book;
import com.cdac.dto.Cart;
import com.cdac.service.BookService;
import com.cdac.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Cart;
import com.cdac.dto.Order;
import com.cdac.dto.User;
import com.cdac.service.CartService;
import com.cdac.service.OrderService;

@Controller
public class OrderController {
	@Autowired
		private OrderService orderService;
	 @Autowired
	    private CartService cartService;
	
	 @RequestMapping(value = "/order_add.htm",method = RequestMethod.GET)
		public String orderAdd(Order order,HttpSession session) {
			
			//int custId =  ((Customer)session.getAttribute("customer")).getCustId();
			int userID = (int) session.getAttribute("user_id");
			System.out.println("customer id============" + userID);
			order.setUserID(userID);
			
			
			List<Cart> cli = cartService.selectAllCart();
			
			for(Cart cc : cli) {
				
				orderService.addBookOrder(cc.getCbookAuthor(),cc.getCbookName(),cc.getCbookPrice(),userID);
				
				cartService.removeBookCart(cc.getCart_id());
				
			}
			
			
			
			
			
			return "user_index";
		}
	 
	 
	  @RequestMapping(value = "/show_order.htm",method = RequestMethod.GET)
	  	public String allBook(ModelMap map,HttpSession session,Order order) {
		  int userID = (int) session.getAttribute("user_id");
		  System.out.println(userID);
	  		List<Order> li =orderService.selectAllOrder(userID);
	  		map.put("ordershow", li);
	  		return "Myorders";
	  	}
	 
	 
	 
	 
	 
	 
	 

}
