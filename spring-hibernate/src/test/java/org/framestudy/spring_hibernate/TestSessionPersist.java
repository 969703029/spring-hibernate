package org.framestudy.spring_hibernate;

import org.framestudy.spring_hibernate.usermag.beans.UserBean;
import org.framestudy.spring_hibernate.utils.SessionUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestSessionPersist {

	
	@Test
	public void testSaveUserBean(){
		Session session = SessionUtils.getSession();
		Transaction tx = session.beginTransaction();
		UserBean user = new UserBean("大罗", "xiaoluo");//瞬态
		
		
		try {
			session.save(user);
			
			user.setAge(58);//持久态
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		
		
		
		System.out.println(user);//游离态
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
