package com.mapping.many2many;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table_m_1")

public class Emp {
	@Id
	@GeneratedValue
	private int eId;
	private String name;
	@ManyToMany
	private List<Project> projects = new ArrayList<Project>();

	public Emp() {
		super();
	}

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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Emp(int eId, String name, List<Project> projects) {
		super();
		this.eId = eId;
		this.name = name;
		this.projects = projects;
	}

}
