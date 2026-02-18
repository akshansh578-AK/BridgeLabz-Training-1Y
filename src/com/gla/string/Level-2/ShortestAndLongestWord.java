package com.gla.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestAndLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        List<String> words = splitBySpaces(sentence);
        if (words.isEmpty()) {
            System.out.println("No words found.");
            scanner.close();
            return;
        }

        String shortest = words.get(0);
        String longest = words.get(0);
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
        scanner.close();
    }

    private static List<String> splitBySpaces(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(c);
            }
        }
        if (current.length() > 0) {
            words.add(current.toString());
        }
        return words;
    }
}

