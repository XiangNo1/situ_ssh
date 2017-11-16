package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IAdminDao;
import com.situ.ssh.pojo.Admin;
import com.situ.ssh.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private IAdminDao adminDao;

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.login(admin);
	}

}