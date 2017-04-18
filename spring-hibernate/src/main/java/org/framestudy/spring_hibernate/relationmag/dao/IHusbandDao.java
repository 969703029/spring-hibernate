package org.framestudy.spring_hibernate.relationmag.dao;

import org.framestudy.spring_hibernate.relationmag.beans.Husband;

public interface IHusbandDao {
	/**
	 * 保存丈夫
	 * @param hus
	 */
	public void saveHusband(Husband hus);
	/**
	 * 删除丈夫
	 * @param hus
	 */
	public void deleteHusband(Husband hus);
	
	/**
	 * 根据ID查询丈夫
	 * @param id
	 */
	public Husband getHusbandById(Long id);
	
	/**
	 * 根据妻子的名称查询丈夫
	 * @param name
	 * @return
	 */
	public Husband getHusbandByWifeName(String name);
}
