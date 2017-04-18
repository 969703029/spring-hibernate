package org.framestudy.spring_hibernate.personmag.beans;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7638012743715269622L;

	private Long id;
	private String address;
	private Long fkPersonId;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Long id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	public Address(Long id, String address, Long fkPersonId) {
		super();
		this.id = id;
		this.address = address;
		this.fkPersonId = fkPersonId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getFkPersonId() {
		return fkPersonId;
	}
	public void setFkPersonId(Long fkPersonId) {
		this.fkPersonId = fkPersonId;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", fkPersonId=" + fkPersonId + "]";
	}
	
}
