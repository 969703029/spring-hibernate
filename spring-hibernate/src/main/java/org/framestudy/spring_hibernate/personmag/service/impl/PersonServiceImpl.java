package org.framestudy.spring_hibernate.personmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.personmag.beans.Person;
import org.framestudy.spring_hibernate.personmag.dao.IPersonDao;
import org.framestudy.spring_hibernate.personmag.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

	@Resource
	private IPersonDao personDaoImpl;
	
	
	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonById(id);
	}


	@Override
	public List<?> getPersonByAddress(String address) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonByAddress(address);
	}


	@Override
	public List<?> getPersonByPersonInfo(String msg) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonByPersonInfo(msg);
	}

}
