package Week5;

public class ThreadTesting extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Executed..");
        add(5,8);
    }
    public void add(int a, int b){
        int c = a+b;
        System.out.println("Added value is: "+ c);
    }

    public static void main(String[] args) {
        ThreadTesting t =  new ThreadTesting();
        t.start();
    }

}
