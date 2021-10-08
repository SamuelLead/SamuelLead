package javassignments;

public class calculator {
	int num1, num2, num3;
	int sum;
	double num4, num5;
	double multi;
	
	public void add(int num1,int num2,int num3)
	{
		sum=num1+num2+num3;
System.out.println(sum);		
	}
	public void sub(int num1,int num2)
	{
		sum=num1-num2;
		System.out.println(sum);
	}
	
	public void mul(double num4, double num5)
	{
		multi= num4* num5;
		System.out.println(multi);
	}
	public void div(int num1,int num2)
	{
		sum=num1/num2;
		System.out.println(sum);
	}
public static void main(String[] args) {
	calculator obj = new calculator();
	obj.add(2, 4, 6);
    obj.sub(2, 55);
    obj.mul(9, 4);
    obj.div(3, 6);
}
}
