package com.time.now.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 7903641314143045630L;
	@Id
	@GeneratedValue
	private Long				id;
	private String				name;
	
	@OneToMany(mappedBy= "department", cascade= CascadeType.PERSIST)
	private List<Employee>		employeeList		= new ArrayList<Employee>();
	
	public Department(){
		super();
	}
	
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
	
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
	
	public void setEmployeeList(List<Employee> employeeList){
		this.employeeList= employeeList;
	}
}
