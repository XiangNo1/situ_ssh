package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IStudentDao;
import com.situ.ssh.service.IStudentService;
import com.situ.ssh.util.PageBean;

@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public void pageQuery(PageBean pageBean) {
		studentDao.pageQuery(pageBean);
	}

}