package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String branch;
	private long collegeId;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public Student(int id, String name, String branch, long collegeId) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.collegeId = collegeId;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", collegeId=" + collegeId + "]";
	}
	

}
