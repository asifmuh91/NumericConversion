package com.company;

import com.company.Services.NumericMatcher;
import com.company.Services.NumericMatcherImpl;
import com.company.Utility.ReadFile;

import java.util.List;
import java.util.Scanner;

public class Main {
    ReadFile readFile = new ReadFile();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main(); //creating instance of class to call non static methods
        NumericMatcher numericMatcher = new NumericMatcherImpl();
        m.displayWelcomeUserMessages(); //display welcome messages and options
        int option;
        while (true) { //infinite loop will make sure int is inserted always
            try {
                option = scanner.nextInt();
                if ((!(option >= 1 && option <= 2))) { //lazy loop to keep option between only 1 and 2 numbers
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid integer"); //prompt msg to user to force int entry
                scanner.nextLine();//clear scanner line
            }
        }

        if (option == 1) {
            System.out.println("Please Enter Your input");
            do {
                String input = scanner.nextLine();
                if (input.toUpperCase().equals("Q")) { //if user enter q, system will exit
                    System.exit(0);
                }
                if (!input.isEmpty()) {
                    System.out.println(numericMatcher.matchAndConvertMatcher(input)); //if input is not empty, call numeric matcher service and pass the valid input
                }
            } while (scanner.hasNextLine());
        } else { //only 2 integers are allowed so no need to put if else here
            List<String> listOfLines = m.readFile.readInputFile(); //read input file places under config -> input.txt
            for (String x : listOfLines) {
                System.out.println(numericMatcher.matchAndConvertMatcher(x));  //loop through the lines and call numeric matcher service
            }
        }

    }


    private void displayWelcomeUserMessages() {
        System.out.println("************************************************");
        System.out.println("************************************************");
        System.out.println("Welcome to Alpha Number Conversion Application");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("Please choose one of the following Options by typing the option and hit Enter to proceed");
        System.out.println("1) If you want to write manually using console");
        System.out.println("2) If you want to write using File");
        System.out.println("P.S. Please Note file must be stored under 'config' folder under name of input.txt to be able for application to read");
        System.out.println("enter q and hit enter enter anytime to close the application");
    }


}

