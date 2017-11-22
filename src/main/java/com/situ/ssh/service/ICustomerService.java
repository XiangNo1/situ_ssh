package com.situ.ssh.service;

import com.situ.ssh.pojo.Customer;
import com.situ.ssh.util.PageBean;

public interface ICustomerService {

	void findAll(PageBean pageBean);

	void addCustomer(Customer model);

	void updateCustomer(Customer model);

	void deleteCustomer(String ids);

}
