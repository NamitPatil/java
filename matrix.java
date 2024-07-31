import java.lang.*;
import java.util.*;

class matrix
{
	
	
	public static void main(String args[])
	{
		int[][] max1=new int [3][3];
	        int[][] max2=new int [3][3];
                int[][] max3=new int [3][3];
                matrix mat = new matrix();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of matrix 1:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			max1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix 2:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				{
			max2[i][j]=sc.nextInt();
			}
		}
	      System.out.println("Matrix1:");
	      mat.display(max1);
	      System.out.println("Matrix2:");
	      mat.display(max2);
		System.out.println("Addition :");
		mat.add(max1,max2,max3);
		mat.display(max3);
   
		System.out.println("Substraction :");
		mat.sub(max1,max2,max3);
		mat.display(max3);

		System.out.println("Multiplication :");
		mat.mul(max1,max2,max3);
		mat.display(max3);
	}
	public void display(int arr[][])
	{
    		for (int i = 0; i < 3; i++) 
		  {
        	  for (int j = 0; j < 3; j++) 	
		    {
                      System.out.print(arr[i][j] + "\t");
        	    }
  		  System.out.println();
    		  }

	 System.out.println();
	}
	
	public void add(int[][] m1,int m2[][],int m3[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
		
	public void sub(int[][] m1,int m2[][],int m3[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m3[i][j]=m1[i][j]-m2[i][j];
			}
		}
	}

	
	public void mul(int[][] m1,int m2[][],int m3[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
					{
						m3[i][j]+=m1[i][k]*m2[k][j];
			                }
			}
				
		}
	}
     
     
        

	

}	