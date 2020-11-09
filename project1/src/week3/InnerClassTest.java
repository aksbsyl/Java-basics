package week3;

public class InnerClassTest {
    private int data=30;
    public void show(){
        System.out.println("Outer Class..");
    }
    class Inner{
        void msg(){System.out.println("data is "+data);
        show();
        }
    }
    public static void main(String args[]){
        InnerClassTest obj=new InnerClassTest();
        InnerClassTest.Inner in = obj.new Inner();
        //Inner a =  new Inner();
        in.msg();
    }
}
