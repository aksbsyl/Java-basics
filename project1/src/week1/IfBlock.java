package week1;
import java.util.Scanner;

public class IfBlock {

	public static void main(String [] args) {

	Scanner sr = new Scanner(System.in);  					 //Object banayo//system class ho//sr object ho//Scanner jdk ko predefined class ho
	System.out.println("Enter the marks");
	int marks= sr.nextInt();  								//nextInt is method within Scanner class of JDK. Its return type is integer.
	System.out.println("Your marks is "+ marks);
	if(marks>=45){
		System.out.println("Congratulations! You have passed");
	} else {
		System.out.println("Sorry! You failed");
	}
}
}