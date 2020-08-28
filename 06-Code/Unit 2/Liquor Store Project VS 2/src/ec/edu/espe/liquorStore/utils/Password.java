/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.utils;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class Password {

    public String Encrypt(String password) {
        char[] pswChange = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            char cad = password.charAt(i);
            int asci = (int) cad;
            char change = (char) (asci);
            pswChange[i] = change;
        }

        String PswC = String.valueOf(pswChange);
        return PswC;
    }

    public String Decrypt(String PswC) {

        char[] newpsw = new char[PswC.length()];
        for (int j = 0; j < PswC.length(); j++) {
            char cad = PswC.charAt(j);
            int asci = (int) cad;
            char change = (char) (asci);
            newpsw[j] = change;
        }
        String Newpsw = String.valueOf(newpsw);
        return Newpsw;
    }
}
