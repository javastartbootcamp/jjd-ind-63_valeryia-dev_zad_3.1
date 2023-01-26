package pl.javastart.task;

public class WardrobeTest {

    public static void main(String[] args) {
        Wardrobe war1 = new Wardrobe();
        war1.material = "Plywood";
        war1.color = "Black";
        war1.doorsNumber = 4;

        Wardrobe war2 = new Wardrobe();
        war2.material = "MDF";
        war2.color = "White";
        war2.doorsNumber = 6;

        war1.printInfo();
        war2.printInfo();
    }
}
