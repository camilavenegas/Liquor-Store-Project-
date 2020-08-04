package ec.edu.espe.beverageAndOrder.controller;

import ec.edu.espe.beverageAndOrder.service.BeverageService;
import ec.edu.espe.beverageAndOrder.view.FrmBeverage;
import javax.swing.JFrame;

/**
 *
 * @author Camila Venegas DCCO
 */
public class BeverageController {
    private BeverageService beverageService = new BeverageService();
    
    public void init() {
        FrmBeverage view = new FrmBeverage(beverageService);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }
}
