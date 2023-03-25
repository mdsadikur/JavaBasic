package Assesment;

import java.util.*;

public class SemVerSorter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> versionMap = new HashMap<>();

        // Taking input
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split("\\s+");
            if (line.length < 2) {
                break;
            }
            versionMap.put(line[0], line[1]);
        }

        // Sorting and printing output
        List<String> titles = new ArrayList<>(versionMap.values());
        Collections.sort(titles, new SemVerComparator());
        titles.forEach(System.out::println);

        sc.close();
    }
}

class SemVerComparator implements Comparator<String> {

    @Override
    public int compare(String title1, String title2) {
        String[] ver1 = title1.split("\\s+")[0].split("-");
        String[] ver2 = title2.split("\\s+")[0].split("-");
        String[] parts1 = ver1[0].split("\\.");
        String[] parts2 = ver2[0].split("\\.");

        // Comparing major, minor and patch versions
        for (int i = 0; i < 3; i++) {
            int diff = Integer.parseInt(parts1[i]) - Integer.parseInt(parts2[i]);
            if (diff != 0) {
                return diff;
            }
        }

        // Comparing pre-release tags
        if (ver1.length > 1 && ver2.length > 1) {
            return ver1[1].compareTo(ver2[1]);
        } else if (ver1.length > 1) {
            return -1;
        } else if (ver2.length > 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

