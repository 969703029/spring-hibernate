package org.framestudy.spring_hibernate.relationmag.dao.impl;

import java.util.List;

import org.framestudy.spring_hibernate.relationmag.beans.ClassInfo;
import org.framestudy.spring_hibernate.relationmag.dao.IClassDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDaoImpl implements IClassDao {

	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	@Override
	public void saveClassInfo(ClassInfo cls) {
		// TODO Auto-generated method stub
		session.save(cls);
	}

	@Override
	public List<ClassInfo> getClassByName(String name) {
		// TODO Auto-generated method stub
		String hql = "From ClassInfo as c where c.name = :name";
		Query query = session.createQuery(hql);
		query.setString("name", name);
		return query.list();
	}

	@Override
	public void deleteClassInfo(ClassInfo cls) {
		// TODO Auto-generated method stub
		session.delete(cls);
	}

}
