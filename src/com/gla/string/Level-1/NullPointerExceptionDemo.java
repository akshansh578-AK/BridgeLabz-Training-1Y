package com.gla.string;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            int length = getNullStringLength();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    private static int getNullStringLength() {
        String text = null;
        return text.length();
    }
}

