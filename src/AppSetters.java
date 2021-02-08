class Frog {
    private int id;
    private String name;
    private int age;

    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return String.format("%4d: %s", id, name);
//        StringBuilder sb = new StringBuilder();
//        sb.append(id).append(": ").append(name);
//        return sb.toString();

    }
}


public class AppSetters {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Bob");
        Frog frog2 = new Frog(5, "Rogert");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}

