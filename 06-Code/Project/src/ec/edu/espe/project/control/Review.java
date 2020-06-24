/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Review {

    Scanner dataEntry = new Scanner(System.in);

    public int validateNegative(int theVariable) {
        if (theVariable < -1) {
            System.out.println("The number written is incorrect");
            System.out.println("Please try again");
        }

        return 0;
    }

    public String validateLongData(String variable) {
        String copyVariable = "";
        if (variable.length() < 10 || variable.length() > 10) {
            System.out.println("Enter a valid Card");
        } else {
            copyVariable = variable;
        }
        return copyVariable;
    }

    public int validateDate(int year) {
        int actualMonth = 6;
        int actualYear = 2020;
        if (year < actualYear) {
            System.out.println("Your card has expired.");
        } else if (year == actualYear) {
            System.out.println("Please entry the month of your card");
            int copyMonth = dataEntry.nextInt();
            if (copyMonth < actualMonth) {
                System.out.println("Your card has expired.");
            } else {
                return year;
            }
        }
        return year;
    }
}
