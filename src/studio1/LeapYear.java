package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year are you testing? ");
		int year = in.nextInt();
		int dividefour = (year % 4);
		boolean byfour = (dividefour == 0);
		int divide100 = (year % 100);
		boolean by100 = (divide100 != 0);
		int divide400 = (year % 400);
		boolean by400 = (divide400 == 0);
		
		boolean leapYear = (byfour && by100) || by400;
		System.out.print(year + " is a leap year: " + leapYear);
		
		
		
	}

}
