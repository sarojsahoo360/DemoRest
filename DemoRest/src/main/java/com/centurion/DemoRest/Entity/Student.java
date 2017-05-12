package com.centurion.DemoRest.Entity;

public class Student {
	
	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	private String name;
	
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
