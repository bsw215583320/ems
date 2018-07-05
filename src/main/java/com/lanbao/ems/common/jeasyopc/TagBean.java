package com.lanbao.ems.common.jeasyopc;

public class TagBean {
	private String name;
	private Double value;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TagBean(String name, Double value, String id) {
		super();
		this.name = name;
		this.value = value;
		this.id = id;
	}
	public TagBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
