package com.situ.ssh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private Integer id;
	//订单编号
	private String order_no;
	//下单者id
	private Integer user_id;
	//总金额
	private Double payment;
	//订单状态 0-已取消  10-未付款 20-已完成 
	private Integer status;
	//订单完成时间
	private Date time;
	public Order(Integer id, String order_no, Integer user_id, Double payment, Integer status, Date time) {
		super();
		this.id = id;
		this.order_no = order_no;
		this.user_id = user_id;
		this.payment = payment;
		this.status = status;
		this.time = time;
	}
	public Order() {
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
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Double getPayment() {
		return payment;
	}
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", order_no=" + order_no + ", user_id=" + user_id + ", payment=" + payment
				+ ", status=" + status + ", time=" + time + "]";
	}
	
}
