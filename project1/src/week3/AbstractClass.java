package week3;

abstract  class ABC{
    abstract void show();
    void display(){
        System.out.println("I am defined in abstract class ");
    }
}
public class AbstractClass extends ABC{

    @Override
    void show() {
        System.out.println("I am abstract method from abstract class defined in extended class");}

    public static void main(String[] args) {
        AbstractClass abs = new AbstractClass();
        abs.display();
        abs.show();
    }
}
