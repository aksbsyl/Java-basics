package week3;

class Vehicle{
    void display(){
        System.out.println("This is Vehicle");
    }
}
public class MethodOverridingTest extends Vehicle{
    @Override
    void display(){
        System.out.println("This is car");
    }

    public static void main(String[] args) {
        MethodOverridingTest m = new MethodOverridingTest();
        m.display();
    }

}
