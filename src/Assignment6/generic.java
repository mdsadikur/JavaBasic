package Assignment6;
import java.util.ArrayList;
public class generic {


        public static void main(String[] args) {
            // Create an ArrayList of strings using generics
            ArrayList<String> names = new ArrayList<String>();

            // Add elements to the ArrayList
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Iterate over the ArrayList and print each element
            for (String name : names) {
                System.out.println(name);
            }
        }
    }


