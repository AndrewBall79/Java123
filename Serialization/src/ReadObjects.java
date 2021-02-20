import java.io.*;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {

//        try(FileInputStream fi = new FileInputStream("Serialization/people.txt");
//            ObjectInputStream os = new ObjectInputStream(fi);
//        ){
//            Person[] people = (Person[])os.readObject();
//            for(Person person : people){
//                System.out.println(person);
//            }
//            @SuppressWarnings("unchecked")
//            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
//            for(Person person : peopleList){
//                System.out.println(person);
//            }
//            int num = os.readInt();
//            for(int i = 0; i<num; i++){
//                Person person = (Person)os.readObject();
//                System.out.println(person);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("Serialization/test.txt"))) {
        Person person = (Person)os.readObject();
        System.out.println(person);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
}
