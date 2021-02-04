import java.util.Scanner;
class Person {
    //Instance variables (data or "state")
    String name;
    int birthYear;
    //classes can contain
    //1. Data
    //2 Subroutine (methods)
    void speak() {
        System.out.println("My name is " + name + " and I am " + getAge() + " years old");
    }

    void sayHello(){
        System.out.println("Hello there!");
    }

    int getAge(){
        return 2021 - birthYear;
    }

    int calculateYearsToRetirement() {
        return 65 - getAge();
    }
    String getName(){
        return name;
    }
}

public class tut03 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.birthYear = 1979;
        person1.sayHello();
        person1.speak();

        int years = person1.calculateYearsToRetirement();
        System.out.println("I have " + years + " years until retirement.");
    }
}
