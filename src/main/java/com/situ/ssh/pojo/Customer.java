package com.situ.ssh.pojo;

import java.io.Serializable;

public class Customer implements Serializable {

	private Integer id;
	private String name;
	//客户等级
	private String level;
	//支付宝号
	private String zfb;
	//微信号/qq
	private String weixin;
	//所属销售员
	private String salesperson;
	//手机号
	private String phone;
	//联系地址
	private String address;
	//身份证
	private String id_card;
	public Customer(Integer id, String name, String level, String zfb, String weixin, String salesperson, String phone,
			String address, String id_card) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.zfb = zfb;
		this.weixin = weixin;
		this.salesperson = salesperson;
		this.phone = phone;
		this.address = address;
		this.id_card = id_card;
	}
	public Customer() {
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getZfb() {
		return zfb;
	}
	public void setZfb(String zfb) {
		this.zfb = zfb;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", level=" + level + ", zfb=" + zfb + ", weixin=" + weixin
				+ ", salesperson=" + salesperson + ", phone=" + phone + ", address=" + address + ", id_card=" + id_card
				+ "]";
	}
	
	
}
