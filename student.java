import java.lang.*;
import java.util.*;


class student
{
 	
		private int roll;
		private String name;
		private int marks;

		public void setroll(int r)
		{
			this.roll=r;
		}
		
		public void setname(String s)
		{
			this.name=s;
		}

		public void setmarks(int m)
		{
			this.marks=m;
		}

		public void getmarks()
		{
			System.out.println("marks ="+marks);
		}

		public void getname()
		{
			System.out.println("name ="+name);
		}

		public void getroll()
		{
			System.out.println("roll ="+roll);
		}

	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			student s1 = new student();
			s1.setroll(12);
			s1.setname("namit");
			s1.setmarks(49);
			s1.getroll();
			s1.getname();
			s1.getmarks();
		}
}