package com.cdac.cntr;



import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.cdac.dto.User;
import com.cdac.service.UserService;
import com.cdac.valid.RegValidator;
import com.cdac.valid.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private RegValidator regValidator;
	
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping(value = "/prep_user_reg.htm",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
		map.put("user", new User());
		return "user_reg";
	}
	
	
//	@RequestMapping(value = "/logout.htm",method = RequestMethod.GET)
//	public String logout(@ModelAttribute User user,HttpSession session,ModelMap map,SessionStatus status,WebRequest request) {
//		 status.setComplete();
//		 request.removeAttribute("user", WebRequest.SCOPE_SESSION);
//		 session.invalidate();
//		
//		return "index";
//		
//	}
	
	
	@RequestMapping(value = "/home.htm",method = RequestMethod.GET)
	public String home(@ModelAttribute User user,HttpSession session,ModelMap map,SessionStatus status,WebRequest request) {
		 
		
		return "user_index";
		
	}
	
	@RequestMapping(value = "/aboutus.htm",method = RequestMethod.GET)
	public String home2(@ModelAttribute User user,HttpSession session,ModelMap map,SessionStatus status,WebRequest request) {
		 
		
		return "Aboutus";
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/prep_user_log.htm",method = RequestMethod.POST)
	public String register( @ModelAttribute User user,BindingResult result,ModelMap map) {
		regValidator.validate(user, result);
		if(result.hasErrors()) {
			map.put("user", user);
			return "user_reg";
		}
		
		userService.addUser(user);
		return "user_login";
	}
	
	@RequestMapping(value = "/prep_user_log1.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("user", new User());
		return "user_login";
	}
	
	@RequestMapping(value = "/prep_user_index.htm",method = RequestMethod.POST)
	public String login(@ModelAttribute User user,BindingResult result,ModelMap map,HttpSession session,SessionStatus status) {
		if(!status.isComplete() ) {
			userValidator.validate(user, result);
			if(result.hasErrors()) {
				return "user_login";
			}
		
		
		
		boolean b= userService.findUser(user);
		
		
		if(b) {
			
			
			session.setAttribute("user_id", user.getUserId());
			session.setAttribute("Name",user.getName());
			session.setAttribute("Mobile", user.getMobile());
			session.setAttribute("user",user); 
			return "user_index";
		}else {
			map.put("user", new User());
			return "user_login";
	}} else {
		session.setAttribute("user", new User()); 
		map.put("user", user);
		return "user_login";
	}
	
	
	}
	
	
	
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String email,ModelMap map) {		
		String pass = userService.forgotPassword(email);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("BMSofficialinc@gmail.com");  
	        message.setTo(email);  
	        message.setSubject("Hello User from BMS inc Your password is");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "Please check the mail for password";
		}
		map.put("msg", msg);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
