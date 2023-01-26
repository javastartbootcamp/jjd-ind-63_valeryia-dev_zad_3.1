package pl.javastart.task;

public class Wardrobe {
    String material;
    String color;
    int doorsNumber;
    Wardrobe(String material, String color, int doorsNumber){
        this.material = material;
        this.color = color;
        this.doorsNumber = doorsNumber;

    }
    void printInfo(){
        System.out.println(color + " " + "wardrobe has" + " " + doorsNumber + " " + "doors and is made of" + " " + material + ".");
    }
}
