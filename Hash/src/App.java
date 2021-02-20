import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String >();

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        //observe the orders in which the maps are kept.
        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);

    }
    public static void testMap(Map<Integer, String> map){
        map.put(5, "cow");
        map.put(8, "donkey");
        map.put(3, "spider");
        map.put(7, "snake");
        map.put(2, "bat");
        map.put(1, "cat");
        map.put(4, "monkey");
        map.put(9, "bird");
        map.put(10, "dinosaur");
        map.put(11, "tiger");
        map.put(12, "hello");
        map.put(6, "goat");

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": " + value );
        }

//        for (Map.Entry<Integer, String> entry: map.entrySet()) {
//            int key = entry.getKey();
//            String value = entry.getValue();
//
//            System.out.println("Other for loop: " + key + ": " + value);
//        }
    }
}
