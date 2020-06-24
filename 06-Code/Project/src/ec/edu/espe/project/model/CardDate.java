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
    
    Scanner dataEntry= new Scanner (System.in);

    public CardDate(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int setMonth() {
        System.out.println("Write the month in which your card is validate");
        this.month = dataEntry.nextInt();
        return month;
    }

    public int getYear() {
        return year;
    }

    public int setYear() {
        System.out.println("Write the year in which your card is validate");
        this.year = dataEntry.nextInt();
        return year;
    }
    
    

    @Override
    public String toString() {
        return "CardDate{" + "month=" + month + ", year=" + year + '}';
    }
    
    
    
    
    
}
