package com.situ.ssh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

	private Integer id;
	private String name;
	//员工部门
	private String role;
	//手机号
	private String phone;
	//微信
	private String weixin;
	//qq
	private String qq;
	//入职时间
	private Date time;
	public Employee(Integer id, String name, String role, String phone, String weixin, String qq, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.weixin = weixin;
		this.qq = qq;
		this.time = time;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", phone=" + phone + ", weixin=" + weixin
				+ ", qq=" + qq + ", time=" + time + "]";
	}
	
	
	
}
