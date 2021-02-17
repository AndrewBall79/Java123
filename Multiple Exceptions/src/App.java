import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
//        Runtime exception
//        int value = 7;
//        value = value/0;

//        Null Pointer exception
//        String text = null;
//        text.length();


//        ArrayIndexOutOfBoundsException
      try{
        String[] texts = {"one", "two", "three"};
        System.out.println(texts[6]);
      } catch (RuntimeException e){
          System.out.println(e.toString());
      }
//        Test test = new Test();

//        try {
//            test.run();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            System.out.println("Couldn't Parse File");
//        }

//        try {
//            test.run();
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }

//        try {
//            test.run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            test.input();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
