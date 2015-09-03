package com.time.now.service.impl;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.now.entity.banner.BannerData;

@Service
public class CoreServiceImpl{
	@Autowired
	private HttpSession		httpSession;
	@Autowired
	private ObjectMapper	mapper;
	
	public BannerData fetchBannerData(){
		BannerData bannerData= null;
		try{
			String bannerJsonFilePath= this.getClass().getResource("/bannerData.json").getPath();
			if(!httpSession.isNew()){
				bannerJsonFilePath= this.getClass().getResource("/bannerDataUser.json").getPath();
			}
			bannerData= mapper.readValue(new File(bannerJsonFilePath), BannerData.class);
		}
		catch(JsonParseException e){
			e.printStackTrace();
		}
		catch(JsonMappingException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(bannerData == null){
				bannerData= new BannerData();
			}
		}
		return bannerData;
	}
}
