import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

//        Person[] people = {
//                new Person(1, "Sue"),
//                new Person(2, "Mike"),
//                new Person(3, "Bob")};
//        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));


        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Serialization/test.txt"))){
            Person person = new Person(7, "Bob");
            Person.setCount(88);
            os.writeObject(person);
//            os.writeObject(people);

//            os.writeObject(peopleList);

//            os.writeInt(peopleList.size());

//            for(Person person: peopleList){
//                os.writeObject(person);
//            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
