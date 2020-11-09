package week3;

import java.io.IOException;
public class ExceptionTest1 {
    void m() throws IOException {
        throw new IOException("Device Error");//Checked Exception
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        } catch(Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        ExceptionTest1 obj = new ExceptionTest1();
        obj.p();
        System.out.println("Normal flow...");
    }
}
