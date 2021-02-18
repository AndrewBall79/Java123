import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(BufferedWriter bW = new BufferedWriter(new FileWriter(file))){
           bW.write("This is line one");
           bW.newLine();
           bW.write("This is line two");
           bW.newLine();
           bW.write("Last Line.");

        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
}
