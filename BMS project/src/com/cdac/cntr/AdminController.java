package com.cdac.cntr;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.cdac.dto.Admin;
import com.cdac.dto.User;
import com.cdac.service.AdminService;
import com.cdac.valid.AdminValidator;



@Controller
public class AdminController {
	
@Autowired
private AdminService adminService;
	
@Autowired
private AdminValidator adminValidator;
	
	@RequestMapping(value = "/prep_admin_reg.htm",method = RequestMethod.GET)
	public String prepAdminForm(ModelMap map) {
		map.put("admin", new Admin());
		return "admin_reg";
	}
	
	@RequestMapping(value = "/prep_admin_reg.htm",method = RequestMethod.POST)
	public String register(Admin admin,ModelMap map) {
		adminService.addAdmin(admin);
		return "admin_login";
	}
	
	@RequestMapping(value = "/prep_admin_log1.htm",method = RequestMethod.GET)
	public String prepAdminLogForm(ModelMap map) {
		map.put("admin", new Admin());
		return "admin_login";
	}
	
//	@RequestMapping(value = "/prep_admin_index.htm",method = RequestMethod.POST)
//	public String login(Admin admin,ModelMap map) {
//		adminService.findAdmin(admin);
//		return "admin_index";
//	}
	
	@RequestMapping(value = "/prep_admin_index.htm",method = RequestMethod.POST)
	public String login(@ModelAttribute Admin admin,BindingResult result,ModelMap map,HttpSession session,SessionStatus status) {
		if(!status.isComplete() ) {
			adminValidator.validate(admin, result);
			if(result.hasErrors()) {
				return "admin_login";
			}
		
		
		
		boolean b= adminService.findAdmin(admin);
		
		
		if(b) {
			session.setAttribute("admin", admin); 
			return "admin_index";
		}else {
			map.put("admin", new Admin());
			return "admin_login";
	}} else {
		session.setAttribute("admin", new Admin()); 
		map.put("admin", admin);
		return "admin_login";
	}
	
	
	}
	
	
	
	
}
