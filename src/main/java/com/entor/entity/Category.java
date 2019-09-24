package com.entor.entity;
/**
 * 产品类型
 * @author Administrator
 *
 */
public class Category {
	/**
	 * 产品类型id
	 */
	private int id;
	/**
	 * 产品类型名字
	 */
	private String name;
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Category() {
		super();
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

}
