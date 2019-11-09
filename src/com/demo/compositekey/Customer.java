package com.demo.compositekey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_table")

public class Customer {
	@Id
	private int id;
	private String regNo;
	private String address;
	private String phone;
	

	
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer(int id, String regNo, String address, String phone) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.address = address;
		this.phone = phone;
	}
	
	
	
	

}
