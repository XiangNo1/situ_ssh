package com.situ.ssh.controller;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.common.ServerResponse;
import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Customer;
import com.situ.ssh.service.ICustomerService;

@Controller
@Scope("prototype")
public class CustomerAction extends BaseAction<Customer>{

	@Autowired
	private ICustomerService customerService;

	public String findAll() throws UnsupportedEncodingException{
		String name = model.getName();
	       if (StringUtils.isNotEmpty(name)) {
	           detachedCriteria.add(Restrictions.like("name", "%" + new String(name.getBytes("iso-8859-1"),"utf-8") + "%"));
	       }
	       String level = model.getLevel();
	       if (StringUtils.isNotEmpty(level)) {
	           detachedCriteria.add(Restrictions.eq("level", new String(level.getBytes("iso-8859-1"),"utf-8")));
	       }
	       String salesperson = model.getSalesperson();
	       if (StringUtils.isNotEmpty(salesperson)) {
	           detachedCriteria.add(Restrictions.like("salesperson", "%" + new String(salesperson.getBytes("iso-8859-1"),"utf-8") + "%"));
	       }
		customerService.findAll(pageBean);
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
	
	public String addCustomer(){
		try {
			customerService.addCustomer(model);
			obj2Json(ServerResponse.createSuccess("添加成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("添加失败"));
		}
		return NONE;
	}
	public String updateCustomer(){
		try {
			customerService.updateCustomer(model);
			obj2Json(ServerResponse.createSuccess("修改成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("修改失败"));
		}
		return NONE;
	}
	public String deleteCustomer(){
		System.out.println(ids);
		customerService.deleteCustomer(ids);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		obj2Json(ServerResponse.createSuccess("删除成功"));
		return NONE;
	}
}
