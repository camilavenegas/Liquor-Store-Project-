/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class DataChecker {
    
    public boolean verifyUsername(boolean checker){
        
        if(checker == true){
            System.out.println("Correct username!");
            checker = false;
        }else{
            System.out.println("Incorrect or not registered");
            checker = true;
        }
        return checker;
    }
    
    public boolean verifyPassword(boolean checker){
        if(checker == true){
            System.out.println("Correct password");
            checker = false;
        }else{
            System.out.println("Incorrect password");
            checker = true;
        }
        return checker;
    }
    
}
