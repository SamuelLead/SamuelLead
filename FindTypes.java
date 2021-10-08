package javassignments;

import java.util.concurrent.ForkJoinPool;

public class FindTypes {
public static void main(String[] args) {
	

	String test = "$$ Welcome to 2nd Class of Automation $$";
	int letter = 0, space =0, num = 0, specialChar =0;
	char[] test1 = test.toCharArray();
	for (int i = 0; i < test1.length; i++) {
		if(Character.isLetter(test1[i]))
		{
			letter++;
		}
		else if (Character.isDigit(test1[i]))
		{
			num++;
			
		}
		else if (Character.isSpaceChar(test1[i]))
		{
			space++;
		}
		else {
			specialChar++;
		}
		
	}
	System.out.println(letter);
	System.out.println(num);
	System.out.println(space);
	System.out.println(specialChar);
}
}
