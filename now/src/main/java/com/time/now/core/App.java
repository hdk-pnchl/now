package com.time.now.core;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.time.now.entity.banner.BannerData;

public class App{
	public static void main(String[] args){
		
		App app= new App();
		
		app.test();
	}
	
	private void test(){
		String url= this.getClass().getResource("/bannerData.json").getPath();
		
		File file= new File(url);
		ObjectMapper mapper= new ObjectMapper();
		
		try{
			BannerData bannerData= mapper.readValue(file, BannerData.class);
			
			System.out.println(bannerData.toString());
			
			String jsonStr= mapper.writeValueAsString(bannerData);
			
			System.out.println(jsonStr);
		}
		catch(JsonParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(JsonMappingException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
