package org.framestudy.spring_hibernate.personmag.dao;

import java.util.List;

import org.framestudy.spring_hibernate.personmag.beans.Person;

public interface IPersonDao {
	
	public Person getPersonById(Long id);
	

	/**
	 * 根据地址查找相关房东信息
	 * @param address
	 * @return
	 */
	public List<?> getPersonByAddress(String address);
	/**
	 * 根据人员信息查询人员
	 * @param msg
	 * @return
	 */
	public List<?> getPersonByPersonInfo(String msg);
}
