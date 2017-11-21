package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.ICustomerDao;
import com.situ.ssh.service.ICustomerService;
import com.situ.ssh.util.PageBean;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	@Override
	public void findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		customerDao.pageQuery(pageBean);
	}

}
