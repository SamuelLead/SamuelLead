package javassignments;

public class Palindrome {
	public static void main(String[] args) {
		
	
	String str= "madam";
	String rev= "";
	char[] sam=str.toCharArray();
	
for (int i = sam.length-1; i >= 0; i--) {
	rev =rev+sam[i];
	
}
if(rev.equals(str)) {
	System.out.println("Palindrome");}
	else {
		System.out.println("not a Palindrome");
	
	}}
	}

