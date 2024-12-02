import java.util.Scanner;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Birds love to eat seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Birds sleep for 10-12 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats enjoy eating fish and meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep for 12-16 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs love eating bones and meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep for 8-14 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

// Main class RunAnimal
public class RunAnimal {
    public static void main(String[] args) {
        Scanner jem = new Scanner(System.in);

        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog:");
        String choice = jem.nextLine().trim();

        Animal animal;
        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid choice.");
            jem.close();
            return;
        }

        // Display animal details
        animal.eat();
        animal.sleep();
        animal.makeSound();

        jem.close();
    }
}
