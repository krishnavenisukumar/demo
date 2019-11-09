package com.mapping.many2many;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name = "project_table_m_1")

public class Project {
	@Id
	@GeneratedValue
	private int pId;
	private String name;
	private String pmgr;

	@ManyToMany(mappedBy="projects")
	private List<Emp> emps = new ArrayList<Emp>();

	public Project() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPmgr() {
		return pmgr;
	}

	public void setPmgr(String pmgr) {
		this.pmgr = pmgr;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Project(int pId, String name, String pmgr, List<Emp> emps) {
		super();
		this.pId = pId;
		this.name = name;
		this.pmgr = pmgr;
		this.emps = emps;
	}

}
