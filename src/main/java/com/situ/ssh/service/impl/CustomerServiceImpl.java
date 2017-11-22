package com.situ.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssh.dao.ICustomerDao;
import com.situ.ssh.pojo.Customer;
import com.situ.ssh.pojo.Customer;
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
	@Override
	public void addCustomer(Customer model) {
		// TODO Auto-generated method stub
		customerDao.save(model);
	}
	@Override
	public void updateCustomer(Customer model) {
		// TODO Auto-generated method stub
		customerDao.update(model);
	}
	@Override
	public void deleteCustomer(String ids) {
		// TODO Auto-generated method stub
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			Customer customer = new Customer();
			customer.setId(Integer.parseInt(id));
			customerDao.delete(customer);
		}
	}

}
