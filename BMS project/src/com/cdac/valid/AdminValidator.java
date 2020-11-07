package com.cdac.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.Admin;
import com.cdac.dto.User;
@Service
public class AdminValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(Admin.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Admin admin = (Admin) target;
		
		if(!admin.getEmail().isEmpty())
		{
			String mail=admin.getEmail();
			
			String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
			Matcher matcher=emailPat.matcher(mail);
			if(!matcher.find())
			{
				System.out.println("=======================================");
				errors.rejectValue("email", "unmKey", "email is invalid Please enter one character (@) followed by . operator or not present");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("email", "unmKey", "email is required");
		}
		
		

		
		if(!admin.getPassword().isEmpty())
		{
			String pass=admin.getPassword();
			
			String passRegex="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
			Pattern emailPat=Pattern.compile(passRegex);
			Matcher matcher=emailPat.matcher(pass);
			if(!matcher.matches())
			{
				System.out.println("=======================================");
				errors.rejectValue("password", "passKey", "password is invalid Please enter One Digit one Caps letter and one special character ");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("password", "passKey1", "password is required");
		}
		
		
	}
	
}
