package Assesment;

import java.util.*;

public class question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> counts = new HashMap<>();

        while (scanner.hasNextLine()) {
            String received = scanner.nextLine();
            if (received.isEmpty()) {
                break;
            }
            counts.put(received, counts.getOrDefault(received, 0) + 1);
        }


        counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        scanner.close();
    }
}
