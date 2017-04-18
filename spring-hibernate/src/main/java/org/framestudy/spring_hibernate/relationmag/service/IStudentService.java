package org.framestudy.spring_hibernate.relationmag.service;

import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;

public interface IStudentService {

	public void saveStudentInfo(StudentInfo stu);
	
	public void deleteStudent(StudentInfo stu);
	/**
	 * 根据学生ID查询学生
	 * @param id
	 * @return
	 */
	public StudentInfo getStudentById(Long id);
}
