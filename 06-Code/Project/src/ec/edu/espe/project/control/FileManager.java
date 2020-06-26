/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

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
    
    private void saveData(Customer customer) throws IOException{
        try{
            String fileName= "database.txt";
            File dataBase= new File(fileName);
            
            if(!dataBase.exists()){
                dataBase.createNewFile();
            }
            FileWriter writer= new FileWriter(dataBase,true);
            
            
        }
    }
    

}

