/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import ec.edu.espe.project.control.DataChecker;
import ec.edu.espe.project.control.SearchDocument;
import java.util.Scanner;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class AdminLogIn {
    public boolean checkCredentials(){
        Scanner scanner = new Scanner(System.in);
        DataChecker find = new DataChecker();
        //PasswordEncryptor c = new PasswordEncryptor();
        SearchDocument file = new SearchDocument("Admin.csv");
        
        String UserName;
        String Password;
        boolean checker = false;
        boolean correctUser = false;
        boolean correctPass = false;
        
        boolean repeat = false;
        while(repeat == false){
            
            boolean usernameFinder = false;
            do{
                System.out.println("Username: ");
                UserName = scanner.nextLine();
                usernameFinder = file.findUser(UserName);
                checker = find.verifyUsername(usernameFinder);
            } while(checker != false);
            correctUser = true;
            
            boolean foundPass = false;
            do{
                System.out.println("Password");
                Password = scanner.nextLine();
                checker = find.verifyPassword(foundPass);
            }while(checker != false);
            correctPass = true;
            
            repeat = true;
        }
        boolean permission = false;
        if((correctUser == true) && (correctPass == true)){
            permission = true;
        }
        return permission;
    }
}
