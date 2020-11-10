package Week5;

public class ThreadTesting2 implements Runnable{
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
        ThreadTesting2 t =  new ThreadTesting2();
        Thread th = new Thread(t);
        th.start();
        System.out.println(">>>>Name>>>>>>>>" + th.getName());
        System.out.println(">>>>>Priority>>>>>>>" + th.getPriority());
        System.out.println(">>>>Alive>>>>>" + th.isAlive());
    }

}