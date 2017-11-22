package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IStoreDao;
import com.situ.ssh.service.IStoreService;
import com.situ.ssh.util.PageBean;

@Service
public class StoreServiceImpl implements IStoreService {

	@Autowired
	private IStoreDao storeDao;
	@Override
	public void findAll(PageBean pageBean) {
		// TODO Auto-generated method stub
		storeDao.pageQuery(pageBean);
	}

}
