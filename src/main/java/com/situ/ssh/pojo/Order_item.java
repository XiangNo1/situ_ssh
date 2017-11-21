package com.situ.ssh.pojo;

import java.io.Serializable;

public class Order_item implements Serializable {

	private Integer id;
	//订单编号
	private String order_no;
	//商品名称
	private String name;
	//商品价格
	private Double price;
	//商品购买数量
	private Integer amount;
	public Order_item(Integer id, String order_no, String name, Double price, Integer amount) {
		super();
		this.id = id;
		this.order_no = order_no;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public Order_item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order_item [id=" + id + ", order_no=" + order_no + ", name=" + name + ", price=" + price + ", amount="
				+ amount + "]";
	}
	
}
