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
        System.out.println("Machine Started");
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
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9*10^18;
        float floatValue = 789.59f;
        double doubleValue = 10^208;

    Machine machine1 = new Machine();
    Camera camera1 = new Camera();

    camera1.start();
    machine1.start();
    camera1.snap();

    //Upcasting
        Machine machine2 = camera1;
        machine2.start();


        //Downcasting is inherently unsafe
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.snap();

        Machine machine4 = new Machine();

    }
}
