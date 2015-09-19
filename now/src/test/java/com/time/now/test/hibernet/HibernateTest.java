package com.time.now.test.hibernet;

import org.hibernate.Session;
import org.junit.Test;

import com.time.now.entity.Department;
import com.time.now.entity.Employee;
import com.time.now.util.HibernateUtil;

public class HibernateTest{
	
	//@Test
	public void testHibernet(){
		Session session= HibernateUtil.getInstance().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Department department= new Department();
		department.setName("Java");
		session.save(department);
		
		//Save
		session.save(new Employee("Jakab Gipsz", department));
		session.save(new Employee("Captain Nemo", department));
		
		session.getTransaction().commit();
		
		session.close();
	}
	
}
