package week1;
import java.util.*;
public class Calculator {

	public static void main(String[] args){
	Scanner sr = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sr.nextInt();
	System.out.println("Enter second number");
	int num2=sr.nextInt();
	System.out.println("Enter the operation(add/sub/mul/div)");
	String operation=sr.next();

	switch(operation)
	{
		case("add"):{
		System.out.println("Addition is "+ (num1+num2));
		}
		break;

		case("sub"):{
		System.out.println("Subtraction is "+ (num1-num2));
		}
		break;
		
		case("mul"):{
		System.out.println("Multiplication is "+ (num1*num2));
		}
		break;		

		case("div"):{
		System.out.println("Division is "+ (num1/num2));
		}
		break;

		default: {
		System.out.println("Enter valid operation");
		}

	  	}
	

	}
}