import java.util.Scanner;

class Person {
    //Instance variables (data or "state")
    String name;
    int age;

    //classes can contain
    //1. Data
    //2 Subroutine (methods)
    void speak() {
        
    }
}

public class tut03 {

    public static void main(String[] args) {


        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 35;

        System.out.println(person1.name);
    }
}
