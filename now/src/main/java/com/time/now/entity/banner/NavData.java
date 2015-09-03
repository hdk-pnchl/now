package com.time.now.entity.banner;

import java.util.ArrayList;
import java.util.List;

public class NavData{
	private List<Tab>	mainNavData		= new ArrayList<Tab>();
	private List<Tab>	configNavData	= new ArrayList<Tab>();
	
	public NavData(){}
	
	public List<Tab> getMainNavData(){
		return mainNavData;
	}
	
	public void setMainNavData(List<Tab> mainNavData){
		this.mainNavData= mainNavData;
	}
	
	public List<Tab> getConfigNavData(){
		return configNavData;
	}
	
	public void setConfigNavData(List<Tab> configNavData){
		this.configNavData= configNavData;
	}
	
	@Override
	public String toString(){
		StringBuilder mainNavBuilder= new StringBuilder();
		for(Tab tab: this.getMainNavData()){
			mainNavBuilder.append(tab.toString());
		}
		StringBuilder configNavBuilder= new StringBuilder();
		for(Tab tab: this.getConfigNavData()){
			configNavBuilder.append(tab.toString());
		}
		StringBuilder builder= new StringBuilder();
		builder.append("mainNavData: ").append(mainNavBuilder.toString()).append("\n");
		builder.append("configNavData: ").append(configNavBuilder.toString()).append("\n");
		return builder.toString();
	}
}
