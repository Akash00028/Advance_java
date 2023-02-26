package com.example.demo1;

public class Student {
	private String firstName;
	private String lastName;
	private long[] mobileNo;
	private String[] emailIds;
	private Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long[] getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long[] mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String[] getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
