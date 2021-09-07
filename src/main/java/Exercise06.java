/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;
import java.time.YearMonth;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currentAge = input.nextLine(); //Reads the current age input.
        System.out.print("At what age would you like to retire? ");
        String retirementAge = input.nextLine(); //Reads the retirement age input.

        int i = Integer.parseInt(currentAge); //Converting string into int.
        int j = Integer.parseInt(retirementAge);
        int year = YearMonth.now().getYear(); //Getting current year from computer's calendar.

        System.out.println("You have " + (j-i) + " years left until you can retire.");
        System.out.println("It's " + year + ",2 so you can retire in " + (year+(j-i)) + ".");

    }
}
