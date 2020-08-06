/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class Customer {
    String name;
    String address;
    String id;
    String age;
    String mail;

    public Customer(String name, String address, String id, String age, String mail) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + 
                ", id=" + id + ", age=" + age + ", mail=" + mail + '}';
    }
}
