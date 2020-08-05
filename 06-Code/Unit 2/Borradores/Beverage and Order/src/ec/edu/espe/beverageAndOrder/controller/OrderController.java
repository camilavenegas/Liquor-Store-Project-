package ec.edu.espe.beverageAndOrder.controller;

import ec.edu.espe.beverageAndOrder.service.BeverageService;
import ec.edu.espe.beverageAndOrder.view.FrmOrder;
import javax.swing.JFrame;

/**
 *
 * @author Camila Venegas DCCO
 */
public class OrderController {
    private BeverageService beverageService = new BeverageService();
    
    public void init() {
        FrmOrder view = new FrmOrder(beverageService);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }
}
