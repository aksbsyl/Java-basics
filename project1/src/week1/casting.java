package week1;

public class casting {
    public static void main(String[] args) {
        String x="1";
        //Implicit Casting
        //byte > short > int > long > float > double
        int y = Integer.parseInt(x) +2;
        System.out.println(y);
    }
}
