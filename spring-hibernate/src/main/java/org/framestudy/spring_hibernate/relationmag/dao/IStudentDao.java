package org.framestudy.spring_hibernate.relationmag.dao;

import org.framestudy.spring_hibernate.relationmag.beans.StudentInfo;

public interface IStudentDao {

	public void saveStudentInfo(StudentInfo stu);

	public void deleteStudent(StudentInfo stu);

	/**
	 * 根据学生ID查询学生
	 * 
	 * @param id
	 * @return
	 */
	public StudentInfo getStudentById(Long id);
}
