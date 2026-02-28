package com.gla.methods.level1;

import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int peopleCount) {
        return peopleCount * (peopleCount - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int peopleCount = scanner.nextInt();

        System.out.println("Maximum handshakes: " + calculateHandshakes(peopleCount));
        scanner.close();
    }
}
