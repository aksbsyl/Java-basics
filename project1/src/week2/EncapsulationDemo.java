package week2;

class Student
{
    private int rollno;
    private String name;

    //Getters and Setters


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.setRollno(2);
        s1.setName("Nabin");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}

//Encapsulation is one of the fundamentals of OOP (object-oriented programming). It refers
// to the bundling of data with the methods that operate on that data. Encapsulation is used
// to hide the values or state of a structured data object inside a class, preventing unauthorized
// parties' direct access to them.