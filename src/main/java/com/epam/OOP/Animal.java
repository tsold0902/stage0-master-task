package com.epam.OOP;

class Dog extends Animal {
    public Dog() {
        super("brown", 4, true); // Assuming default values for a dog
    }

    // You can add additional properties and methods specific to a Dog
}

class Bird extends Animal {
    public Bird() {
        super("colorful", 2, false); // Assuming default values for a bird
    }

    // You can add additional properties and methods specific to a Bird
}

public class Animal {
    // ... existing code

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Bird myBird = new Bird();

        Animal myAnimal = new Animal("black", 2, true); // TASK 1
        System.out.println(myAnimal.getDescription());

        System.out.println("Dog: " + myDog.getDescription());
        System.out.println("Bird: " + myBird.getDescription());
    }
}

