import java.util.Scanner;

public class tut03 {

    public static void main(String[] args) {
        int value = 0;

        while (true) {
//            System.out.println("Hello while loop " + value);

            if (value == 5) {
                break;
            }
            value++;
        }

        for (int i = 0; i < 5; i++) {
//            System.out.printf("Hello for loop %d\n", i);;
        }

        int myInt = 21;
        if (myInt <= 20) {
            System.out.println("Yup, truuue");
        } else if (myInt >= 25) {
            System.out.println("nah brah");
        } else {
//            System.out.println("Tis truly a time for jubilation");
        }


        //create scanner object
        Scanner input = new Scanner(System.in);
        //output prompt
//        System.out.println("Enter a line of text: ");
        //Wait for line of text
        String line = input.nextLine();
        //Repeat their entry
//        System.out.println("You entered: " + line);


        //int[] is a reference type not a value
        int[] values;
        values = new int[3];

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        for (int i = 0; i < values.length - 1; i++) {
//            System.out.println(values[i]);
        }
        int[] numbers = {9, 10, 11};

        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
        }
        //enhanced for
        for (int number : numbers) {
//            System.out.println(number);
        }


        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }



    }
}
