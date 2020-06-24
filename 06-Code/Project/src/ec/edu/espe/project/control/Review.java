/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

/**
 *
 * @author hp
 */
public class Review {
    
    public int validateNegative(int theVariable){
        if(theVariable<-1){
            System.out.println("The number written is incorrect");
            System.out.println("please try aga");
        }
        
        return 0;
    }
    
}
