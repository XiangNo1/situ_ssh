package com.situ.ssh.pojo;

import java.io.Serializable;

public class Date_dic implements Serializable {

	private Integer id;
	//名
	private String name;
	//值
	private String value;
	public Date_dic(Integer id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public Date_dic() {
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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Date_dic [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
}
