package org.framestudy.spring_hibernate.relationmag.service;

import java.util.List;

import org.framestudy.spring_hibernate.relationmag.beans.ClassInfo;

public interface IClassService {
	/**
	 * 保存一个班级
	 * @param cls
	 */
	public void saveClassInfo(ClassInfo cls);
	
	/**
	 * 根据班级名称查询所有的班级
	 * @param name
	 * @return
	 */
	public List<ClassInfo> getClassByName(String name);
	
	/**
	 * 删除一个班级
	 * @param cls
	 */
	public void deleteClassInfo(ClassInfo cls);
	
}
