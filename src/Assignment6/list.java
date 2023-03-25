package Assignment6;
import java.util.ArrayList;
import java.util.List;
public class list {
        public static void main(String[] args) {
            // Create a List of strings
            List<String> names = new ArrayList<String>();

            // Insert elements into the List
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("Dave");

            // Update an element in the List
            names.set(2, "Charlie Updated");

            // Delete an element from the List
            names.remove(0);

            // Search for an element in the List
            if (names.contains("Bob")) {
                System.out.println("Bob found in the List");
            } else {
                System.out.println("Bob not found in the List");
            }

            // Add a duplicate element to the List
            names.add("Dave");

            // Use a for-each loop to iterate over the List
            for (String name : names) {
                System.out.println(name);
            }
        }
    }


