package com.gla.classesobjects.level2;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.booked = false;
    }

    public void bookTicket() {
        booked = true;
    }

    public void displayTicketDetails() {
        System.out.println("=== Movie Ticket Details ===");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booked: " + booked);
    }
}
