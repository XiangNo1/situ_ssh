package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.IProductDao;
import com.situ.ssh.service.IProductService;
import com.situ.ssh.util.PageBean;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDao productDao;
	@Override
	public void findProduct(PageBean pageBean) {
		// TODO Auto-generated method stub
		productDao.pageQuery(pageBean);
	}

}
