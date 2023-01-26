package pl.javastart.task;

public class WardrobeTest {

    public static void main(String[] args) {
        Wardrobe war1 = new Wardrobe("Plywood", "Black", 4);

        Wardrobe war2 = new Wardrobe("MDF", "White", 6);

        war1.printInfo();
        war2.printInfo();
    }
}
