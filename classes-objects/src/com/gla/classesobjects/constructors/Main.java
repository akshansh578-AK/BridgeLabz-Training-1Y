package com.gla.classesobjects.constructors;

public class Main {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Clean Code", "Robert C. Martin");
        defaultBook.displayDetails();
        customBook.displayDetails();
        System.out.println();

        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);
        defaultCircle.displayDetails();
        customCircle.displayDetails();
        System.out.println();

        Person person = new Person("Aman", 22);
        Person copiedPerson = new Person(person);
        person.displayDetails();
        copiedPerson.displayDetails();
        System.out.println();

        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Riya", 204, 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
        System.out.println();

        LibraryBook libraryBook = new LibraryBook("Java in Depth");
        libraryBook.borrowBook("Karan");
        libraryBook.displayDetails();
        System.out.println();

        CarRental carRental = new CarRental("Honda City", 2500.0, 4);
        carRental.displayDetails();
        System.out.println();

        Product product1 = new Product("Laptop", 65000.0);
        Product product2 = new Product("Mouse", 999.0);
        product1.displayDetails();
        product2.displayDetails();
        Product.displayTotalProducts();
        System.out.println();

        Course course = new Course("Object-Oriented Programming");
        course.displayDetails();
        Course.updateInstituteName("BridgeLabz Training Institute");
        course.displayDetails();
        System.out.println();

        Vehicle vehicle = new Vehicle("Sedan");
        vehicle.displayDetails();
        Vehicle.updateRegistrationFee(1500.0);
        vehicle.displayDetails();
    }
}
