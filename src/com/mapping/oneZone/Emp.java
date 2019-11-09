package com.mapping.oneZone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table1")
public class Emp {
	@Id
	@GeneratedValue
	private int eId;
	private String name;
	@OneToOne(fetch=FetchType.EAGER)
	private Parking parking;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Emp(int eId, String name, Parking parking) {
		super();
		this.eId = eId;
		this.name = name;
		this.parking = parking;
	}

	public Emp() {
			}
	
	

}
