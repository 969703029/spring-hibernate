package org.framestudy.spring_hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionUtils {

	private static Configuration cfg;
	private static SessionFactory sf;
	private static ServiceRegistry sr;
	
	static{
		cfg = new Configuration().configure("hibernate.cfg.xml");
		sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sf = cfg.buildSessionFactory(sr);
	}
	
	public static Session getSession(){
		return sf.openSession();
	}
	
}
