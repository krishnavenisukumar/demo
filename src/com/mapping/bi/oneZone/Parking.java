package com.mapping.bi.oneZone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parking_table_bi_1")
public class Parking {
	@Id
	@GeneratedValue
	private int parkingId;
	private String loc;
	@OneToOne(mappedBy="parking")
	private Emp emp;

	public Parking(Emp emp) {
		super();
		this.emp = emp;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Parking(int parkingId, String loc) {
		super();
		this.parkingId = parkingId;
		this.loc = loc;
	}

	public Parking() {

	}

}
