/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.controller;

import ec.edu.espe.liquorStore.service.BeverageService;
import ec.edu.espe.liquorStore.view.FrmOrder;
import javax.swing.JFrame;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class OrderController {
    private BeverageService beverageService = new BeverageService();

    public void init() {
        FrmOrder view = new FrmOrder(beverageService);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }
}
