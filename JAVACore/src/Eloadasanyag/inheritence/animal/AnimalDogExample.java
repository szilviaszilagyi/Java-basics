package Eloadasanyag.inheritence.animal;

public class AnimalDogExample {
    public static void main(String[] args) {
        Animal frank = new Animal("Frank", 2, 23.53);
        System.out.println("Name: " + frank.getName());
        System.out.println("Age: " + frank.getAge());
        System.out.println("Mass: " + frank.getMass());

        Dog bob = new Dog("Bob", 7, 33.33, "ball");
        System.out.println("Name: " + bob.getName());
        System.out.println("Age: " + bob.getAge());
        System.out.println("Mass: " + bob.getMass());
        System.out.println("Toy: " + bob.getToy());

        bob.play();

    }
}
