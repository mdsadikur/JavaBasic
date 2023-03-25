package Assignment5;

public class abstruct {

    public abstract class Vehicle {
        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public abstract void start();

        public abstract void stop();
    }

    // Concrete class that extends abstract class
    public class Car extends Vehicle {
        private String color;

        public Car(String make, String model, int year, String color) {
            super(make, model, year);
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public void start() {
            System.out.println("Car is starting");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopped");
        }
    }

    // Interface with abstract methods
    public interface Animal {
        void eat();
        void sleep();
    }

    // Class that implements interface
    public class Cat implements Animal {
        @Override
        public void eat() {
            System.out.println("Animal eating");
        }

        @Override
        public void sleep() {
            System.out.println("Animal sleeping");
        }
    }

    // Abstract class with implemented method
    public abstract class Shape {
        private String color;

        public Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public abstract double getArea();
    }

    // Concrete class that extends abstract class
    public class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Class with implemented methods
    public class MathUtils {
        public  int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }
    }

}
