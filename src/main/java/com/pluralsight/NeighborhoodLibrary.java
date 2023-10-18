package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[20];

    private static int numOfBooks = 5;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        books[0] = new Book(0301, "132", "WompWomp", true, "Ranch");
        books[1] = new Book(11111, "2323", "Crocodile", false, "Mr. Croc");
        books[2] = new Book(2222, "23132", "Ice Cream in Winter is Better", true, "Frosty TSM");
        books[3] = new Book(1231, "7263", "dOES tHiS tITlEE bOThEr yOU?", false, "");
        books[4] = new Book(2938, "219", "The Secret to", false, "");

        while (true) {

            System.out.println("Digital Library Home Screen   ^ u ^\n");
            System.out.println("What would you like to do?");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Books Checked Out");
            System.out.println("3 - Exit the program\n");
            System.out.println("Awaiting user input: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");

            switch (userInput) {
                case 1:
                    System.out.println("Available books: \n");
                    availableBooks();
                    checkingOutBook();
//                    System.out.println("\nRerouting to Home Screen...\n");
                    break;
                case 2:
                    System.out.println("Checked out books: \n");
                    unavailableBooks();
                    options();
//                    System.out.println("\nRerouting to Home Screen...\n");
                    break;
                case 3:
                    System.out.println("Hope you have a great day! Goodbye!");
                    return;


            }
        }


    }

    //make a method that makes it so if the book is checked out, it prints that book
    //void bc we dont need to save the info; check a book-list called books
    //NEEDS TO BE OUTSIDE OF MAIN
    public static void availableBooks() {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getIsCheckedOut() == false) {
                System.out.println("Book: " + "\"" + books[i].getTitle() + "\", ID: " + books[i].getId() +
                        ", ISBN: " + books[i].getIsbn() + "\n");
            }
        }
    }

    public static void checkingOutBook() {
        System.out.println("Would you like to check out a book?\n Yes or No");
        String choice = scanner.nextLine().trim();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter your name for checkout: ");
            String name = scanner.nextLine().trim();
            System.out.println("Enter the title of the book you want to check out:");
            String title = scanner.nextLine();

            for (int b = 0; b < numOfBooks; b++) {
                if (books[b].getTitle().equalsIgnoreCase(title)) {
                    books[b].checkOut(name);
                }
            }

        } else if(choice.equalsIgnoreCase("no")) {
            System.out.println("Rerouting you to the main screen...");
        } else{
            System.out.println("Learn to follow directions, bud. \n Sending you back to " +
                    "main screen...");
        }
    }


    public static void unavailableBooks() {
        for (int a = 0; a < numOfBooks; a++) {
            if (books[a].getIsCheckedOut()) {
                System.out.println("The book: \"" + books[a].getTitle() + "\", ID: " + books[a].getId() +
                        ", ISBN: " + books[a].getIsbn() + ", is currently in the possession of: " +
                        books[a].getCheckedOutTo() + "\n");
            }
        }
    }

    public static void options() {

        System.out.println("Would you like to: \n C - Check In a book \n X - Go back to Home Screen");
        char choice = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        //char. have to be wrapped in single quotations
        if (choice == 'C') {
            System.out.println("What's the ID of the book you want to check in?");
            int id = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < numOfBooks; i++){
                if(id == books[i].getId()){
                    books[i].checkIn();
                }
            }
        } else if (choice == 'X') {
            System.out.println("Rerouting to main screen...");

        } else {
            System.out.println("Read the options, bozo");
        }
    }
}
