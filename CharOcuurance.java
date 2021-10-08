package javassignments;

import java.util.Iterator;

public class CharOcuurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		
		char[] str1= str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1 [i]=='e') {
				count++;
			
		}
	}
System.out.println(count);
}}
