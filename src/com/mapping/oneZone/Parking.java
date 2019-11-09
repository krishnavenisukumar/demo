package com.mapping.oneZone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking_table")
public class Parking {
	@Id@GeneratedValue
	private int parkingId;
	private String loc;
	
	
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
