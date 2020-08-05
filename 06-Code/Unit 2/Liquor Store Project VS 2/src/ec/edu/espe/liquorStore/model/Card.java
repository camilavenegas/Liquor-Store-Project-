/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

import java.util.Calendar;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public abstract class Card {
    private String id;
    private String userName;
    private Calendar date;
    private int code;

    public Card(String id, String userName, Calendar date, int code) {
        this.id = id;
        this.userName = userName;
        this.date = date;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public abstract String validateCard();
        
   
    
    
    
}
