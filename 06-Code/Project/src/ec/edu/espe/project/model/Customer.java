/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;


/**
 *
 * @author hp
 */
public class Customer {
     private String fullName;
     private long id;
     private int age;
     private String mail;
     private long phoneNumber;
     ConsumerAdress adress= new ConsumerAdress();
     
     Scanner entryData = new Scanner(System.in);

    public Customer(String fullName, long id, int age, String mail ) {
        this.fullName = fullName;
        this.id = id;
        this.age = age;
        this.mail = mail;
    }
    public Customer(){
        this.fullName = "";
        this.id = 0;
        this.age = 0;
        this.mail = "";
    }
     ArrayList <Customer> customers = new ArrayList<>();
     
     public void enterCustomer(){
         
        customers.add(new Customer(setFullName(), setId(), setAge(), setMail()));
        
        //return customers;
     }
     
     public void newClient(){
         System.out.println("New Client: ");
         System.out.println("" + getFullName());
         System.out.println("" + getId());
         System.out.println("" + getAge());
         System.out.println("" + getMail());
     }
     
     public void cicle() {
        int op;
        Customer customer = new Customer();
        do {
            System.out.println("Enter new client?");
            System.out.println("YES -> 1 or NO -> 0");
            op = entryData.nextInt();
            if (op == 1) {                
                   customer.enterCustomer();
                //customer.newClient();
            }else{
                if(op==0){
                    System.out.println("Register of new clients: ");
                    System.out.println(""+customers);
                    customers.forEach((custom) -> {
                        System.out.println("New Clients: " + custom);
                    });
                        
                    
                    break;
                }
            }
        } while (op != 0 || op != 1);    
     }
    

    public String getFullName() {
        return fullName;
    }

    public String setFullName() {
        System.out.println("Enter your name: ");
        this.fullName = entryData.nextLine();
        return fullName;
    }

    public long getId() {
        return id;
    }

    public long setId() {
        System.out.println("Enter yout id: ");
        this.id = entryData.nextInt();
        return id;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        System.out.println("Enter your age: ");
        this.age = entryData.nextInt();
        return age;
    }

    public String getMail() {
        return mail;
    }

    public String setMail() {
        System.out.println("Enter your e-mail");       
        this.mail = entryData.nextLine();
        return mail;
    }

    public ConsumerAdress getAdress() {
        return adress;
    }

    public void setAdress(ConsumerAdress adress) {
        this.adress = adress;
    }
     
     
     
     
     
    
    
}
