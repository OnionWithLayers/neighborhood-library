package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[20];

        books[0] = new Book(0301,"132", "WompWomp", true, "Ranch");
        books[1] = new Book(11111, "2323", "Crocodile", false, "Mr. Croc");
        books[2] = new Book(2222, "23132", "Ice Cream in Winter is Better", true, "Frosty TSM");
        

        int id[] = {0301, 11111, 222222, 3333, 44444, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19,};
        String isbn[] = {"132", "2323", "12321", "1231", "121", "343", "543", "567", "777",
                "222", "543", "197", "96", "767", "1268", "8039", "8939",
                "998", "275", "38254"};
        String title[] = {"WompWomp", "Crocodile", "Ice Cream in Winter is Better",
                "dOES tHiS tITlEE bOThEr yOU?", "The Secret to"};
        boolean checkedOut[] = {true, false, true, false, false};
        String checkedTo[] = {"Ranch", "Mr. Croc", "Frosty", "", ""};


        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(id[i], isbn[i], title[i], checkedOut[i], checkedTo[i]);


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
                if(checkedOut[i]){
                    System.out.println(books[i]);
                }
            }

                //add this to a switch method


                //   System.out.println(books[i] + "\n");
            }


        }
    }
}