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
                    availableBooks();
                    System.out.println("\nRerouting to Home Screen...\n");
                    break;
                case 2:
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
                        ", ISBN: " + books[i].getIsbn() + " is available. \n");
            }
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

    public static char options() {

        System.out.println("Would you like to: \n C - Check In a book \n X - Go back to Home Screen");
        char choice = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        return choice;
        if(choice == C) {
            System.out.println("What's the ID of the book you want to check in?");

        } else if (choice == X) {
            return();
        }else{
            System.out.println("Read the instructions, bozo");
        }
    }


}
