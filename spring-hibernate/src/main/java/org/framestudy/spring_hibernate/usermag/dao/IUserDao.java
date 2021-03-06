package org.framestudy.spring_hibernate.usermag.dao;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.pojos.Pager;
import org.framestudy.spring_hibernate.usermag.pojos.User;

public interface IUserDao {
	/**
	 * 新增一个对象
	 * @param user
	 */
	public void saveUserInfo(UserBean user);
	
	public void updateUserInfo(UserBean user);
	
	public void deleteUserInfo(UserBean user);
	/**
	 * 根据ID查询一个对象
	 * @param id
	 * @return
	 */
	public UserBean getUserBeanById(Long id);
	/**
	 * 根据ID查询一个对象
	 * @param id
	 * @return
	 */
	public UserBean loadUserBeanById(Long id);
	
	public List<UserBean> findUserListByUserName(String name);
	
	/**
	 * 多参数查询
	 * @param map
	 * @return
	 */
	public List<UserBean> findUserListByMap(Map map);
	/**
	 * 多参数查询
	 * @param map
	 * @return
	 */
	public List<UserBean> findUserListByObject(User user);
	
	public Pager findUserListByObjectToPager(Pager page,User user);
	
	/**
	 * Hibernate实现除了构造之外的，想查什么就查什么
	 * @param user
	 * @return
	 */
	public List<?> findUserListByObjectToMap(User user);
}
