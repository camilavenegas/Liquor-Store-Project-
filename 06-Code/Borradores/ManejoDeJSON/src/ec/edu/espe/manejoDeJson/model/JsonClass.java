/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manejoDeJson.model;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.ParserException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Wilson Toapanta 6382
 */
public class JsonClass {
    public static void main(String[] args) throws ParseException {
        try{
            JSONParser parser = new JSONParser();
            ArrayList arrayBeverages = new ArrayList<>();
            
            Object obj = parser.parse(new FileReader("beverages.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray array = (JSONArray) jsonObject.get("beverages");            
            System.out.println("TYPE\t\tSIZE\t\tBRAND\t\t\tPRICE\t\tCODE");            
            for(int i=0; i < array.size(); i++){
                jsonObject = (JSONObject) array.get(i);
                System.out.println(jsonObject.get("type")+"\t\t"
                        +jsonObject.get("size")+"\t\t"+jsonObject.get("brand")
                        +"\t\t"+jsonObject.get("price")+"\t\t"+jsonObject.get("code"));                
                arrayBeverages.add(jsonObject);               
            }  
            
            System.out.println("**********Prueba de array**********");
            System.out.println(arrayBeverages);
            
        }catch(FileNotFoundException e){ }
        catch(IOException | ParserException e){ }
        
        Beverage beverages = new Beverage();
        //Con un Scanner para que ingrese el usuario
        beverages.setType("Enviamos el tipo --> Clasic");
        beverages.setPrice("Enviamos el precio --> 23.50");
        Gson gson = new Gson(); //Instanciar GSON (Librería necesaria)
        String response;
        response = gson.toJson(beverages);  //Convertir objeto a JSON
        System.out.println("Response: "+ response); //Ver que guardó
        Beverage bev = gson.fromJson(response, Beverage.class);     //Instanciar objeto para acceder a los elementos
        System.out.println("REsponse -> : " + bev.getType());   //Imprimir el elemeto que quiera     
        
        
        System.out.println("*********************************");
        JSONObject obj = new JSONObject();
        obj.put("bebida1:", "Algun dato");
        obj.put("location:", "Ecuador");
        JSONArray list = new JSONArray();
        list.add("java");
        list.add("USA");
        list.add("Algo mas");
        
        obj.put("bebidas", list);
        try{
            FileWriter file = new FileWriter("customer.json");
            file.write(obj.toString());
            file.flush();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Obj: "+ obj);
        
        
    }
}
