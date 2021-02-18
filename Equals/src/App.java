import java.sql.SQLOutput;
import java.util.Objects;

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App {
    public static void main(String[] args) {
        Robot robot1 = new Robot(7);
        robot1.start();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();


        //shows Hashcode
//        System.out.println(new Object());

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");

        //true
//        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

//        false
//        System.out.println(value1 == value2);

        //true
//        System.out.println(value1.equals(value2));

        String text1 = "Hello";
        String text2 = "Hello";

        //true
//        System.out.println(text1 == text2);
    }


}
