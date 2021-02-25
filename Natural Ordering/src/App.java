import java.util.*;



public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<String> set = new TreeSet<String>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        System.out.println(list);
        System.out.println();
        System.out.println(set);
    }
    private static void addElements(Collection<String> col){
        col.add("Joe");
        col.add("Sue");
        col.add("Ponce");
        col.add("Celine");
        col.add("Petunia");
    }

    private static void showElements(Collection<String> col){
        for(String element: col){
            System.out.println(element);
        }
    }
}

