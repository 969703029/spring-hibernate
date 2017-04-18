package org.framestudy.spring_hibernate.personmag.dao.impl;

import java.util.List;

import org.framestudy.spring_hibernate.personmag.beans.Person;
import org.framestudy.spring_hibernate.personmag.dao.IPersonDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements IPersonDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		//get()在查询时，对1的一方及时加载，对多的一方则采用延迟加载
		//load()在查询时，对于整个对象，直接进行延迟加载
		return (Person) session.get(Person.class, id);
	}


	@Override
	public List<?> getPersonByAddress(String address) {
		// TODO Auto-generated method stub
		//如果left join或者inner join后方不添加fetch ，在From前面则可使用select new map()来实现按需查询
		//fetch 只能添加在left join或者inner join的后面，不能添加在right join的后面
		//fetch 代表的是讲后面查询的结果向第一个对象进行填充，实际上是调用第一个对象的setter()来完成的
		String hql = "select new map (p.name as name,a.address as address,f.idCard as idCard) From Person as p left join p.adds as a left join p.info as f where a.address like CONCAT(?,'%')";
		Query query = session.createQuery(hql);
		query.setString(0, address);
		return query.list();
	}


	@Override
	public List<?> getPersonByPersonInfo(String msg) {
		// TODO Auto-generated method stub
		String hql = "From Person as p left join fetch p.info as f where f.msg like CONCAT(?,'%')";
		Query query = session.createQuery(hql);
		query.setString(0, msg);
		return query.list();
	}
	
	
	
	
	
	
	
	
	

}
