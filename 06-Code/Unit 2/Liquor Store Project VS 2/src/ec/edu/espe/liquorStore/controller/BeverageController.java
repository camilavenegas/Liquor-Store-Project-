/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.controller;

import ec.edu.espe.liquorStore.service.BeverageService;
import ec.edu.espe.liquorStore.view.FrmBeverage;
import javax.swing.JFrame;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public class BeverageController {
    private BeverageService beverageService = new BeverageService();
    
    public void init() {
        FrmBeverage view = new FrmBeverage(beverageService);
          view.setVisible(true);
        //this.setVisible(false)
      //  view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(false);
      
    }
    
    
}
