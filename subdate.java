import java.lang.*;
class subdate
{
    public static int weekday(int d,int m,int y)
	{
		if(m<3)
		{
			m = m+12;
			y = y-1;
		}
           
		int k = y % 100;
		int j = y/100;
                int h = d +(13 * (m + 1))/ 5 + k + (k / 4) + ( j / 4) + 5 * j;
 		int day = h % 7;
              
  		return day;
                
	}
    public static void main(String args[])
     {
        String date = args[0];
	int day = Integer.parseInt(date.substring(0,2));
	int month = Integer.parseInt(date.substring(3,5));
	int year = Integer.parseInt(date.substring(6,10));
       
        int a =weekday(day,month,year);
        switch(a)
	{
		case 0 :
		System.out.println("saturday");
		break;
		
		case 1 :
		System.out.println("sunday");
		break;

		case 2 :
		System.out.println("monday");
		break;

		case 3 :
		System.out.println("tuesday");
		break;

		case 4 :
		System.out.println("wednesday");
		break;

		case 5 :
		System.out.println("thursday");
		break;

		case 6 :
		System.out.println("friday");
		break;

		default:
		System.out.println("enter correct date");
		break;
	}
     }
}