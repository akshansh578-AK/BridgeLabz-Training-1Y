package com.gla.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsAndLength2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        List<String> words = splitBySpaces(sentence);
        String[][] data = buildWordLengthArray(words);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " -> " + data[i][1]);
        }
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

    private static String[][] buildWordLengthArray(List<String> words) {
        String[][] data = new String[words.size()][2];
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            data[i][0] = word;
            data[i][1] = String.valueOf(word.length());
        }
        return data;
    }
}

