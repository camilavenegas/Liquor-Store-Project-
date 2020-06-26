/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

import ec.edu.espe.project.model.CustomerAdress;
import ec.edu.espe.project.model.Customer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileManager {

    Customer customer = new Customer();
    Scanner in = new Scanner(System.in);
    CustomerAdress adress = new CustomerAdress();

    
    public Customer register() {
        String name;
        long id;
        int age;
        String mail;
        name = scanLine("Please grabe your name: ");
        customer.setFullName(name);

        adress = customer.getAdress();
        customer.setConsumerAdress(adress);

        mail = scanLine("Please grabe your e-mail: ");
        customer.setMail(mail);

        do {

            try {
                age = Integer.parseInt(scanLine("Please grabe your age: "));

            } catch (Exception exception) {
                System.out.println("\nERROR! Please only numbers!");
                continue;
            }

            if (age < 18 || age > 90) {
                System.out.println("\nInvalid age");
                continue;
            }

            customer.setAge(age);
            break;

        } while (true);

        do {
            try {
                id = Integer.parseInt(scanLine("Please grabe your id: "));
            } catch (Exception exception) {
                System.out.println("\nERROR! Please only numbers!");
                continue;
            }

            customer.setId(id);
            break;
        } while (true);
        
        saveCustomer(customer);
        return customer;
    }
    

    public List <Customer> getAllCustomers() throws IOException{
        List <Customer> customers= new ArrayList<Customer>();
         try{
             
             String consumerData= "database.txt";
             File dataBase = new File(consumerData);
             
             if(!dataBase.exists()){
                 return customers;
             }
            Scanner dataEntry= new Scanner(dataBase);
            
            while(dataEntry.hasNextLine()){
                Customer customer= new Customer();
                String line= dataEntry.nextLine();
                String[] tokens= line.split(" ");
                
                if(tokens.length<5){
                    continue;
                }
                try{
                    customer.customerData();
                }catch(Exception ex){
                    System.err.println("An error has ocurred");
                    System.err.println(ex.getMessage());
                }
                customers.add(customer);
                
            }
            dataEntry.close();
             
         }catch(Exception ex){
             System.err.println("An error has ocurred");
         }
        
       return customers;
    }

    public void saveCustomer(Customer customer) {
        try {
            File dataBase = new File("customers.csv");

            if (!dataBase.exists()) {
                dataBase.createNewFile();
            }

            FileWriter writer = new FileWriter(dataBase, true);
            PrintWriter printWriter = new PrintWriter(writer);

            printWriter.println(customer.serialize());
            printWriter.close();
            writer.close();
        } catch (Exception exception) {
            System.err.println(
                    "Error! Could not save data");
            System.err.println(exception.getMessage());
        }
    }

    private String scanLine(String flag) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        String line;

        do {
            System.out.printf("%s: ", flag);
            line = scanner.nextLine();

            if (line.contains(",")) {
                System.out.println("Invalid character','");
                valid = false;
            }
        } while (!valid);

        return line;

    }

}
