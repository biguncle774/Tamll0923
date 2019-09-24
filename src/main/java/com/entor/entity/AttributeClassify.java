package com.entor.entity;

public class AttributeClassify {
	//属性id
	private int id;
	//属性名字
	private String name;
	public AttributeClassify() {
		super();
	}
	public AttributeClassify(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "AttributeClassify [id=" + id + ", name=" + name + "]";
	}

}
