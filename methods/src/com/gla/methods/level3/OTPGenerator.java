package com.gla.methods.level3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class OTPGenerator {
    public static String generateOtp(int length) {
        Random random = new Random();
        StringBuilder otpBuilder = new StringBuilder();
        for (int index = 0; index < length; index++) {
            otpBuilder.append(random.nextInt(10));
        }
        return otpBuilder.toString();
    }

    public static boolean hasUniqueDigits(String otp) {
        Set<Character> digits = new HashSet<>();
        for (char digit : otp.toCharArray()) {
            if (!digits.add(digit)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP length: ");
        int length = scanner.nextInt();

        String otp;
        do {
            otp = generateOtp(length);
        } while (!hasUniqueDigits(otp));

        System.out.println("Generated OTP: " + otp);
        System.out.println("Unique digits: " + hasUniqueDigits(otp));
        scanner.close();
    }
}
