abstract class Animal {
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
}
class Lion extends Animal {
    String name = "Leo";
    public void printName() {
        System.out.println(name);
    }
}

public class PlayWithAnimal {
    public static void main(String... args) {
        Animal animal = new Lion();
        System.out.println(animal.name);
        animal.printName();
    }
}