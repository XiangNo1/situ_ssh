package com.situ.ssh.dao;

import org.springframework.stereotype.Repository;

import com.situ.ssh.dao.base.BaseDaoImpl;
import com.situ.ssh.pojo.Customer;

@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements ICustomerDao{

}
