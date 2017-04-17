package org.framestudy.spring_hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.pojos.User;
import org.framestudy.spring_hibernate.usermag.service.IUserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class TestUserService {

	@Resource
	private IUserService userServiceImpl;

	@Test
	public void testFindUserListByObject() {
		List<?> users = userServiceImpl.findUserListByObject(new User("小", 18));

		System.out.println(users);
	}

	@Ignore
	public void testFindUserListByMap() {

		Map map = new HashMap();
		map.put("userName", "小");
		map.put("age", 18);

		List<?> users = userServiceImpl.findUserListByMap(map);

		System.out.println(users);
	}

	@Ignore
	public void testFindUserListByUserName() {

		List<?> users = userServiceImpl.findUserListByUserName("小");
		System.out.println(users);
	}

	@Ignore
	public void testDeleteUserBean() {
		// 先查询再修改
		UserBean user = userServiceImpl.getUserBeanById(8l);
		System.out.println(user);
		userServiceImpl.deleteUserInfo(user);
	}

	@Ignore
	public void testUpdateUserBean() {
		// 先查询再修改
		UserBean user = userServiceImpl.getUserBeanById(8l);
		System.out.println(user);
		user.setUserName("什么东西");
		userServiceImpl.updateUserInfo(user);
	}

	@Ignore
	public void testSaveUserBean() {
		UserBean user = new UserBean("老马", "laoma");
		userServiceImpl.saveUserInfo(user);
	}

}
