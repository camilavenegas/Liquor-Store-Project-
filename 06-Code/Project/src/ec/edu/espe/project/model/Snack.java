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

    
    private int chip;
    private int peanut;
    private int bubblegum;
   
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
    
    

    public int selectChips() {
        System.out.println("Remeber that the maximun quantity that you can get is 10 ");
        System.out.println("How many chips do you want?");
        do{
        chip = dataEntry.nextInt();
        }while(chip<=0||chip>10);
        return(chip);
    }
    
    public int selectPeanut(){
        System.out.println("Dont choose more of 10 peanuts");
        System.out.println("How many peanuts do you want");
        do{
        peanut = dataEntry.nextInt();
        }while(peanut<=0||peanut>10);
        return (peanut);
    }
    
    public int selectBubblegum(){
        System.out.println("Dont choose more of 10 bubblegum");
        System.out.println("How many bubblegums do you want");
        do{
        bubblegum = dataEntry.nextInt();
        }while(bubblegum<=0||bubblegum>10);
        return (bubblegum);
        
    }

}

