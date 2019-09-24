package com.entor.entity;

import javax.xml.crypto.Data;

public class Orderitem {
	/**
	 * 订单id
	 */
	private int id ;
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 金额
	 */
	private String money;
	/**
	 * 商品数量
	 */
	private int quantity;
	/**
	 * 买家名称
	 */
	private String name;
	/**
	 * 创建时间
	 */
	private Data creationTime;
	/**
	 * 支付时间
	 */
	private Data paymentTime;
	/**
	 * 发货时间
	 */
	private Data confirmTime;
	public Orderitem() {
		super();
	}
	public Orderitem(int id, int status, String money, int quantity, String name, Data creationTime, Data paymentTime,
			Data confirmTime) {
		super();
		this.id = id;
		this.status = status;
		this.money = money;
		this.quantity = quantity;
		this.name = name;
		this.creationTime = creationTime;
		this.paymentTime = paymentTime;
		this.confirmTime = confirmTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Data getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Data creationTime) {
		this.creationTime = creationTime;
	}
	public Data getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Data paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Data getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Data confirmTime) {
		this.confirmTime = confirmTime;
	}
	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", status=" + status + ", money=" + money + ", quantity=" + quantity + ", name="
				+ name + ", creationTime=" + creationTime + ", paymentTime=" + paymentTime + ", confirmTime="
				+ confirmTime + "]";
	}
	
}
