import java.util.*;

class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + ": " + name;
    }
}

public class App {
    public static void main(String[] args) {

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person, Integer> mapPersonMap = new LinkedHashMap<Person, Integer>();

        Set<Person> set = new HashSet<Person>();

        System.out.println(set);

        Map<String, Integer> mapSetString = new HashMap<String, Integer>();
        mapSetString.put("one", 1);
        mapSetString.put("two", 2);
        mapSetString.put("three", 3);
        mapSetString.put("one", 1);

        for (String key: mapSetString.keySet()){
            System.out.println(key + ": " + mapSetString.get(key));
        }

        //Hast set does not retain order.
        Set<String> set1 = new HashSet<String>();

        if (set1.isEmpty()){
            System.out.println("Set is empty");
        }

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

        // Iteration

        for(Integer element: set3){
            System.out.println(element);
        }

        // Does set contain a given item?

        if (set1.contains("aardvark")){
            System.out.println("Contains aardvark");
        }else {
            System.out.println("Does not contain aardvark");
        }
        if (set1.contains("cat")){
            System.out.println("Contains cat");
        } else {
            System.out.println("Does not contain cat");
        }
        if (set1.isEmpty()){
            System.out.println("Set is empty");
        }else{
            System.out.println("Set contains items: " + set1);
        }

        // Intersection //

        Set<String> set4 = new HashSet<String>();

        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");

        Set<String> intersection = new HashSet<String>(set1);

        intersection.retainAll(set4);

        System.out.println("Intersection of set 1 and set 4: " + intersection);


        /// Difference ///

        Set<String> difference = new HashSet<String>(set1);

        difference.removeAll(set4);

        System.out.println();

        System.out.println(difference);
    }
}
