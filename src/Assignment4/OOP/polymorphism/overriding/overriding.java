package Assignment4.OOP.polymorphism.overriding;

public class overriding {

    public class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }

    public class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }
}
