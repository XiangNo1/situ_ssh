package com.situ.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Employee;
import com.situ.ssh.service.IEmployeeService;

@Controller
@Scope("prototype")
public class EmployeeAction extends BaseAction<Employee>{

	@Autowired
	private IEmployeeService employeeService;

	public String findAll(){
		employeeService.findAll(pageBean);
		System.out.println(pageBean.toString());
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
