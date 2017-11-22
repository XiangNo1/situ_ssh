package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IBankDao;
import com.situ.ssh.service.IBankService;
import com.situ.ssh.util.PageBean;

@Service
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankDao bankDao;
	@Override
	public void findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		bankDao.pageQuery(pageBean);
	}

}
