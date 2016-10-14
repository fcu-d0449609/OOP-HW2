package fcu.iecss.oop;

import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a= new Scanner(System.in);
		System.out.print("Enter a integer");
		int integer=a.nextInt();
		
		if(integer % 2==0 || integer ==0 )
	    System.out.print("The input integer is Even number");
	    else
	    	System.out.print("The input integer is Odd number");	
		

	}

}
