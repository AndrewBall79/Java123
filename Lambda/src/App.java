
// Function interface : interface that only contains one method
interface Executable{
    int execute(int a, int b);
}

interface StringExecutable{
    int execute(String a);
}
class Runner {
    public void run(Executable e){
        System.out.println("Executing code block ...");
        int value = e.execute(12, 51);
        System.out.println("Return value is: " + value);
    }
    public void run(StringExecutable e){
        System.out.println("Executing code block ...");
        int value = e.execute("String Executable Running Code Block ... Finalizing");
        System.out.println("Return value is: " + value);
    }

}

// New Lambda syntax
//() => {
//        System.out.println("This is a lambda expression");
//        System.out.println("Hello boitches!!!");
//
//        }


public class App {
    public static void main(String[] args) {

        // Effectively final
        int c = 100;


        Runner runner = new Runner();

        ///The classic way of doing things exists here
        runner.run(new Executable() {
            public int execute(int a, int b) {
                System.out.println("Hello There. ");
                return c + a + b;
            }
        });
        System.out.println();
        System.out.println("==================");
        System.out.println();

        // The java8 way of doing things exists here. Note the missing "int" on second LAMBDA
        runner.run((int a, int b) -> {
            System.out.println("This is a lambda expression");
            System.out.println("Hello boitches!!!");
            return 8 + b;
        });

        System.out.println();
        System.out.println("==================");
        System.out.println();

        runner.run((int a, int b)-> a + b + 1);

        System.out.println();
        System.out.println("==================");
        System.out.println();

        runner.run((String  a) -> 1);
    }
}
