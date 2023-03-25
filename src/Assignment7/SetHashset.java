package Assignment7;

import java.util.HashSet;
import java.util.Set;
public class SetHashset {
        public static void main(String[] args) {

            Set<Integer> numbers = new HashSet<Integer>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);

            System.out.println("Set of Numbers: " + numbers);

            numbers.remove(2);

            System.out.println("Set of Numbers after removal: " + numbers);
        }
    }


