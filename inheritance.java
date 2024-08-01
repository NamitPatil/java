import java.util.*;
import java.lang.*;


class person
{
	String name;
	public String eyecolor;
	int age;
	int height;
	public person(String name,String eyecolor,int age,int height)
	{
		this.name=name;
		this.eyecolor=eyecolor;
		this.age=age;
		this.height=height;
	}
     
      public void display()
	{
		System.out.println("Person name :"+name);
		System.out.println("Person eyecolor :"+eyecolor);
		System.out.println("Person age:"+age);
		System.out.println("Person height:"+height);
	}
}

class child extends person
{
	String name;
	int age;
	int height;

	public child(String name,int age,int height)
	{
		super("abc","Blue",19,5);
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	@Override public void display()
	{
		super.display();
		System.out.println("Child name :"+name);
		
		System.out.println("Child age:"+age);
		System.out.println("Child height:"+height);
            
	}
}
class inheritance
{
      public static void main(String args[])
	{
	
	child c1=new child("xyz",20,5);
	c1.display();
      
	}
}