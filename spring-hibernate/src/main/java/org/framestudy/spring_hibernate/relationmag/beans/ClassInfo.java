package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;
import java.util.Set;

public class ClassInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4827641033770548107L;

	private Long id;
	
	private String name;
	
	private Set<StudentInfo> stus;

	public ClassInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassInfo(Long id, String name, Set<StudentInfo> stus) {
		super();
		this.id = id;
		this.name = name;
		this.stus = stus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<StudentInfo> getStus() {
		return stus;
	}

	public void setStus(Set<StudentInfo> stus) {
		this.stus = stus;
	}

	@Override
	public String toString() {
		return "ClassInfo [id=" + id + ", name=" + name + "]";
	}
}
