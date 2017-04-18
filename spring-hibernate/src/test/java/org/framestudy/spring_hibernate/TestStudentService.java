package org.framestudy.spring_hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.ClassInfo;
import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;
import org.framestudy.spring_hibernate.relationmag.service.IClassService;
import org.framestudy.spring_hibernate.relationmag.service.IStudentService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestStudentService {

	@Resource
	private IClassService classServiceImpl;
	@Resource
	private IStudentService studentServiceImpl;
	
	
	
	
	
	
	
	
	
	@Test
	public void deleteStudentInfo(){
		StudentInfo stu = studentServiceImpl.getStudentById(2l);
		System.out.println(stu);
		studentServiceImpl.deleteStudent(stu);
	}
	
	
	@Ignore
	public void saveStudentInfo(){
		//谁拥有关系维护的控制权，谁就来维护关系，维护关系时，需要双向设值
		
		//先查询一个班级
		List<ClassInfo> list = classServiceImpl.getClassByName("J135");
		ClassInfo cls = list.get(0);
		System.out.println(cls);
		
		//创建一个学生
		StudentInfo stu = new StudentInfo(null, "雅典娜", cls);
		cls.getStus().add(stu);
		
		studentServiceImpl.saveStudentInfo(stu);
		
	}
	
}
