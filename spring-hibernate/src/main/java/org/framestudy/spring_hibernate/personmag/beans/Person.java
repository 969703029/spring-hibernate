package org.framestudy.spring_hibernate.personmag.beans;

import java.io.Serializable;
import java.util.Set;

/**
 * 单向的1对1，1对多
 * @author Administrator
 *
 */
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4710963339990381360L;

	private Long id;
	private String name;
	private String pwd;
	
	private PersonInfo info;
	private Set<Address> adds;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long id, String name, String pwd, PersonInfo info, Set<Address> adds) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.info = info;
		this.adds = adds;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public PersonInfo getInfo() {
		return info;
	}
	public void setInfo(PersonInfo info) {
		this.info = info;
	}
	public Set<Address> getAdds() {
		return adds;
	}
	public void setAdds(Set<Address> adds) {
		this.adds = adds;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", pwd=" + pwd + ", info=" + info + ", adds=" + adds + "]";
	}
	
}
