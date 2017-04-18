package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;

public class Wife implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1359964218823476692L;

	private Long id;
	
	private String name;
	
	private Husband hus;

	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wife(Long id, String name, Husband hus) {
		super();
		this.id = id;
		this.name = name;
		this.hus = hus;
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

	public Husband getHus() {
		return hus;
	}

	public void setHus(Husband hus) {
		this.hus = hus;
	}

	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + "]";
	}
}
