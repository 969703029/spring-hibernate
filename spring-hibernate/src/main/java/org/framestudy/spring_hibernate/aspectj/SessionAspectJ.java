package org.framestudy.spring_hibernate.aspectj;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.framestudy.spring_hibernate.utils.SessionUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionAspectJ {
	
	private Session session;
	private Transaction tx;

	@Before(value="execution(* org.framestudy.spring_hibernate.*mag.dao.impl.*.*(..))")
	public void beforeAdvice(JoinPoint jp){
		Object obj = jp.getTarget();
		Class<?> cls = obj.getClass();
		try {
			Method mth = cls.getMethod("setSession", Session.class);
			session = SessionUtils.getSession();
			tx = session.beginTransaction();//开启在线事务
			mth.invoke(obj, session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterReturning(returning="rvt",pointcut="execution(* org.framestudy.spring_hibernate.*mag.dao.impl.*.*(..))")
	public void afterReturningAdvice(JoinPoint jp,Object rvt){
		tx.commit();
		session.close();
	}
	
	@AfterThrowing(throwing="exc",pointcut="execution(* org.framestudy.spring_hibernate.*mag.dao.impl.*.*(..))")
	public void afterThrowingAdvice(JoinPoint jp,Object exc){
		tx.rollback();
		session.close();
	}
	
}
