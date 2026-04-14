import java.util.*;

public class CountryCapital {

    public static void main(String[] args) {

        // Map to store country -> capital
        Map<String, String> map = new HashMap<>();

        // 1. Add 8 country-capital pairs
        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Italy", "Rome");
        map.put("Canada", "Ottawa");
        map.put("Australia", "Canberra");

        // 2. Lookup (simulated user input)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        if (map.containsKey(country)) {
            System.out.println("Capital: " + map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        // 3. Print all sorted by country name
        System.out.println("\nCountries in alphabetical order:");

        Map<String, String> sortedMap = new TreeMap<>(map);

        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}