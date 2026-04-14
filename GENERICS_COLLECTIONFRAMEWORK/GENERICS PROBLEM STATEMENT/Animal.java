class Animal {
    void speak() { System.out.println("Animal sound"); }
}

class Dog extends Animal {}
class Cat extends Animal {}

class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }
}