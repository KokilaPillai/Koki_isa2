package isa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner in = new Scanner(System.in);
		   
		  System.out.print("Enter first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Enter second number: ");
		  int num2 = in.nextInt();
		   
		  //sum
		  System.out.println("Sum of two number is:  " +num1 + " + " + num2 + " = " + 
		  (num1 + num2));
		   
		  
		  //difference
		  System.out.println("Difference of two number is:  " +num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		   
		  
		  //multiplication
		  System.out.println("Multiplication of two number is:  " +num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   }

	}


