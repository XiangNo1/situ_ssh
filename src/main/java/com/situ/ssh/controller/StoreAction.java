package com.situ.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Store;
import com.situ.ssh.service.IStoreService;

@Controller
@Scope("prototype")
public class StoreAction extends BaseAction<Store>{

	@Autowired
	private IStoreService storeService;

	public String findAll(){
		storeService.findAll(pageBean);
		System.out.println(pageBean.toString());
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
