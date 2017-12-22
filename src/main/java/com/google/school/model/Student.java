package com.google.school.model;

public class Student {
	private int rollNo;
	private String name;
	private String className;
	private Parent parentInfo;
	private Fee feeInfo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Parent getParentInfo() {
		return parentInfo;
	}
	public void setParentInfo(Parent parentInfo) {
		this.parentInfo = parentInfo;
	}
	public Fee getFeeInfo() {
		return feeInfo;
	}
	public void setFeeInfo(Fee feeInfo) {
		this.feeInfo = feeInfo;
	}
	

}
