package week1;

public class Student {
	
	public int add(int a, int b) {        //public here is access modifier //int is data type//void is return //add is a method.
		
		//add method
		int sum=a+b;
		return sum;

		}

	public static void main(String[] args) {
		System.out.println("Main method executed...");
		Student s=new Student();    						//object banyo
		int result=s.add(3,3);
		System.out.println("Sum is "+ result);
	}










}