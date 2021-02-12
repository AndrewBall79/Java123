import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

class Plant{
    public static final int ID = 7;
    private String name;

    public String  getData(){
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast(){
        return 9;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Machine{
    public void start(){
        System.out.println("Machine farted");
    }
}

class Camera extends Machine{
    public void start(){
        System.out.println("Camera Started");
    }
    public void snap(){
        System.out.println("Photo taken");
    }
}

public class App {
    public static void main(String[] args) {
        // Old way of doing things.
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1);

        // New way of doing things.
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);


        // There can be more than one type argument

        HashMap<Integer, String > map = new HashMap<Integer, String>();

        /// Java 7 now infers the second parameterized class///

        ArrayList<Animal> someList = new ArrayList<>();


        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9*10^18;
        float floatValue = 789.59f;
        double doubleValue = 10^208;

    Machine machine1 = new Machine();
    Camera camera1 = new Camera();

//    camera1.start();
//    machine1.start();
//    camera1.snap();

    //Upcasting
        Machine machine2 = camera1;
//        machine2.start();


        //Downcasting is inherently unsafe
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
//        camera2.snap();

        Machine machine4 = new Machine();

    }
}
