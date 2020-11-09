package week1;

public class VariableDemo2 {

	String name;
	int a;
	float f;
	double d;
	boolean b;
															//instance variable: inside class, ouside method
	public void showDefaultValue() {
	System.out.println("int="+ a);
	System.out.println("float="+ f);
	System.out.println("double="+ d);
	System.out.println("boolean="+ b);
	
								//We created a function localvariable
	
	}

	public static void main(String[] args) {
		VariableDemo2 v= new VariableDemo2();
		v.showDefaultValue();

	}


}