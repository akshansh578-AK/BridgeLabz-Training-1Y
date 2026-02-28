package com.gla.classesobjects.constructors;

public class HotelBooking {
    private String guestName;
    private int roomNumber;
    private int nights;

    public HotelBooking() {
        this("Guest", 0, 1);
    }

    public HotelBooking(String guestName, int roomNumber, int nights) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomNumber, other.nights);
    }

    public void displayDetails() {
        System.out.println("HotelBooking: " + guestName + ", Room " + roomNumber + ", Nights " + nights);
    }
}
