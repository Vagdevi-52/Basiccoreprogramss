package basicprogramss;

import java.util.Scanner;

public class Leapyear 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("enter the year");
      int year=s.nextInt();
      s.close();
      if(year<1000)
      {
    	  System.out.println("enter a valid year");
      }
      else if((year%4==0 && year%100!=0) || year%400==0)
      {	 
     	System.out.println("entered year is leap year");
      }
     else 
	  System.out.println("entered year is not leap year");
    }
}
