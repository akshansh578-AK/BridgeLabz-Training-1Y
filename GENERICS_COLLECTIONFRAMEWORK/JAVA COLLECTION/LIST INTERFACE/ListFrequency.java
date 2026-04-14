import java.util.*;

public class ListFrequency {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> freq = new HashMap<>();

        for (String item : list) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        System.out.println(freq);
    }
}