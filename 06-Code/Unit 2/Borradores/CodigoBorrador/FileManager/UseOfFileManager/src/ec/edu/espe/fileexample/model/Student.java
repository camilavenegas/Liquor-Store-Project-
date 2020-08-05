/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fileexample.model;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private String  nationality;
    private String color;
    
    Scanner dataEntry= new Scanner(System.in);

    public Student(String name, int age, String nationality, String color) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.color = color;
    }
public Student() {
        this.name = "";
        this.age = 0;
        this.nationality = "";
        this.color = "";
    }
  

   public void enterAspects(){
       System.out.println("name"+name);
       System.out.println("age"+age);
       System.out.println("nationality"+nationality);
       System.out.println("color"+color);
    
       
   }

    public String getName() {
        return name;
    }

    public String setName() {
        this.name = dataEntry.nextLine();
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
  
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", nationality=" + nationality + ", color=" + color + '}';
    }

   
    
    
    
}
