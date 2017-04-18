package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;

public class StudentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4723661786299593906L;

	private Long id;
	
	private String name;
	
	private ClassInfo cls;

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(Long id, String name, ClassInfo cls) {
		super();
		this.id = id;
		this.name = name;
		this.cls = cls;
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

	public ClassInfo getCls() {
		return cls;
	}

	public void setCls(ClassInfo cls) {
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", cls=" + cls + "]";
	}
}
