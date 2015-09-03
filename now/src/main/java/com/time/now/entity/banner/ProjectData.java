package com.time.now.entity.banner;

public class ProjectData{
	private String	projectName	= null;
	private String	defaultPath	= null;
	
	public ProjectData(){}
	
	public String getProjectName(){
		return projectName;
	}
	
	public void setProjectName(String projectName){
		this.projectName= projectName;
	}
	
	public String getDefaultPath(){
		return defaultPath;
	}
	
	public void setDefaultPath(String defaultPath){
		this.defaultPath= defaultPath;
	}
	
	@Override
	public String toString(){
		StringBuilder builder= new StringBuilder();
		builder.append("projectName: ").append(this.getProjectName()).append(" | ");
		builder.append("defaultPath: ").append(this.getDefaultPath()).append(" | ");
		return builder.toString();
	}
}