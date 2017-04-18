package org.framestudy.spring_hibernate.relationmag.dao.impl;

import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;
import org.framestudy.spring_hibernate.relationmag.dao.IStudentDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	@Override
	public void saveStudentInfo(StudentInfo stu) {
		// TODO Auto-generated method stub
		session.save(stu);
	}

	@Override
	public void deleteStudent(StudentInfo stu) {
		// TODO Auto-generated method stub
		session.delete(stu);
	}

	@Override
	public StudentInfo getStudentById(Long id) {
		// TODO Auto-generated method stub
		return (StudentInfo) session.get(StudentInfo.class, id);
	}

}
