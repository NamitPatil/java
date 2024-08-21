import java.util.*;

class parent
{
	protected String name;
	protected int age;
	
	public parent()
	{
		name = "Namit";
		age=21;
	}

	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
}

class child extends parent
{
	private String address;
	private int salary;
	public child()
	{
		super();
		address = "Mumbai";
		salary=50000;
	}
	
	public void display()
	{
		super.display();
		
		System.out.println("Address = "+address);
		System.out.println("salary= "+salary);
		
	}
}

class single
{
	public static void main(String args[])
	{
		child c = new child();
		c.display();
	}
}