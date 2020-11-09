package week1;



public class Student2 {
	
	public int add(int a, int b) {        //public here is access modifier //int is data type//void is return //add is a method.
		
		//add method
		int sum=a+b;
		return sum;

		}
		
		public int sub(int a, int b) {        //public here is access modifier //void is return //add is a method.
		
		//add method
		int sum=a-b;
		return sum;

		}
		
	public void printdata(int result)  {
		System.out.println("Result is"+ result);
	}
	
	public void printDatas(String operation, int result)  {
		System.out.println(operation+" "+ result);
	}


	public String adds(int a,int b) {
		return "add"+ (a+b);
	}
	 
	public void printdetail(String aakash) {
		System.out.println(aakash);
	}
		
	
	
	public static void main(String[] args) {
		System.out.println("Main method executed...");
		Student2 s =new Student2();    						//object banyo
		s.printdata(s.add(3,6));
		s.printdata(s.sub(3,6));							//Dubai ma "Result is" aayo. We want to change output to "Add is" for addition and "Sub is" for sub
		s.printDatas("addiiton is",s.add(3,6));				//We are sending string so that we get additional string information like  "Add is" for addition and "Sub is" for sub
		s.printDatas("subtraction is",s.sub(3,6));
		
		
	}
}