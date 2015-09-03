package com.time.now.entity.banner;

public class BannerData{
	private NavData		navData		= null;
	private ProjectData	projectData	= null;
	
	public BannerData(){}
	
	public NavData getNavData(){
		return navData;
	}
	
	public void setNavData(NavData navData){
		this.navData= navData;
	}
	
	public ProjectData getProjectData(){
		return projectData;
	}
	
	public void setProjectData(ProjectData projectData){
		this.projectData= projectData;
	}
	
	@Override
	public String toString(){
		StringBuilder builder= new StringBuilder();
		builder.append("projectData: ").append(this.getProjectData()).append(" | ");
		builder.append("navData: ").append(this.getNavData()).append(" | ");
		return builder.toString();
	}
}