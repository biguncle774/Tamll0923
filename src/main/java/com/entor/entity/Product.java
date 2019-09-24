package com.entor.entity;
/**
 * 产品类型下的产品
 * @author Administrator
 *
 */

import java.util.Date;



public class Product {
	/**
	 * 产品id
	 */
	private int id;
	/**
	 * 产品名字
	 */
	private String name;
	/**
	 * 广告标题
	 */
	private String subTitle;
	/**
	 * 原价
	 */
	private double orignalPrice;
	/**
	 * 促销价格
	 */
	private double promotePrice;
	/**
	 * 库存
	 */
	private int stock;
	/**
	 * 父 产品id
	 */
	private int cid;
	/**
	 * 创造日期
	 */
	private Date createDate;
	public Product() {
		super();
	}
	public Product(int id, String name, String subTitle, double orignalPrice, double promotePrice, int stock, int cid,
			Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.subTitle = subTitle;
		this.orignalPrice = orignalPrice;
		this.promotePrice = promotePrice;
		this.stock = stock;
		this.cid = cid;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public double getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(double orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public double getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(double promotePrice) {
		this.promotePrice = promotePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

}
