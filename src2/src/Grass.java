import world.Plant;

public class Grass extends Plant {
    public Grass() {
        //wont work --- Grass not in same package as plant, even though it's a subclass
        //System.out.println(this.height);
    }

}
