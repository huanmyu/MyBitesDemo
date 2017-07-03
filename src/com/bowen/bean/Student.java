package com.bowen.bean;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private Date birthday;
	private float score;
	
	public Student(){}
	public Student(int id, String name, Date birthday, float score) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.score = score;
	}
	public Student(String name, Date birthday, float score) {
		this.name = name;
		this.birthday = birthday;
		this.score = score;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", score=" + score + "]";
	}
	
	

}
