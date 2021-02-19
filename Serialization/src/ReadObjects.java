import java.io.*;

public class ReadObjects {
    public static void main(String[] args) {

        try(FileInputStream fi = new FileInputStream("Serialization/people.txt")){
            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();
            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
