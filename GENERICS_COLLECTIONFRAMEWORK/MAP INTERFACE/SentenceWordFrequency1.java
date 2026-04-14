import java.util.*;

public class SentenceWordFrequency1 {

    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        Map<String, Integer> freqMap = new HashMap<>();

        // Step 1: Normalize (lowercase + remove punctuation)
        sentence = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        // Step 2: Split sentence into words
        String[] words = sentence.split("\\s+");

        // Step 3: Count frequency
        for (String word : words) {
            if (word.isEmpty()) continue;

            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Print result
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}