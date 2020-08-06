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
public class Bill {
    private String clientId;
    private String clientName;
    private String address;
    private String phone;
    private String iva;
    private String subTotal;
    private String total;

    public Bill(String clientId, String clientName, String address, String phone, String iva, String subTotal, String total) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.address = address;
        this.phone = phone;
        this.iva = iva;
        this.subTotal = subTotal;
        this.total = total;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" + "clientId=" + clientId + ", clientName=" + clientName 
                + ", address=" + address + ", phone=" + phone + ", iva=" + iva +
                ", subTotal=" + subTotal + ", total=" + total + '}';
    }

}
