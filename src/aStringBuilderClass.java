

public class aStringBuilderClass {
    public static void main(String[] args) {
        String info = "";
        info += "My name is ...";
        info += " ";
        info += "no buildey";

        StringBuilder sb = new StringBuilder("");

        sb.append("HELLO,").append(" ").append("Don't eat my cat.");

        System.out.println(sb.toString());

        System.out.println("Here is the text.\nThat's a new line \n\tThat's a new line and a tab.");

        System.out.printf("Total cost $%-4d; quantity is %d\n", 5, 120);

        for (int i = 0; i<2; i++){
            System.out.printf("%-2d: %s,\n", i, "here is some text");
        }

        System.out.printf("total value: $%.2f\n", 5.687);
        System.out.printf("total value: $%-5.2f\n", 554.6874545);
    }
}
