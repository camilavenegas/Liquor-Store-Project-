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
public class Card {

    private String name;
    private long id;
    private int code;
    private CardDate date;

    Scanner dataEntry = new Scanner(System.in);

    public Card(String name, long id, int code, CardDate date) {
        this.name = name;
        this.id = id;
        this.code = code;
        this.date = date;
    }

    public Card() {
        this.name = "";
        this.id = 0;
        this.code = 0;
        this.date = null;
    }

    public CardDate getCardDate() {
        CardDate date = new CardDate();
        int copyMonth = date.writeMonth();
        int copyYear = date.writeYear();

        if (copyYear == 2020) {
            if (copyMonth <= 6) {
                System.out.println("The Card has expired, so you can not use this card");
            } else if (copyYear < 2020) {
                System.out.println("The Card has expired, so you can not use this card");

            } else {
                date.setMonth(copyMonth);
                date.setYear(copyYear);
            }

        }

        return date;

    }

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CardDate getDate() {
        return date;
    }

    public void setDate(CardDate date) {
        this.date = date;
    }
    
    
    public Card getCardData(){
        Card card=null;
        System.out.println("You choose to pay with Card--> Please Write Card Data");
        System.out.println("\n\n");
        System.out.println("Please write the card's property Name");
        card.setName(dataEntry.nextLine());
        System.out.println("Please write the card's ID");
        card.setId(dataEntry.nextLong());
        System.out.println("Please write the card's CODE");
        card.setCode(dataEntry.nextInt());
        System.out.println("Please write the expected Card´s Date");
        card.setDate(getCardDate());
        return card;
    }

}
