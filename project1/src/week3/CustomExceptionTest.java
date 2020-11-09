package week3;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        //super(s);  //Super le parent class ko constructor lai call garcha
        System.out.println("InvalidAgeException called...");
    }
}

public class CustomExceptionTest {
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception occurred: "+m);}

        System.out.println("rest of the code...");
    }
}
