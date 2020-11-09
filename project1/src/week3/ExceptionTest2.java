package week3;

import java.util.*;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b= sc.nextInt();
        try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Parent exception "+e);
        }catch (Exception ae){
            System.out.println("Child Exception "+ ae);
        }

    }
}
