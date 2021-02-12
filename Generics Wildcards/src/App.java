import java.util.ArrayList;

class Machine{
    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start(){
        System.out.println("machine starting");
    }
}

class Camera extends Machine{
    @Override
    public String toString() {
        return "I am a camera";
    }
    public void snap(){
        System.out.println("snap");
    }
    public void start(){
        System.out.println("Camera starting");
    }
}

public class App {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        showList(list);

        ArrayList<Machine> machineList = new ArrayList<>();
        machineList.add(new Machine());
        showMachineList(machineList);

        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        showMachineList(list2);
        showList2(list2);
    }

    public static void showList(ArrayList<String> listShow){
        for(String value: listShow){
            System.out.println(value);
        }
    }

    public static void showMachineList(ArrayList<? extends Machine> machineList){
        for (Machine value: machineList){
            System.out.println(value);
            value.start();
        }
    }

    public static void showList2(ArrayList<?> machineList){
        for (Object value: machineList){
            System.out.println(value);
        }
    }

}
