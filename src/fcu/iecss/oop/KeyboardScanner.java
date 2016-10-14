package fcu.iecss.oop;

import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a interger : ");
		int first = x.nextInt();
		System.out.print("Enter a float point number : ");
		float second=x.nextFloat();
		System.out.print("Enter your name : ");
		String name=x.next();
		System.out.print("Hi"+name+", the multiplication of "+first+" and "+ second+" is "+first * second);
		
		
		

	}

}
