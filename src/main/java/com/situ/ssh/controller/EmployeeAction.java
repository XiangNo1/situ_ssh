package com.situ.ssh.controller;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.common.ServerResponse;
import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Employee;
import com.situ.ssh.service.IEmployeeService;

@Controller
@Scope("prototype")
public class EmployeeAction extends BaseAction<Employee>{

	@Autowired
	private IEmployeeService employeeService;

	public String findAll() throws UnsupportedEncodingException{
		System.out.println(model);
		String name = model.getName();
		if (StringUtils.isNotEmpty(name)) {
	           detachedCriteria.add(Restrictions.like("name", "%" + new String(name.getBytes("iso-8859-1"),"utf-8") + "%"));
	       }
	       String role = model.getRole();
	       if (StringUtils.isNotEmpty(role)) {
	           detachedCriteria.add(Restrictions.eq("role", new String(role.getBytes("iso-8859-1"),"utf-8")));
	       }
		employeeService.findAll(pageBean);
		System.out.println(pageBean.toString());
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
	
	public String addEmployee(){
		try {
			employeeService.addEmployee(model);
			obj2Json(ServerResponse.createSuccess("添加成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("添加失败"));
		}
		return NONE;
	}
	public String updateEmployee(){
		try {
			employeeService.updateEmployee(model);
			obj2Json(ServerResponse.createSuccess("修改成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("修改失败"));
		}
		return NONE;
	}
	public String deleteEmployee(){
		employeeService.deleteEmployee(ids);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		obj2Json(ServerResponse.createSuccess("删除成功"));
		return NONE;
	}
}
