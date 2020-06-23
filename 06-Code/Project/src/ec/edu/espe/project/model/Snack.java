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
public class Snack {
    private double snackPrice;
    private int chip;
    private int peanut;
    private int bubblegum;
    private int chipPrice=1;
    private int peanutPrice=1;
    private int bubblegumPrice=1;
    
     
    /*public int select( int chip, int peanut, int bubblegum){
         //int requierement[3];
         //return requirement[];
         return 0;
    }*/
    Scanner dataEntry= new Scanner(System.in);

    public Snack(int chip, int peanut, int bubblegum) {
        this.chip = chip;
        this.peanut = peanut;
        this.bubblegum = bubblegum;
    }

    public Snack(){
        this.chip = 0;
        this.peanut = 0;
        this.bubblegum = 0;
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
    
    @Override
    public String toString() {
        return "Snack{" + "chip=" + chip + ", peanut=" + peanut + ", bubblegum=" + bubblegum + '}';
    }
    
    public double select(){
        System.out.println("How many chips do you want?");
        chip= dataEntry.nextInt();
        chipPrice=chip;
        System.out.println("How many peanuts do you want");
        peanut= dataEntry.nextInt();
        peanutPrice= peanut;
        System.out.println("How many bubble gums do you want");
        bubblegum= dataEntry.nextInt();
        bubblegumPrice=bubblegum;
        snackPrice= chipPrice+ peanutPrice+bubblegumPrice;
        
        
        return snackPrice;
        
    }
    
    
}
