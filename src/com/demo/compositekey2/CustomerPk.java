package com.demo.compositekey2;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class CustomerPk implements Serializable {
	
	private String id;
	private String regNo;
	
	
	public CustomerPk(String id, String regNo) {
		super();
		this.id = id;
		this.regNo = regNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	

}
