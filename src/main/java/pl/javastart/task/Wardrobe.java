package pl.javastart.task;

public class Wardrobe {
    String material;
    String color;
    int doorsNumber;
    Wardrobe(){ //napisane w zadaniu stworzyć konstruktor domyślny,wiem, że program kompiluje automatycznie

    }
    void printInfo(){
        System.out.println(color + " " + "wardrobe has" + " " + doorsNumber + " " + "doors and is made of" + " " + material);
    }
}
