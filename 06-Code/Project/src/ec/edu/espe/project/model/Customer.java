/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
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
    private ConsumerAdress adress;

    ConsumerAdress consumerAdress = new ConsumerAdress();
    Scanner dataEntry = new Scanner(System.in);

    public Customer(String fullName, long id, int age, String mail, ConsumerAdress adress) {
        this.fullName = fullName;
        this.id = id;
        this.age = age;
        this.mail = mail;
        this.adress = adress;
    }
     public Customer() {
        this.fullName = "";
        this.id = 0;
        this.age = 0;
        this.mail = "";
        this.adress = null;
    }
    
    public Customer customerData() {
        Customer custom=null;
        System.out.println("Enter your full name:");
        custom.setFullName(dataEntry.nextLine());
        System.out.println("Enter yout Id: ");
        custom.setId(dataEntry.nextLong());
        System.out.println("Enter your age: ");
        custom.setAge(dataEntry.nextInt());
        System.out.println("Enter your e-mail: ");
        custom.setMail(dataEntry.nextLine());
        System.out.println("Enter your adress");
        custom.setConsumerAdress(custom.getAdress());
 
        return custom;
    }

    public ConsumerAdress getAdress() {
        consumerAdress.setPrincipalStreet(consumerAdress.writePrincipalStreet());
        consumerAdress.setCrossingStreet(consumerAdress.writeCrossingStreet());
        consumerAdress.setHouseNumber(consumerAdress.writeHouseNumber());

        return consumerAdress;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ConsumerAdress getConsumerAdress() {
        return consumerAdress;
    }

    public void setConsumerAdress(ConsumerAdress consumerAdress) {
        this.consumerAdress = consumerAdress;
    }

    @Override
    public String toString() {
        return "{" + fullName + id  + age   + mail  + adress  + consumerAdress +  '}';
    }

    
}
