public class App {
    public static void main(String[] args) {
        Animal animal = Animal.MOUSE;

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println(Animal.MOUSE.getClass());
                break;
            default:
                break;
        }

        System.out.println(Animal.MOUSE);
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.MOUSE instanceof Animal);

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
