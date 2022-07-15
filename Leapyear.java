import java.util.Scanner;

class Leapyear

{
	
	public static void main(String agrgs[])
	
	{
		
		int year;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the Year");
		
		year=s.nextInt();
		
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		
		System.out.println("Year is LeapYear");
		
		else
			
			System.out.println("Year is Not a Leap Year");
		
	}
	}
	

