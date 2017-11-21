package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IAdminDao;
import com.situ.ssh.pojo.Admin;
import com.situ.ssh.service.IAdminService;
import com.situ.ssh.util.PageBean;

@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private IAdminDao adminDao;

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin) adminDao.login(admin);
	}

	@Override
	public void findAdmin(PageBean pageBean) {
		// TODO Auto-generated method stub
		adminDao.pageQuery(pageBean);
	}

}