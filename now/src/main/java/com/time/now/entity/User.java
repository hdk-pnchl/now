package com.time.now.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6296739113300948330L;
	@Id
	@GeneratedValue
	private Long				id;
	private String				username;
	private String				password;
	private boolean				enabled;
	@OneToMany(mappedBy= "user", cascade= CascadeType.PERSIST)
	private Set<UserRole>		userRoleSet			= new HashSet<UserRole>();
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username= username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password= password;
	}
	
	public boolean isEnabled(){
		return enabled;
	}
	
	public void setEnabled(boolean enabled){
		this.enabled= enabled;
	}
	
	public Set<UserRole> getUserRoleSet(){
		return userRoleSet;
	}
	
	public void setUserRoleSet(Set<UserRole> userRoleSet){
		this.userRoleSet= userRoleSet;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id= id;
	}
	
}
