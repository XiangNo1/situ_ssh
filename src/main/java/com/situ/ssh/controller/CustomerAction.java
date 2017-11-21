package com.situ.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Customer;
import com.situ.ssh.service.ICustomerService;

@Controller
@Scope("prototype")
public class CustomerAction extends BaseAction<Customer>{

	@Autowired
	private ICustomerService customerService;

	public String findAll(){
		customerService.findAll(pageBean);
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
