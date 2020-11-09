package week1;



public class VariableDemo {

	String name;
															//instance variable: inside class, ouside method
	public void localvariable() {							//We created a function localvariable
	int a=0;												//local variable
	System.out.println("value of a =" + a); 
	System.out.println("Name ="+ name);	
	}

	public void demo() {

		int a=0;											//local variable:integer
		System.out.println("Value of a="+ a);

	}

	public static void main(String[] args) {
		VariableDemo v= new VariableDemo();
		v.localvariable();

	}


}