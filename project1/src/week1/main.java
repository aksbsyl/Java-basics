package week1;

class Car {
   public void run()
    {
        System.out.println("Car is running");
    }
}

class Audi extends Car {
    public void run() {
        System.out.println("Audi is running at 100km/hr");
    }
}

public class main{
    public static void main(String[] args)
            {
                Car b= new Audi();    //upcasting
                b.run();
            }
}
