package org.framestudy.spring_hibernate.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.dao.IUserDao;
import org.framestudy.spring_hibernate.usermag.pojos.Pager;
import org.framestudy.spring_hibernate.usermag.pojos.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public void saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		session.save(user);
	}

	@Override
	public void updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		session.update(user);
	}

	@Override
	public void deleteUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		session.delete(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return (UserBean) session.get(UserBean.class, id);
	}

	@Override
	public UserBean loadUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return (UserBean) session.load(UserBean.class, id);
	}

	@Override
	public List<UserBean> findUserListByUserName(String name) {
		// TODO Auto-generated method stub
		
		//位置传值方式：通过问号来表示参数的位置，第一个问号位置是0
//		String hql = "From UserBean as user where user.userName like CONCAT(?,'%')";
//		Query query = session.createQuery(hql);//Query查询接口主要工作是：预编译HQL语句
//		query.setString(0, name);//给预编译后的HQL语句设值
		
		
		
		
		//参数别名传值方式
//		String hql = "From UserBean as user where user.userName like CONCAT(:userName,'%')";
//		Query query = session.createQuery(hql);//Query查询接口主要工作是：预编译HQL语句
//		query.setString("userName", name);
		
		
		
		
		//我们的HQL语句同样可以放置在xml中
//		Query query = session.getNamedQuery("org.framestudy.spring_hibernate.usermag.dao.impl.UserDaoImpl.findUserListByUserName");
//		query.setString("userName", name);
	
		
		
//		//如果实在不能理解HQL，我们仍旧可以使用SQL
//		String sql = "select u.* from t_user as u where u.user_name like CONCAT(?,'%')";
//		SQLQuery query = session.createSQLQuery(sql);
//		query.setString(0, name);//给预编译后的HQL语句设值
//		query.addEntity(UserBean.class);//将返回的SQL结果集转换到UserBean的对象中
		
		
		//Hibernate中实现想查啥就查啥，但是需要定义对象的构造器
		String hql = "select new UserBean(user.userName,user.loginName) From UserBean as user where user.userName like CONCAT(:userName,'%')";
		Query query = session.createQuery(hql).setCacheable(true);//Query查询接口主要工作是：预编译HQL语句
		query.setString("userName", name);
		
		return query.list();
	}

	@Override
	public List<UserBean> findUserListByMap(Map map) {
		// TODO Auto-generated method stub
		String hql = "From UserBean as user where user.userName like CONCAT(:userName,'%') and user.age = :age";
		Query query = session.createQuery(hql);
		query.setProperties(map);//Map作为多参数传递时，参数设值方式必须采用“参数别名设值方式”
		//并且map中键的名称必须与别名保持一致
		
		return query.list();
	}

	@Override
	public List<UserBean> findUserListByObject(User user) {
		// TODO Auto-generated method stub
		String hql = "From UserBean as user where user.userName like CONCAT(:userName,'%') and user.age = :age";
		Query query = session.createQuery(hql);
		query.setProperties(user);//对象作为多参数传递时，参数设值方式必须采用“参数别名设值方式”
		//并且保证传入对象的属性名称必须与别名保持一致
		
		return query.list();
	}

	public Pager findUserListByObjectToPager(Pager page, User user) {
		// TODO Auto-generated method stub
//		//先查符合条件的总行数
		String hql = "select count(u.id) from UserBean as u where u.userName like CONCAT(:userName,'%') and u.age = :age";
		Query query = session.createQuery(hql);
		query.setProperties(user);
		Long totalRows = (Long) query.uniqueResult();
		page.setTotalRows(Integer.parseInt(String.valueOf(totalRows)));//总行数
		
		//在查符合条件的具体数据
		hql = "from UserBean as u where u.userName like CONCAT(:userName,'%') and u.age = :age";
		query = session.createQuery(hql);
		query.setProperties(user);
		query.setFirstResult(page.getIndex());//limit后的第一个参数
		query.setMaxResults(page.getRows());//limit后的第二个参数
		List<?> datas = query.list();
		page.setDatas(datas);
		
		
		
		//不常用，即便用了，也会重新恢复成上述的方式
		//原因是：1、结构不清晰，2、无法调优，性能低下
//		Criteria criteria = session.createCriteria(UserBean.class);//From UserBean
//		//MatchMode.START 表示以查询条件开始，向后查
//		criteria.add(Restrictions.like("userName", user.getUserName(),MatchMode.START));
//		criteria.add(Restrictions.eq("age", user.getAge()));
//		
//		//查询总行数
//		Long totalRows = (Long)criteria.setProjection(Projections.rowCount()).uniqueResult();
//		page.setTotalRows(Integer.parseInt(String.valueOf(totalRows)));
//		
//		criteria.setProjection(null);//清空投影
//		criteria.setFirstResult(page.getIndex());
//		criteria.setMaxResults(page.getRows());
//		List<?> datas = criteria.list();
//		page.setDatas(datas);
		return page;
	}

	@Override
	public List<?> findUserListByObjectToMap(User user) {
		// TODO Auto-generated method stub
		
		String hql = "select new map(user.userName as userName,user.loginName as loginName) From UserBean as user where user.userName like CONCAT(:userName,'%')";
		Query query = session.createQuery(hql);//Query查询接口主要工作是：预编译HQL语句
		query.setString("userName", user.getUserName());
		
		return query.list();
		
	}
}
