package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.service.BookService;
import com.cdac.dto.Admin;
import com.cdac.dto.Book;

import com.cdac.dto.User;


@Controller
public class BookController {
    @Autowired
    private BookService bookService;
      
    @RequestMapping(value = "/prep_book_add_form.htm",method = RequestMethod.GET)
	public String prepBookAddForm(ModelMap map) {
		map.put("book", new Book());
		return "admin_book_add_form";
	}
    
  
    
    @RequestMapping(value = "/book_add.htm",method = RequestMethod.POST)
	public String bookAdd(Book book,HttpSession session) {
    	int adminId=((Admin)session.getAttribute("admin")).getAdminId();
    	System.out.println(adminId);
		book.setAdminId(adminId); 
		bookService.addBook(book);
		return "admin_index";
	}
    
    
    
    @RequestMapping(value = "/book_list.htm",method = RequestMethod.GET)
  	public String allExpenses(ModelMap map,HttpSession session) {
  		int adminId= ((Admin)session.getAttribute("admin")).getAdminId();
  		List<Book> li = bookService.selectAll(adminId);
  		map.put("bookList", li);
  		return "admin_book_expense_list";
  	}
    
    @RequestMapping(value = "/user_list.htm",method = RequestMethod.GET)
  	public String allBook(ModelMap map,HttpSession session) {
  		
  		List<Book> li = bookService.selectAllUser();
  		map.put("bookList", li);
  		return "user_index_select";
  	}
    
    @RequestMapping(value = "/user_list_search_1.htm",method = RequestMethod.GET)
  	public String allBookSearch(Book book,ModelMap map,HttpSession session) {
    	
    	
    	System.out.println(book);
  		List<Book> li = bookService.selectAllUserSearch(book);
  		map.put("bookList", li);
  		return "user_index_search_final";
  	}
    
    @RequestMapping(value = "/user_index_search.htm",method = RequestMethod.GET)
  		public String prepBookAddForm2(ModelMap map) {
    		map.put("book", new Book());
    	
    	
    
  		return "user_index_search";
  	}
    
    
    @RequestMapping(value = "/book_delete.htm",method = RequestMethod.GET)
	public String expenseDelete(@RequestParam int bookId,ModelMap map,HttpSession session) {
		
		bookService.removeBook(bookId); 
		
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		List<Book> li = bookService.selectAll(adminId);
		map.put("bookList", li);
		return "admin_book_expense_list";
	}
    
    @RequestMapping(value = "/admin_book_update_list.htm",method = RequestMethod.GET)
	public String bookUpdateForm(@RequestParam int bookId,ModelMap map) {
		
		Book exp = bookService.findBook(bookId);
		map.put("book", exp);
		
		return "admin_book_update_list";
	}
    
    
    @RequestMapping(value = "/book_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(Book book,ModelMap map,HttpSession session) {
		
		int adminId = ((Admin)session.getAttribute("admin")).getAdminId();
		book.setAdminId(adminId);
		bookService.modifyBook(book);
			
		List<Book> li = bookService.selectAll(adminId);
		map.put("bookList", li);
		return "admin_book_expense_list";
	}	
	
    
    
}
