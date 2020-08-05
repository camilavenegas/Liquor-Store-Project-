/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fileexample.model;

import ec.edu.espe.filemanager.view.FileManager;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class StudentAdmin {
    
    ArrayList <Student> students= new ArrayList<>();
    
    public void getFile(){
    String fileName="Student Data.txt";
    Student student= new Student();
    FileManager file= new FileManager(fileName);
    
    
    students.add(new Student(student.setName(), 0, "ecuadorian","red" ));
    file.writeDataRecord(students.get(0).getName());
    file.writeDataRecord(students.get(0).getNationality());
    
    }
        
    
    
    

    
}
