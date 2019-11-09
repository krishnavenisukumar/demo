package com.demo.compositekey2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
(name = "customer_table_4")

public class Customer {
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	private int id;
	@Column(name="reg_no",nullable=false,length=60,unique=true)
	private String regno;
	@Column(name="cust_address",nullable=false,length=200)
	private String address;
	@Column(name="cust_phone",nullable=false,length=30)
    private String phone;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Transient
	private String tempPassword;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTempPassword() {
		return tempPassword;
	}

	public Customer() {
		super();
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	public Customer(String regno, String address, String phone, Date dateOfBirth, String tempPassword) {
		super();
		
		this.regno = regno;
		this.address = address;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
		this.tempPassword = tempPassword;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", regno=" + regno + ", address=" + address + ", phone=" + phone
				+ ", dateOfBirth=" + dateOfBirth + ", tempPassword=" + tempPassword + "]";
	}
	
	
		
	

}
