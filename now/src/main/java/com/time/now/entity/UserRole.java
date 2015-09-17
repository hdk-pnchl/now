package com.time.now.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserRole implements Serializable{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6813870338373430274L;
	@Id
	@GeneratedValue
	private Long				id;
	@ManyToOne
	private UserEntity				user;
	private String				role;
	
	public UserEntity getUser(){
		return user;
	}
	
	public void setUser(UserEntity user){
		this.user= user;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole(String role){
		this.role= role;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id= id;
	}
}