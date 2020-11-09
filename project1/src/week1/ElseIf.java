package week1;


import java.util.*;
public class ElseIf {
	
	public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks=sr.nextInt();

	if(marks>=80 && marks<100) {
		System.out.println("Distinction");
	}

	else if(marks>=70 && marks<100) {
		System.out.println("First Division");
	}

	else if(marks>=55 && marks<100){
		System.out.println("Second Dicision");
	}

	else if(marks>=40 && marks<100) {
		System.out.println("Third Division");
	}

	else if(marks<40 && marks<100) {
		System.out.println("Sorry! You have failed");
	}
	else{
		System.out.println("Invalid number");
	}
}
}

