import java.lang.*;
import java.util.Scanner;
class Sample
{
	public static void main(String argu[])
	{
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=sc.nextInt();
		System.out.println("Number is:"+i);
		System.out.println("Enter the float number:");
		float f=sc.nextFloat();
		System.out.println("Float Number is:"+f);
	}
}