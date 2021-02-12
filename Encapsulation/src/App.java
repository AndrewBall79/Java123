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


public class App {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9*10^18;
        float floatValue = 789.59f;
        double doubleValue = 10^208;

        System.out.println(Math.round(floatValue));
    }
}
