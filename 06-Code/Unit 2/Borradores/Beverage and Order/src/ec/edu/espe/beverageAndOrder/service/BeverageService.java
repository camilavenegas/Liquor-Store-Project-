package ec.edu.espe.beverageAndOrder.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.beverageAndOrder.model.Beverage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Camila Venegas DCCO
 */
public class BeverageService {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<String> getBeverageTypes() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("data/beverage_types.json")));
            return Arrays.asList(gson.fromJson(json, String[].class));
        } catch (Exception e) {}
        
        return Collections.emptyList();
    }
    
    public List<Beverage> getAllBeverages() {        
        try {
            String json = new String(Files.readAllBytes(Paths.get("data/beverages.json")));
            return Arrays.asList(gson.fromJson(json, Beverage[].class));
        } catch (Exception e) {}
        
        return Collections.emptyList();
    }
    
    public void addBeverage(String brand, String type, float price, float size) {
        Beverage beverage = new Beverage();
        beverage.setBrand(brand);
        beverage.setPrice(price);
        beverage.setSize(size);
        beverage.setType(type);
        
        List<Beverage> beverages = new ArrayList<>(getAllBeverages());
        beverages.add(beverage);
        
        try {
            String json = gson.toJson(beverages);
            Files.write(Paths.get("data/beverages.json"), json.getBytes());
        } catch (Exception e) {}
    }
}
