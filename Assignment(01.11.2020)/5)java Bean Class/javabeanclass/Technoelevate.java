package com.technoelevate.assignment.javabeanclass;

public class Technoelevate {
	private String name;
	private int id;
	private String time;
	private String topicslearnt;
	public Technoelevate(String name, int id, String time, String topicslearnt) {
		super();
		this.name = name;
		this.id = id;
		this.time = time;
		this.topicslearnt = topicslearnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTopicslearnt() {
		return topicslearnt;
	}
	public void setTopicslearnt(String topicslearnt) {
		this.topicslearnt = topicslearnt;
	}

}
