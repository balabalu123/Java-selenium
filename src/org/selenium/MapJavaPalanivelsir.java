package org.selenium;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapJavaPalanivelsir {
		public static void main(String[] args) {
		   Map<Integer,String> m = new LinkedHashMap();
		m.put(10, "Balu");
		m.put(20, "senthil");
		m.put(30, "dasthu");
		m.put(40, "suhail");
		m.put(50, "rekha");
		m.put(20, " saba");
		m.put(60, "rekha");
		
		System.out.println(m);
			int size = m.size();// used to find out the size
		System.out.println(size);
		String string = m.get(30);//displaying the corresponding key values
		System.out.println(string);
			
		m.remove(60);//remove the values from map
		System.out.println(m);
		
		boolean containsKey = m.containsKey(40);//used to check the particular values present or not
		System.out.println(containsKey);
	   
	   boolean containsValue = m.containsValue("corejava");//used to check the particular values present or not
		System.out.println(containsValue);
		
		Collection<String> values = m.values();//displaying the values only and its return type is collection
		System.out.println(values);
		
		Set<Integer> keySet = m.keySet();//displaying the keys only and its return type is set
		System.out.println(keySet);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();//for iterating the map and its return type is set<entry>
		System.out.println(entrySet);
		for (Entry<Integer, String> x : entrySet) {
			System.out.println(x);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
