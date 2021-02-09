import ocean.fish.Fish;
import ocean.plants.Seaweed;

class Robot{
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height + " feet");
    }
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " meters " + direction );

    }
}

public class App {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
        Robot sam = new Robot();
        sam.speak("Hi I'm SAM.");
        sam.jump(7);
        sam.move("west", 1.5);
        String greeting = "Hello There";
        sam.speak(greeting);

    }
}
