package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;
/**
 * 双向1对1
 * @author Administrator
 *
 */
public class Husband implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8051944025084412393L;

	private Long id;
	private String name;
	//配置双向关系
	private Wife wife;
	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Husband(Long id, String name, Wife wife) {
		super();
		this.id = id;
		this.name = name;
		this.wife = wife;
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
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
	
}
