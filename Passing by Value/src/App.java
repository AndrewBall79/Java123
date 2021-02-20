import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", numbers);
        doTimings("LinkedList", linkedList);


        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));

        //Indexed for loop
        for(int i=0; i<numbers.size(); i++){
        }

        //enhanced for loop
        for(Integer value: numbers){
        }

        //Removing items (careful)
        numbers.remove(numbers.size() -1);

        App app = new App();

        // List Interface
        List<String> values = new ArrayList<String>();

        //Linked Lists

        int value = 7;
        System.out.println("1. Value is: " + value);

        app.show(value);

        System.out.println("4. Value is: " + value);

        System.out.println();

        Person person = new Person("BOG");
        System.out.println("1. Person is" + person);

        app.show(person);

        System.out.println("4. Person is" + person);
    }

    public void show(int value){
        System.out.println("2. Value is: " + value);

        value = 8;

        System.out.println("3. Value is: " + value);
    }

    //method overloading same name method different argument
    public void show(Person person){
        System.out.println("2. Person is" + person);

        person.setName("sue");

        person = new Person("mic");

        System.out.println("3. Person is" + person);;
    }

    private static void doTimings(String type, List<Integer> list){
        for(int i=0; i<15; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

//        add items at end of list
        for(int i = 0; i<15; i++){
            list.add(i);
        }

//        add items at beginning of list
        for(int i = 0; i<15; i++){
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: "+ (end - start) + " ms for " + type);
    }
}
