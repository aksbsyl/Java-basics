package Week4;

public class ThreadTest {
    private static int count = 0;
    public static synchronized void inccount(){
        count++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10000; i++){
                    inccount();
                }
            }
        });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i = 0; i<10000; i++){
                inccount();
            }
        }
    });
    t1.start();
    t2.start();

    try{
        t1.join();
        t2.join();
    } catch(InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("value: " + count);
}
}

