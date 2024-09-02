//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mammal", "Huge", 400);
        Dog dog = new Dog();
        Dog yorkey = new Dog("Yorkey", 16);
        Dog retriever = new Dog("Labrador retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(animal, "Fast");
        doAnimalStuff(dog, "Quiet fast");
        doAnimalStuff(yorkey, "Quiet fast");
        doAnimalStuff(retriever, "Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}