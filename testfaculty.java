import java.util.*;

class faculty
{
	private String fname;
	private String lname;
	private double msalary;
	private int desi;
	private double annualsalary;
	private double hsalary;
	
	public faculty()
	{
  		getdetails();			
	}
       
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name :");
		fname=sc.nextLine();
		System.out.println("Enter Last name :");
		lname=sc.nextLine();
		System.out.println("Enter designation : \n1.Lecturer\n2.Assistant Proffecer\n3.Associate Proffecer\n4.Proffecer");
		desi=sc.nextInt();
		System.out.println("Enter salary :");
		msalary=sc.nextDouble();
		System.out.println();
		
		if(msalary<0)
		{
			msalary=0;
		}
	}
	
	public void asalary()
	{
		this.annualsalary=(msalary*12);
		
	}

	public void hikesalary()
	{
		switch(desi)
			{
				case 1:
					msalary+=5000;
					break;

				case 2:
					msalary+=10000;
					break;

				case 3:
					msalary+=20000;
					break;

				case 4:
					msalary+=30000;
					break;
				default:
					{
					System.out.println("Enter correct choice of designation");
					}
			}
			
	}
	
	public void display()
	{
		System.out.println();
		hikesalary();
		asalary();		
		System.out.println("First Name : "+fname);
		System.out.println("Last Name : "+lname);
		System.out.println("Designation :"+desi);
		System.out.println("Monthly Salary : "+msalary);
		System.out.println("Annual Salary : "+annualsalary);
		
		System.out.println();
	}
}

class testfaculty
{
        public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of faculty");
		int n =sc.nextInt();
		faculty e[]=new faculty[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new faculty();
			e[i].display();
		}
		
	}
}