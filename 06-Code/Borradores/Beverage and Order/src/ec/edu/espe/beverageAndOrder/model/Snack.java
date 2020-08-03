/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.beverageAndOrder.model;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public class Snack {
    
    private int bubbleGums;
    private int peanut;
    private int chips;

    public Snack(int bubbleGums, int peanut, int chips) {
        this.bubbleGums = bubbleGums;
        this.peanut = peanut;
        this.chips = chips;
    }

    public int getBubbleGums() {
        return bubbleGums;
    }

    public void setBubbleGums(int bubbleGums) {
        this.bubbleGums = bubbleGums;
    }

    public int getPeanut() {
        return peanut;
    }

    public void setPeanut(int peanut) {
        this.peanut = peanut;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
    
    
    
}
