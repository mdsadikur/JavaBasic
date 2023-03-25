package Assignment6;

public interface interfaces {

        // Constant variable
         String TYPE = "Land";

        // Abstract method
         void start();

        // Default method
         default void stop() {
            System.out.println("Vehicle stopped.");
        }

        // Static method
         static void displayType() {
            System.out.println("Type: " + TYPE);
        }

        // Private method
        private void accelerate() {
            System.out.println("Vehicle accelerated.");
        }

        // Private static method
        private static void brake() {
            System.out.println("Vehicle braked.");
        }
    }


