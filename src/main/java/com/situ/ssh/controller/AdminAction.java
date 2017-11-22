package com.situ.ssh.controller;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.Restrictions;
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
	
	public String findAdmin() throws UnsupportedEncodingException {
		System.out.println(model);
		
	   String trueName = model.getTrueName();
       if (StringUtils.isNotEmpty(trueName)) {
           detachedCriteria.add(Restrictions.like("trueName", "%" + new String(trueName.getBytes("iso-8859-1"),"utf-8") + "%"));
       }
       String role = model.getRole();
       if (StringUtils.isNotEmpty(role)) {
           detachedCriteria.add(Restrictions.eq("role", new String(role.getBytes("iso-8859-1"),"utf-8")));
       }
       String department = model.getDepartment();
       if (StringUtils.isNotEmpty(department)) {
           detachedCriteria.add(Restrictions.eq("department", new String(department.getBytes("iso-8859-1"),"utf-8")));
       }
		adminService.findAdmin(pageBean);
		obj2JsonForEasyUI(pageBean);
		return NONE;
	}
	
	public String addAdmin(){
		try {
			adminService.addAdmin(model);
			obj2Json(ServerResponse.createSuccess("添加成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("添加失败"));
		}
		return NONE;
	}
	public String updateAdmin(){
		try {
			adminService.updateAdmin(model);
			obj2Json(ServerResponse.createSuccess("修改成功"));
		} catch (Exception e) {
			// TODO: handle exception
			obj2Json(ServerResponse.createError("修改失败"));
		}
		return NONE;
	}
	public String deleteAdmin(){
		adminService.deleteAdmin(ids);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		obj2Json(ServerResponse.createSuccess("删除成功"));
		return NONE;
	}
}
