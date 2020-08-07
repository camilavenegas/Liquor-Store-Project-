/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class Order {
    String beverage;
    String bubblegum;
    String peanut;
    String chips;
    String selectedCombo;

    public Order(String beverage, String bubblegum, String peanut, String chips, String selectedCombo) {
        this.beverage = beverage;
        this.bubblegum = bubblegum;
        this.peanut = peanut;
        this.chips = chips;
        this.selectedCombo = selectedCombo;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getBubblegum() {
        return bubblegum;
    }

    public void setBubblegum(String bubblegum) {
        this.bubblegum = bubblegum;
    }

    public String getPeanut() {
        return peanut;
    }

    public void setPeanut(String peanut) {
        this.peanut = peanut;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getSelectedCombo() {
        return selectedCombo;
    }

    public void setSelectedCombo(String selectedCombo) {
        this.selectedCombo = selectedCombo;
    }

    @Override
    public String toString() {
        return "Order{" + "beverage=" + beverage + ", bubblegum=" + bubblegum +
                ", peanut=" + peanut + ", chips=" + chips + ", selectedCombo=" +
                selectedCombo + '}';
    }
}
