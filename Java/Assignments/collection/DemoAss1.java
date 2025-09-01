package com.demo.collection;
import java.util.HashMap;
import java.util.Map;

public class DemoAss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is fun and Java is powerful";
		Map<String, Integer> map=new HashMap<>();
		String words[] =str.split(" ");
		for(String word: words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		
		

	}

}
