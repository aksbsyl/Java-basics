package week3;

import com.sun.java.accessibility.util.EventQueueMonitor;

class Address{
    String street;
    String city;
    String country;
    Address(String street, String city, String country){
        this.street = street;
        this.city = city;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.street+" "+address.city+" "+address.country);
    }

}
public class AggressionTest {
    public static void main(String[] args) {
        Address address1 = new Address("balaju", "kathmandu", "nepal");
        Address address2 = new Address("pulchowk", "lalitpur", "nepal");

        Employee e = new Employee(111, "varun", address1);
        Employee e2 = new Employee(112, "arun", address2);
        e.display();
        e2.display();

    }
}
