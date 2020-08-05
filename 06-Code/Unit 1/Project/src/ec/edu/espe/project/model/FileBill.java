/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Fernando Paredes
 */
public class FileBill {
    
    public void saveBill(Bill bill){
        try{
            String billDataBase="bills.csv";
            File bills = new File(billDataBase);
            if(!bills.exists()){
                bills.createNewFile();    
            }
            FileWriter writer = new FileWriter(billDataBase, true);
            PrintWriter printWriter = new PrintWriter(writer);
            
            printWriter.println(bill.toString());
            printWriter.close();
            writer.close();
        }catch(Exception exception){
            System.err.println("Error! Could not save data");
            System.err.println(exception.getMessage());
        }
        
        
        
    }
    
    
    
}

