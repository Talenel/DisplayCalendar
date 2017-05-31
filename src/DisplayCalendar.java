import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DisplayCalendar {
	
	public static void main(String[] args)
	{
		
		Scanner user = new Scanner(System.in);
		String output[]= new String[42];
		String week[]={ "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		System.out.println("Please input desired year");
		int year=user.nextInt();
		
		int monthVal=getMonthInt(user.nextLine(),user);
		
		LocalDate input = LocalDate.of(year, monthVal, 1);
		Month month= Month.of(monthVal);
		for(int i=1; i<input.getDayOfWeek().getValue(); i++)
		{
			
				output[i-1]=" ";
			
			
			
		}
		
		
		
		for(int i=1; i<=(month.length(input.isLeapYear())); i++)
		{
			output[(i+input.getDayOfWeek().getValue()-2)]=Integer.toString(i);
			
			
		}
		for(int i=(month.length(input.isLeapYear())+input.getDayOfWeek().getValue()-1); i<output.length ;i++)
		{
			output[i]=" ";
		}
		for(int j=0; j<7; j++ )
		{
			System.out.print(week[j]+" ");
			
			
			
		}
		System.out.print("\n");
		
		for(int i=0; i<6;i++)
		{
			
			
			for(int j=0; j<7; j++ )
			{
				if((i*7+j)<(9+input.getDayOfWeek().getValue()-1))
				{
					System.out.print(" "+output[j+7*i]+"  ");
				}	
				else
				{
					System.out.print(" "+output[j+7*i]+" ");
				}
				
				
			}
			
			
			
			
			System.out.print("\n");
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static int getMonthInt(String aMonth, Scanner user)
	{
		boolean check=false;
		int monthInt=0;
		do
		{
			
			System.out.println("Please input desired month");
			aMonth= user.nextLine();
			
			switch (aMonth) {
	        case "January":  monthInt = 1;
	        	 	 check=true;
	                 break;
	        case "February":  monthInt = 2;
	        	 	 check=true;
	                 break;
	        case "March":  monthInt = 3;
	 			 	 check=true;
	                 break;
	        case "April":  monthInt =4;
	 			 	 check=true;
	                 break;
	        case "May":  monthInt =5;
	 			 	 check=true;
	                 break;
	        case "June":  monthInt = 6;
	 			 	 check=true;
	                 break;
	        case "July":  monthInt = 7;
	 			 	 check=true;
	                 break;
	        case "August":  monthInt = 8;
	 			 	 check=true;
	                 break;
	        case "September":  monthInt =9 ;
	 			 	 check=true;
	                 break;
	        case "October": monthInt = 10;
	 			 	 check=true;
	                 break;
	        case "November": monthInt = 11;
	 			 	 check=true;
	                 break;
	        case "December": monthInt = 12;
   		 			 check=true;
	                 break;
	        default: aMonth = "Invalid month";
	        	 	 System.out.println(aMonth);
	                 break;
			}
		}while(check==false);
		
		
		
		
		return monthInt;
	}
	
	

}
