package org.framestudy.spring_hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.pojos.Pager;
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

	
	
	
	
	@Ignore
	public void testFindUserListByObjectToPager(){
		Pager pager = new Pager(2, 8);
		User user = new User("小", 18);
		pager = userServiceImpl.findUserListByObjectToPager(pager, user);
		System.out.println(pager);
	}
	
	
	@Ignore
	public void testFindUserListByObject() {
//		List<?> users = userServiceImpl.findUserListByObject(new User("小", 18));

		List<?> users = userServiceImpl.findUserListByObjectToMap(new User("小", 18));
		System.out.println(users);
		for (Object object : users) {
			Map map = (Map) object;
			System.out.println(map.get("userName"));
		}
		
	}

	@Ignore
	public void testFindUserListByMap() {

		Map map = new HashMap();
		map.put("userName", "小");
		map.put("age", 18);

		List<?> users = userServiceImpl.findUserListByMap(map);

		System.out.println(users);
	}

	@Test
	public void testFindUserListByUserName() {

		List<?> users = userServiceImpl.findUserListByUserName("小");
		System.out.println(users);
		
		
		
		List<?> users2 = userServiceImpl.findUserListByUserName("大");
		System.out.println(users2);
		
		
		
		List<?> users3 = userServiceImpl.findUserListByUserName("小");
		System.out.println(users3);
		
		
		
		
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
