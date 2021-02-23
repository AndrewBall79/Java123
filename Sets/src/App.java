import java.util.*;

public class App {
    public static void main(String[] args) {

        //Hast set does not retain order.
        Set<String> set1 = new HashSet<String>();

        set1.add("dog");
        set1.add("cat");
        set1.add("cow");
        set1.add("mouse");
        set1.add("bird");

        // adding duplicate items doesn't change list

        System.out.println(set1);

        //LinkedHashSet retains order
        Set<String> set2 = new LinkedHashSet<String>();
        set2.add("dog");
        set2.add("cat");
        set2.add("cow");
        set2.add("mouse");
        set2.add("bird");

        System.out.println(set2);

        //TreeSet sorts in natural order
        Set<Integer> set3 = new LinkedHashSet<Integer>();
        set3.add(5);
        set3.add(6);
        set3.add(9);
        set3.add(7);
        set3.add(2);

        System.out.println(set3);

        for(Integer element: set3){
            System.out.println(element);
        }
    }
}
