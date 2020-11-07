package com.cdac.valid;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cdac.dao.UserDao;
import com.cdac.dto.User;
@Service
public class RegValidator implements Validator{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User) target;
		
		String fname=user.getName();
		
		if(fname.isEmpty()) {
			errors.rejectValue("name", "nameKey", "insert Full Name");
			
		}
		
		//emailId
		
		if(userDao.checkEmail(user))
		{
			errors.rejectValue("email", "emailKey", "email already exist");
		}
		else if(!user.getEmail().isEmpty())
		{
			
			
			String mail=user.getEmail();
			
			String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
			Matcher matcher=emailPat.matcher(mail);
			if(!matcher.find())
			{
				System.out.println("=======================================");
				errors.rejectValue("email", "emailKey", "email is invalid Please enter one character (@) followed by . operator or already registered");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("email", "emailKey", "Email is required");
		}
		
		
		
		
		//password
		if(!user.getPassword().isEmpty())
		{
			String pass=user.getPassword();
			
			String passRegex="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
			Pattern passPat=Pattern.compile(passRegex);
			Matcher matcher=passPat.matcher(pass);
			if(!matcher.matches())
			{
				System.out.println("=======================================");
				errors.rejectValue("password", "passKeya", "password is invalid");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("password", "passKeyd", "password is required");
		}
		
		
		
		//contact no
				if(!user.getMobile().isEmpty())
				{
					String pass=user.getMobile();
					
					String passRegex="^[0-9]{10}$";
					Pattern passPat=Pattern.compile(passRegex);
					Matcher matcher=passPat.matcher(pass);
					if(!matcher.matches())
					{
						System.out.println("=======================================");
						errors.rejectValue("mobile", "contactKey", "Mobile No is invalid");
					}
				}else {
					
					System.out.println("+++++++++++++++++++++++++++++++++++++++++");
					errors.rejectValue("mobile", "contactKey", "Mobile No is required");
				}
		
	}

}
