package com.time.now.entity.banner;

public class Tab{
	private String	title		= null;
	private boolean	active		= false;
	private boolean	disabled	= false;
	private boolean	hidden		= false;
	private String	path		= null;
	
	public Tab(){}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title= title;
	}
	
	public boolean isActive(){
		return active;
	}
	
	public void setActive(boolean active){
		this.active= active;
	}
	
	public boolean isDisabled(){
		return disabled;
	}
	
	public void setDisabled(boolean disabled){
		this.disabled= disabled;
	}
	
	public boolean isHidden(){
		return hidden;
	}
	
	public void setHidden(boolean hidden){
		this.hidden= hidden;
	}
	
	public String getPath(){
		return path;
	}
	
	public void setPath(String path){
		this.path= path;
	}
	
	@Override
	public String toString(){
		StringBuilder builder= new StringBuilder();
		builder.append("Title: ").append(this.getTitle()).append(" | ");
		builder.append("Path: ").append(this.getPath()).append(" | ");
		builder.append("isActive: ").append(this.isActive()).append(" | ");
		builder.append("isDisabled: ").append(this.isDisabled()).append(" | ");
		builder.append("isHidden: ").append(this.isHidden()).append(" | ");
		return builder.toString();
	}
}
