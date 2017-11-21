package com.situ.ssh.controller;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.situ.ssh.common.ServerResponse;
import com.situ.ssh.controller.base.BaseAction;
import com.situ.ssh.pojo.Admin;
import com.situ.ssh.service.IAdminService;

@Controller
@Scope("prototype")
public class AdminAction extends BaseAction<Admin>{
	@Autowired
	private IAdminService adminService;
	private String checkCode;
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String login() {
		Admin admin = adminService.login(model);
		if (admin != null) {
			//登陆成功，放到session中，跳转到首页
			ServletActionContext.getRequest().getSession().setAttribute("admin", admin);
			obj2Json(ServerResponse.createSuccess("登陆成功"));
			return NONE;
		} else {
			obj2Json(ServerResponse.createError("登陆失败"));
			return NONE;
		}
	}
	public String loginout(){
		try {
			ServletActionContext.getRequest().getSession().removeAttribute("admin");
			obj2Json(ServerResponse.createSuccess("退出成功"));
			return NONE;
		} catch (Exception e) {
			obj2Json(ServerResponse.createError("退出失败"));
			return NONE;
		}
	}
	
	public String findAdmin() {
		adminService.findAdmin(pageBean);
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
}
