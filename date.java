import java.lang.*;
class date
{
    public static int weekday(int d,int m,int y)
	{
		int day;
                if(m>12 || m<=0 )
                {
                   
                   return 9;
		}

                else{
			
                        if(m==1 ||m==3 ||m==5 ||m==7 ||m==8 ||m==10 ||m==12)
                        {
                          if(d > 31 || d <=0){
                                
			    	return 9;
			}
                  
                        }
                        else if(m==4 ||m==6 ||m==9 ||m==11 )
                        {
                          if(d > 30 || d <=0){
                                
			    	return 9;
			}
                        }
                        else if(m == 2 )
                       { 
				if(y % 4 == 0){
                                if(d > 29 || d <=0){
                                
			    	return 9;
			}    	
			}
			else{
                       if(d > 28 || d <=0){
                                
			    	return 9;
			}    	
			}
			}
                        else{
		 	if(m<3)
                        {
				m = m+12;
				y = y-1;
		       }
		int k = y % 100;
		int j = y/100;
                int h = d +(13 * (m + 1))/ 5 + k + (k / 4) + ( j / 4) + 5 * j;
 		day = h % 7;
  		
      }
     return day;
	}
        
   }
		
    public static void main(String args[])
     {
	int day = Integer.parseInt(args[0]);
	int month = Integer.parseInt(args[1]);
	int year = Integer.parseInt(args[2]);
       
        int a =weekday(day,month,year);
        if(a==9)
        {
	System.out.println("incorrect date");
        }
         else{
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
	}	}

     }
}