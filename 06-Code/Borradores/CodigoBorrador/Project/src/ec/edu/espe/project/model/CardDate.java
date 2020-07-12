/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CardDate {

    private int month;
    private int year;

    Scanner dataEntry = new Scanner(System.in);

    public CardDate(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public CardDate() {
        this.month = 0;
        this.year = 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Scanner getDataEntry() {
        return dataEntry;
    }

    public void setDataEntry(Scanner dataEntry) {
        this.dataEntry = dataEntry;
    }

    public int writeMonth() {
        System.out.println("Please write the the month date, that your card has---> PUT THE MONTH NUMBER");
        
            try {
                month = Integer.parseInt(dataEntry.nextLine());
            } catch (Exception exception) {
                System.out.println("Invalidate option, enter a correct option");
                //continue;
            }
        return month;
        }
       
        

    public int writeYear() {
        System.out.println("Please write the yaer date, that your card has");
        try {
                year = Integer.parseInt(dataEntry.nextLine());
            } catch (Exception exception) {
                System.out.println("Invalidate option, enter a correct option");
                //continue;
            }
        
        return year;
    }

    @Override
    public String toString() {
        return "CardDate{" + "month=" + month + ", year=" + year + '}';
    }

}
