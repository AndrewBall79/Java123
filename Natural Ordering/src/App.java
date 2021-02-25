import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {
        int len1 = name.length();
        int len2 = person.name.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            //use alphabetical order if names are equal length
            return name.compareTo(person.name);
        }
    }
}

public class App {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        Set<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        System.out.println(list);
        System.out.println();
        System.out.println(set);
    }
    private static void addElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Ponce"));
        col.add(new Person("Celine"));
        col.add(new Person("Petunia"));
    }

    private static void showElements(Collection<Person> col){
        for(Person element: col){
            System.out.println(element);
        }
    }
}

