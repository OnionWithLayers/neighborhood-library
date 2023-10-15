package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[20];

    private static int numOfBooks = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        books[0] = new Book(0301, "132", "WompWomp", true, "Ranch");
        books[1] = new Book(11111, "2323", "Crocodile", false, "Mr. Croc");
        books[2] = new Book(2222, "23132", "Ice Cream in Winter is Better", true, "Frosty TSM");
        books[3] = new Book(1231, "7263", "dOES tHiS tITlEE bOThEr yOU?", false, "");
        books[4] = new Book(2938, "219", "The Secret to", false, "");

        while (true) {

            System.out.println("Digital Library Home Screen   ^ u ^");
            System.out.println("What would you like to do?");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Books Checked Out");
            System.out.println("3 - Exit the program");
            System.out.println("Awaiting user input: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();


            switch (userInput) {
                case 1:
                    availableBooks();
                    break;
                case 2:

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
                System.out.println("\n Book: " + "\"" + books[i].getTitle() + "\", ID: " + books[i].getId() +
                        ", ISBN: " + books[i].getIsbn() + " is available. \n");
            }
        }
    }

    public static void unavailableBooks(){
        for (int a = 0; a < numOfBooks; a++){
            if(books[a].getIsCheckedOut()){
                System.out.println();
            }
        }
    }

}
