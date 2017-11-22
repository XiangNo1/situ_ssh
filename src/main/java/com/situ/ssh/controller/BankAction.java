package com.situ.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Bank;
import com.situ.ssh.service.IBankService;

@Controller
@Scope("prototype")
public class BankAction extends BaseAction<Bank>{

	@Autowired
	private IBankService bankService;

	public String findAll(){
		bankService.findAll(pageBean);
		System.out.println(pageBean.toString());
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
