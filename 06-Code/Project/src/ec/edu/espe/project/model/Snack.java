/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;

/**
 *
 * @author camilavenegas
 */
public class Snack {

    private double snackPrice;
    private int chip;
    private int peanut;
    private int bubblegum;
    private int chipPrice = 1;
    private int peanutPrice = 1;
    private int bubblegumPrice = 1;

    /*public int select( int chip, int peanut, int bubblegum){
         //int requierement[3];
         //return requirement[];
         return 0;
    }*/
    Scanner dataEntry = new Scanner(System.in);

    public Snack(int chip, int peanut, int bubblegum) {
        this.chip = chip;
        this.peanut = peanut;
        this.bubblegum = bubblegum;
    }

    public Snack() {
        this.chip = 0;
        this.peanut = 0;
        this.bubblegum = 0;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public int getPeanut() {
        return peanut;
    }

    public void setPeanut(int peanut) {
        this.peanut = peanut;
    }

    public int getBubblegum() {
        return bubblegum;
    }

    public void setBubblegum(int bubblegum) {
        this.bubblegum = bubblegum;
    }

    public int getChipPrice() {
        return chipPrice;
    }

    public void setChipPrice(int chipPrice) {
        this.chipPrice = chipPrice;
    }

    public int getPeanutPrice() {
        return peanutPrice;
    }

    public void setPeanutPrice(int peanutPrice) {
        this.peanutPrice = peanutPrice;
    }

    public int getBubblegumPrice() {
        return bubblegumPrice;
    }

    public void setBubblegumPrice(int bubblegumPrice) {
        this.bubblegumPrice = bubblegumPrice;
    }

    public Scanner getDataEntry() {
        return dataEntry;
    }

    public void setDataEntry(Scanner dataEntry) {
        this.dataEntry = dataEntry;
    }

   
    @Override
    public String toString() {
        return "Snack{" + "chip=" + chip + ", peanut=" + peanut + ", bubblegum=" + bubblegum + '}';
    }
    
    

    public double select() {
        System.out.println("How many chips do you want?");
        chip = dataEntry.nextInt();
        chipPrice = chip;
        System.out.println("How many peanuts do you want");
        peanut = dataEntry.nextInt();
        peanutPrice = peanut;
        System.out.println("How many bubblegums do you want");
        bubblegum = dataEntry.nextInt();
        bubblegumPrice = bubblegum;
        snackPrice = chipPrice + peanutPrice + bubblegumPrice;

        return snackPrice;

    }

}

