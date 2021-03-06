package com.cdac.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

@Service
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User) target;
		
		if(!user.getEmail().isEmpty())
		{
			String mail=user.getEmail();
			
			String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
			Matcher matcher=emailPat.matcher(mail);
			if(!matcher.find())
			{
				System.out.println("=======================================");
				errors.rejectValue("email", "unmKey", "email is invalid please provide one special character(@)");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("email", "unmKey", "email is required");
		}
		
		

		
		if(!user.getPassword().isEmpty())
		{
			String pass=user.getPassword();
			
			String passRegex="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
			Pattern emailPat=Pattern.compile(passRegex);
			Matcher matcher=emailPat.matcher(pass);
			if(!matcher.matches())
			{
				System.out.println("=======================================");
				errors.rejectValue("password", "passKey", "password is invalid Please enter One Digit one Caps letter and one special character");
			}
		}else {
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			errors.rejectValue("password", "passKey1", "password is required");
		}
		
		
	}
	
}
