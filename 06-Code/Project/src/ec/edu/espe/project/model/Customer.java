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
     private String Adress;
     
     ConsumerAdress consumerAdress = new ConsumerAdress();
     
     Scanner dataEntry = new Scanner(System.in);

    public Customer(String fullName, long id, int age, String mail, String Adress ) {
        this.fullName = fullName;
        this.id = id;
        this.age = age;
        this.mail = mail;
    }
    /*public Customer(){
        this.fullName = "";
        this.id = 0;
        this.age = 0;
        this.mail = "";
    }*/
    public Customer() {
    }
    
    public void customerData(Customer custom){   
            System.out.println("Enter your full name:");
            custom.setFullName(dataEntry.nextLine());
            System.out.println("Enter yout Id: ");
            custom.setId(dataEntry.nextLong());
            System.out.println("Enter your age: ");
            custom.setAge(dataEntry.nextInt());
            System.out.println("Enter your e-mail: ");
            custom.setMail(dataEntry.nextLine());            
    }

     ArrayList <Customer> customers = new ArrayList<>();
     
     public String getAdress(){
         String principalStreet;
         String houseNumber;
         String crossingStreet;
         
         principalStreet = consumerAdress.getPrincipalStreet();
         houseNumber = consumerAdress.getHouseNumber();
         crossingStreet = consumerAdress.getCrossingStreet();
         
         return principalStreet + houseNumber + crossingStreet;
     }
     
     public void newClient(){
         System.out.println("New Client: ");
         System.out.println("" + getFullName());
         System.out.println("" + getId());
         System.out.println("" + getAge());
         System.out.println("" + getMail());
     }
     
     public String getCustomerData() {
        int op;
        Customer customer = new Customer();
        do {
            System.out.println("Enter new client?");
            System.out.println("YES -> 1 or NO -> 0");
            op = dataEntry.nextInt();
            if (op == 1) {                
                   customer.customerData(customer);

            }else{
                if(op==0){
                    System.out.println("Register of new clients: ");
                    customers.forEach((Customer custom) -> {
                        System.out.println("New Clients: " + custom);
                    });
                    break;
                }
            }
        } while (op != 0 || op != 1);  
        return customer.toString();
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
    public Scanner getDataEntry() {
        return dataEntry;
    }
    public void setDataEntry(Scanner dataEntry) {
        this.dataEntry = dataEntry;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
