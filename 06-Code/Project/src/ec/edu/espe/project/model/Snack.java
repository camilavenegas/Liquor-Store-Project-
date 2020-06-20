/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

/**
 *
 * @author hp
 */
public class Snack {
    private double priceSnack;
    private int chip;
    private int peanut;
    private int bubblegum;
     
    /*public int select( int chip, int peanut, int bubblegum){
         //int requierement[3];
         //return requirement[];
         return 0;
    }*/

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
    
    
}
