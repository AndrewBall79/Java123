import java.io.*;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person mike = new Person(543, "Mike");
        Person sue = new Person(123, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        try(FileOutputStream fs = new FileOutputStream("Serialization/people.txt")){
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
