package org.framestudy.spring_hibernate.personmag.beans;

import java.io.Serializable;

public class PersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3686292348873658209L;

	private Long id;
	private String msg;//人员身份信息简介
	private String idCard;//身份证
	private Long fkPersonId;
	
	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonInfo(Long id, String msg, String idCard) {
		super();
		this.id = id;
		this.msg = msg;
		this.idCard = idCard;
	}
	
	public PersonInfo(Long id, String msg, String idCard, Long fkPersonId) {
		super();
		this.id = id;
		this.msg = msg;
		this.idCard = idCard;
		this.fkPersonId = fkPersonId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public Long getFkPersonId() {
		return fkPersonId;
	}
	public void setFkPersonId(Long fkPersonId) {
		this.fkPersonId = fkPersonId;
	}
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", msg=" + msg + ", idCard=" + idCard + ", fkPersonId=" + fkPersonId + "]";
	}
	
	
	
}
