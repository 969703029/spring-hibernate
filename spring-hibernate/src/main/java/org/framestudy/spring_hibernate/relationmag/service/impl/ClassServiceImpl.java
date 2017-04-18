package org.framestudy.spring_hibernate.relationmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.ClassInfo;
import org.framestudy.spring_hibernate.relationmag.dao.IClassDao;
import org.framestudy.spring_hibernate.relationmag.service.IClassService;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService {

	@Resource
	private IClassDao classDaoImpl;
	
	@Override
	public void saveClassInfo(ClassInfo cls) {
		// TODO Auto-generated method stub
		classDaoImpl.saveClassInfo(cls);
	}

	@Override
	public List<ClassInfo> getClassByName(String name) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassByName(name);
	}

	@Override
	public void deleteClassInfo(ClassInfo cls) {
		// TODO Auto-generated method stub
		classDaoImpl.deleteClassInfo(cls);
	}

}
