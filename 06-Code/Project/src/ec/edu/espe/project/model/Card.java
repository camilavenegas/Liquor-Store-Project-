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
public class Card {
    private String name;
    private long id;
    CardDate cardDate= new CardDate();
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CardDate getCardDate() {
        return cardDate;
    }

    public void setCardDate(CardDate cardDate) {
        this.cardDate = cardDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
