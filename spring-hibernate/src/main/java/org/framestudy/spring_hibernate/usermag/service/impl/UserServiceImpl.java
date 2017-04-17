package org.framestudy.spring_hibernate.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.dao.IUserDao;
import org.framestudy.spring_hibernate.usermag.pojos.User;
import org.framestudy.spring_hibernate.usermag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDaoImpl;
	
	
	@Override
	public void saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.saveUserInfo(user);
	}

	@Override
	public void updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.updateUserInfo(user);
	}

	@Override
	public void deleteUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUserInfo(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	}

	@Override
	public UserBean loadUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.loadUserBeanById(id);
	}

	@Override
	public List<UserBean> findUserListByUserName(String name) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByUserName(name);
	}

	@Override
	public List<UserBean> findUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByMap(map);
	}

	@Override
	public List<UserBean> findUserListByObject(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByObject(user);
	}

}
