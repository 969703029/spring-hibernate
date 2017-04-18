package org.framestudy.spring_hibernate.relationmag.dao.impl;

import java.util.List;

import org.framestudy.spring_hibernate.relationmag.beans.Husband;
import org.framestudy.spring_hibernate.relationmag.dao.IHusbandDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class HusbandDaoImpl implements IHusbandDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public void saveHusband(Husband hus) {
		// TODO Auto-generated method stub
		session.save(hus);
	}

	@Override
	public void deleteHusband(Husband hus) {
		// TODO Auto-generated method stub
		session.delete(hus);
	}

	@Override
	public Husband getHusbandById(Long id) {
		// TODO Auto-generated method stub
		return (Husband) session.get(Husband.class, id);
	}

	@Override
	public Husband getHusbandByWifeName(String name) {
		// TODO Auto-generated method stub
		String hql = "From Husband as h left join fetch h.wife as w where w.name = ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		List<?> list = query.list();
		if(list != null && !list.isEmpty()){
			return (Husband) list.get(0);
		}
		return null;
	}

}
