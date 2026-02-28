package com.gla.classesobjects.level2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aman", 101, 88.5);
        student.displayStudentDetails();
        System.out.println();

        BankAccount bankAccount = new BankAccount("Riya", "AC12345", 5000.0);
        bankAccount.deposit(1500.0);
        bankAccount.withdraw(1200.0);
        bankAccount.displayBalance();
        System.out.println();

        PalindromeChecker palindromeChecker = new PalindromeChecker("Nurses Run");
        palindromeChecker.displayResult();
        System.out.println();

        MovieTicket movieTicket = new MovieTicket("Inception", "B12", 350.0);
        movieTicket.bookTicket();
        movieTicket.displayTicketDetails();
        System.out.println();

        CartItem cartItem = new CartItem("Wireless Mouse", 899.0, 2);
        cartItem.addItem(1);
        cartItem.removeItem(1);
        cartItem.displayTotalCost();
    }
}
