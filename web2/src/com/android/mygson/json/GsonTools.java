package com.android.mygson.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTools {

	public GsonTools() {
		
	}

	public static <T> T getPerson(String jsonString,Class<T> cls) {
		T t = null;
		try {
			Gson gson = new Gson();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return t;
	}
	
	/**
	 * 使用Gson进行解析List<Person>
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> List<T> getBooks(String jsonString,Class<T> cls) {
		List<T> list = new ArrayList<T>();
		
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString,  new TypeToken<List<T>>(){}.getType());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
		
	}
	
	public static List<String> getList(String jsonString) {
		List<String> list = new ArrayList<String>();
		
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString, new TypeToken<List<String>>(){}
					.getType());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	
	
	public static List<Map<String, Object>> listKeyMaps(String jsonString) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		
		try {
			
			Gson gson = new Gson() ;
			list = gson.fromJson(jsonString, new TypeToken<List<Map<String, Object>>>(){}
							.getType());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	
}
