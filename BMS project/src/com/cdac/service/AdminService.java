package com.cdac.service;

import com.cdac.dto.Admin;
import com.cdac.dto.User;

public interface AdminService {
	void addAdmin(Admin admin);
	boolean findAdmin(Admin admin);
	
	boolean verifymail(Admin admin);
	void setpass(Admin admin);
}
