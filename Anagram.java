package javassignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int len = text1.length();
		int len1 = text2.length();
		if(len==len1) {	
		char[] sam = text1.toCharArray();
		char[] sam2 = text2.toCharArray();
		Arrays.sort(sam);
		Arrays.sort(sam2);
		if(sam==sam2) {
			System.out.println("Anagram");
		}else 
			System.out.println("not a Anagram");
			}
		
		}
	

}
