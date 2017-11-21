package com.situ.ssh.pojo;

import java.io.Serializable;

public class Store implements Serializable {

	private Integer id;
	private String name;
	//所在位置
	private String location;
	//总容量
	private String amount;
	//负责人
	private String person;
	public Store(Integer id, String name, String location, String amount, String person) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.amount = amount;
		this.person = person;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", location=" + location + ", amount=" + amount + ", person="
				+ person + "]";
	}
	
}
