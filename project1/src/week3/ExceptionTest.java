package week3;

import java.util.*;

public class ExceptionTest {
    public static void main(String[] args) {
        int a;
        int b;
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        a = sc.nextInt();
        System.out.println("Enter b");
        b= sc.nextInt();
        try {
            c = a/b;
        } catch(Exception  e){
            System.out.println("/ by zero not allowed... must enter value greater than 0"+e);
            //throw new RuntimeException("Stop Execution");
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("a divide by b is"+ c);
    }
}
