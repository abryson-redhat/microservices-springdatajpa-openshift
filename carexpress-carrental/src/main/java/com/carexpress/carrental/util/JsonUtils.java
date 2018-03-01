/**
 * 
 */
package com.carexpress.carrental.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author andymbrysoniii
 *
 */
public class JsonUtils {

	
	public InputStream getJsonFromFile(String jsonPath) throws FileNotFoundException {
		ClassLoader classLoader = getClass().getClassLoader();
		
		File file = new File(classLoader.getResource(jsonPath).getFile());
		
		InputStream is = null;
		
		try {
			 is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return is;
		
	}
	
	/**
	 * 
	 * @param ios
	 * @param clazz
	 * @return
	 */
	public <T>T buildJsonEntity(InputStream ios, Class<T> clazz) {
		T responseEntity = null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			responseEntity = mapper.readValue(ios, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return responseEntity;
	}
}
