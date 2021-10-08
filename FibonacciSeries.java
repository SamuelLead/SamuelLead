package javassignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range= 8, firstnum = 0, secnum = 1, sum;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i =1; i <range; i++) {
			sum= firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}
	}

}
