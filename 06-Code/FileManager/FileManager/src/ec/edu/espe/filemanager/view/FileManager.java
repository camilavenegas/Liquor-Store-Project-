/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileManager {
    
    private String fileName;

    public FileManager(String fileName) {
        this.fileName= fileName;
    }
    
    
    public void writeDataRecord( String data ){
        
        try{
            File file= new File (this.fileName);
            BufferedWriter bw= new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true));
            Scanner dataEntry = new Scanner(file);
            if(file.exists()){
                bw.write(data);
                bw.close();
            }
        }catch( Exception ex){
            ex.printStackTrace();
        }
                
        
        
    }
    
}
