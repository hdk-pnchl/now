package com.time.now.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= -7066017348357561254L;

	@Id
	@GeneratedValue
	private Long		id;
	
	private String		name;
	
	@ManyToOne
	private Department	department;
	
	public Employee(){}
	
	public Employee(String name, Department department){
		this.name= name;
		this.department= department;
	}
	
	/* -----------------------------Constructor----------------------------- */
	public Employee(String name){
		this.name= name;
	}
	
	/* -----------------------------Setter-Getter----------------------------- */
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id= id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name= name;
	}
	
	public Department getDepartment(){
		return department;
	}
	
	public void setDepartment(Department department){
		this.department= department;
	}
	
	/* -----------------------------Override---------------------------- */
	
	@Override
	public String toString(){
		return "Employee [id=" + id + ", name=" + name + ", department=" + department.getName() + "]";
	}
	
	/* -----------------------------Behavior---------------------------- */
	
}
