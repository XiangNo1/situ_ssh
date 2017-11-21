package com.situ.ssh.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

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
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
