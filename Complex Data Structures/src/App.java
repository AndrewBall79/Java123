import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };
    public static String[][] drivers = {
            {"Fred", "Sue", "Peat"},
            {"Sue", "Richard", "Fred"},
            {"Pete", "Mary", "Bob"},
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }
            personnel.put(vehicle, driverSet);
            System.out.println(vehicle);
        }

        {// Example usage
            Set<String> driversList = personnel.get("ambulance");

            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterate through whole complex array
        for (String vehicle : personnel.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = personnel.get(vehicle);

            for (String driver: driversList){
                System.out.print(driver);
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}

// 10 Tips to Become a Better Programmer
// 10. Learn to touch type
// 9. Name variables and subroutines descriptively
// 8. Type rather than read
// 7. Write software that interests you
// 6. Read stack traces from the top line down
// 5. Aim to write the smallest working program possible
// 4. Google
// 3. Build programs one step at a time
// 2. Ensure braces pair up
// 1. Format code correctly
