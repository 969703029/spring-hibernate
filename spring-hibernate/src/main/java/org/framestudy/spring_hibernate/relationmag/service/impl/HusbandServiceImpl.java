package org.framestudy.spring_hibernate.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.Husband;
import org.framestudy.spring_hibernate.relationmag.dao.IHusbandDao;
import org.framestudy.spring_hibernate.relationmag.service.IHusbandService;
import org.springframework.stereotype.Service;

@Service
public class HusbandServiceImpl implements IHusbandService{

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	
	@Override
	public void saveHusband(Husband hus) {
		// TODO Auto-generated method stub
		husbandDaoImpl.saveHusband(hus);
	}

	@Override
	public void deleteHusband(Husband hus) {
		// TODO Auto-generated method stub
		husbandDaoImpl.deleteHusband(hus);
	}

	@Override
	public Husband getHusbandById(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandById(id);
	}

	@Override
	public Husband getHusbandByWifeName(String name) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandByWifeName(name);
	}

}
