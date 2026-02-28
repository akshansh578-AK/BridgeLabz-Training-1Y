package com.gla.methods.level1;

import java.util.Scanner;

public class WindChillCalculator {
    // Wind chill formula for Celsius and km/h.
    public static double calculateWindChill(double temperatureCelsius, double windSpeedKmph) {
        return 13.12
                + 0.6215 * temperatureCelsius
                - 11.37 * Math.pow(windSpeedKmph, 0.16)
                + 0.3965 * temperatureCelsius * Math.pow(windSpeedKmph, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed in km/h: ");
        double windSpeed = scanner.nextDouble();

        System.out.println("Wind Chill Index: " + calculateWindChill(temperature, windSpeed));
        scanner.close();
    }
}
