import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "five");
        map.put(8, "eight");
        map.put(3, "three");
        map.put(7, "seven");
        map.put(2, "two");

        map.put(2, "hello");

        String text = map.get(2);

        System.out.println(text);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }

    }
}
