class Machine{
    private String name;
    private int code;

    public Machine(){
        name = "Arnie";
    }

    public Machine(String name){
        System.out.println("constructor 2 running");
        this.name = name;
    }

    public Machine(String name, int code) {
        this.name = name;
        this.code = code;

    }
}

public class MachineApp {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        new Machine();
        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Cocaine Beast", 2983147);
    }
}
