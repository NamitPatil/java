import java.util.*;

class vehicle
{
	public String name;
	public int wheel;
	
	public vehicle(String n,int w)
	{
		name = n;
		wheel = w;
	}
	
	public void display()
	{
		System.out.println("Name of the vehicle is : "+name);
		System.out.println("wheels for the vehicle is : "+wheel);
	}

}

class car extends vehicle
{
	public String color;
	public int gears;
	public int topspeed;
	
	public car(String c,int g,int t)
	{
		super("BMW Electric",4);
		color=c;
		gears=g;
		topspeed=t;
	}
	
	public void display()
	{
		super.display();
		System.out.println("color of the vehicle is : "+color);
		System.out.println("gears of the vehicle is : "+gears);
		System.out.println("Top Speed of the vehicle is : "+topspeed);	
	}	
}

class electric extends car
{
	public int per;
	public int seat;
	
	public electric(int p,int s)
	{
		super("White",5,200);
		per = p;
		seat = s;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Battery Persentage : "+per+"%");
		System.out.println("Total Seats : "+seat);
		
	}
}

class multilevel
{
	public static void main(String args[])
	{
		electric e1 = new electric(95,5);
		e1.display();
	}
}