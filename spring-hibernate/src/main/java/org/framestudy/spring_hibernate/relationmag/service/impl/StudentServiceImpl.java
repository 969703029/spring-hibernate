package org.framestudy.spring_hibernate.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;
import org.framestudy.spring_hibernate.relationmag.dao.IStudentDao;
import org.framestudy.spring_hibernate.relationmag.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	
	@Override
	public void saveStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveStudentInfo(stu);
	}

	@Override
	public void deleteStudent(StudentInfo stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStudent(stu);
	}

	@Override
	public StudentInfo getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudentById(id);
	}

}
