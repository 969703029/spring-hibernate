package org.framestudy.spring_hibernate;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.ClassInfo;
import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;
import org.framestudy.spring_hibernate.relationmag.service.IClassService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestClassService {

	@Resource
	private IClassService classServiceImpl;
	
	
	//这里由于我们Session是被切面管理到的，那么所以会抛出开了2次Session的错误
	//org.hibernate.HibernateException: 
	//Illegal attempt to associate a collection with two open sessions.
	@Test
	public void testDeleteClassInfo(){
		List<?> list = classServiceImpl.getClassByName("J135");
		ClassInfo cls = (ClassInfo) list.get(0);
		classServiceImpl.deleteClassInfo(cls);
	}
	
	@Ignore
	public void testGetClassByName(){
		
		List<?> list = classServiceImpl.getClassByName("J135");
		ClassInfo cls = (ClassInfo) list.get(0);
		
		
		
		System.out.println(cls.getStus());
	}
	
	
	@Ignore
	public void saveClassInfo(){
		//由于ClassInfo.xml中已经将关系维护的控制权，交给了Student，所以这里不能
		//双向的操作关系
		ClassInfo cls = new ClassInfo(null, "J136", null);
		
		classServiceImpl.saveClassInfo(cls);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
