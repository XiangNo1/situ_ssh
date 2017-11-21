package com.situ.ssh.controller;

import org.omg.PortableInterceptor.NON_EXISTENT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Product;
import com.situ.ssh.service.IProductService;

@Controller
@Scope("prototype")
public class ProductAction extends BaseAction<Product> {

	@Autowired
	private IProductService productService;
	
	public String findProduct(){
		productService.findProduct(pageBean);
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
