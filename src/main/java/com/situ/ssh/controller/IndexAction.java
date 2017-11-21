package com.situ.ssh.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class IndexAction extends ActionSupport {

	public String index(){
		return "index";
	}
	
	public String login(){
		return "login";
	}
	
}
