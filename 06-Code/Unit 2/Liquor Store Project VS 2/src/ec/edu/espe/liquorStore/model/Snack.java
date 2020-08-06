/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public class Snack {
    private int Bubblegum;
    private int Peanut;
    private int Chips;

    public Snack(int Bubblegum, int Peanut, int Chips) {
        this.Bubblegum = Bubblegum;
        this.Peanut = Peanut;
        this.Chips = Chips;
    }

    public int getBubblegum() {
        return Bubblegum;
    }

    public void setBubblegum(int Bubblegum) {
        this.Bubblegum = Bubblegum;
    }

    public int getPeanut() {
        return Peanut;
    }

    public void setPeanut(int Peanut) {
        this.Peanut = Peanut;
    }

    public int getChips() {
        return Chips;
    }

    public void setChips(int Chips) {
        this.Chips = Chips;
    }
   
    
    
}
