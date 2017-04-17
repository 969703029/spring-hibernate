package org.framestudy.spring_hibernate.usermag.beans;

import java.io.Serializable;

public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398448140651246443L;
	private Long id;
	private String userName;
	private String loginName;
	private Integer age;
	private String pwd;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(String userName, String loginName) {
		super();
		this.userName = userName;
		this.loginName = loginName;
	}

	public UserBean(String userName, String loginName, Integer age, String pwd) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.age = age;
		this.pwd = pwd;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", loginName=" + loginName + ", age=" + age + ", pwd="
				+ pwd + "]";
	}
}
