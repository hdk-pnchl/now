package com.time.now.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{
	private static volatile HibernateUtil	hibernateUtilInstance	= null;
	
	private SessionFactory					sessionFactoryInstance	= null;
	
	private HibernateUtil(){}
	
	public static HibernateUtil getInstance(){
		if(hibernateUtilInstance == null){
			synchronized(HibernateUtil.class){
				if(hibernateUtilInstance == null){
					hibernateUtilInstance= new HibernateUtil();
					hibernateUtilInstance.buildSessionFactory();
				}
			}
		}
		return hibernateUtilInstance;
	}
	
	private void buildSessionFactory(){
		try{
			Configuration configuration= new Configuration().configure();
			StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactoryInstance= configuration.buildSessionFactory(builder.build());
		}
		catch(Throwable ex){
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactoryInstance;
	}
	
	public void shutdown(){
		this.getSessionFactory().close();
	}
}
