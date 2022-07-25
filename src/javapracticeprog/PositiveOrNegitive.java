package javapracticeprog;

import java.util.Scanner;

public class PositiveOrNegitive {
	public static void main(String[] args) {
		
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter the Number:" );
	int num = reader.nextInt();
	
	if(num<0)
	{
		System.out.println("the number is negative");
	}
	else
		System.out.println("the number is positive");
	
    
	}
}
