package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IEmployeeDao;
import com.situ.ssh.service.IEmployeeService;
import com.situ.ssh.util.PageBean;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;
	@Override
	public void findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		employeeDao.pageQuery(pageBean);
	}

}
