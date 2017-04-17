package org.framestudy.spring_hibernate.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.usermag.dao.IUserDao;
import org.framestudy.spring_hibernate.usermag.pojos.User;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
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
		Query query = session.createQuery(hql);//Query查询接口主要工作是：预编译HQL语句
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

	
	
	
	
	
	
	
	
	
	
}
