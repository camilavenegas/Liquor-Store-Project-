/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.view;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.liquorStore.utils.JsonFile;
import ec.edu.espe.liquorStore.utils.EncryptPassword;
import ec.edu.espe.liquorStore.model.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class FrmNewUser extends javax.swing.JFrame {

    DB db;
    DBCollection tabla;
    private final String ruta = System.getProperties().getProperty("user.dir");

    public FrmNewUser() {
        try {
            Mongo mongo = new Mongo("localHost", 27017);
            db = mongo.getDB("NewUsers");
            tabla = db.getCollection("Users");
        } catch (UnknownHostException ex) {

        }
        initComponents();

    }

    public void validateFields() {
        if (txtNewUser.getText().isEmpty()) {
            lblUserName.setText("*Obligatory field");
        } else {
            lblUserName.setText("");
        }
        if (pswNewPassword.getText().isEmpty()) {
            lblPassword.setText("*Obligatory field");
        } else {
            lblPassword.setText("");
        }
    }

    public void enableButton() {
        if (txtNewUser.getText().isEmpty() || pswNewPassword.getText().isEmpty()) {
            btnSave.setEnabled(false);
        } else {
            btnSave.setEnabled(true);
        }
    }

    public void encrypt() {
        String passwords = pswNewPassword.getText();
        String User = txtNewUser.getText();
        String encryptedPassword;
        File bin;
        FileWriter file; //    = new FileWriter("Customer.json"))
        PrintWriter line;
        JsonObject object = new JsonObject();
        JsonArray list = new JsonArray();
        bin = new File("passwords.json");
        if (!bin.exists()) {
            try {
                bin.createNewFile();

                char password[] = passwords.toCharArray();
                for (int i = 0; i < password.length; i++) {
                    password[i] = (char) (password[i] + (char) 1);
                }
                encryptedPassword = String.valueOf(password);

                object.addProperty("User", txtNewUser.getText());
                object.addProperty("Password", encryptedPassword);
                file = new FileWriter(bin, true);
                line = new PrintWriter(file);
                line.println("\n");
                list.add(object);
                file.write(list.toString());
                file.flush();
            } catch (IOException ex) {

            }

        } else {
            try {

                char password[] = passwords.toCharArray();
                for (int i = 0; i < password.length; i++) {
                    password[i] = (char) (password[i] + (char) 1);
                }
                encryptedPassword = String.valueOf(password);

                object.addProperty("User", txtNewUser.getText());
                object.addProperty("Password", encryptedPassword);
                file = new FileWriter(bin, true);
                line = new PrintWriter(file);
                line.println("\n");
                list.add(object);
                file.write(list.toString());
                file.flush();
            } catch (IOException ex) {

            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNewUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pswNewPassword = new javax.swing.JPasswordField();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtNewUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewUserKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("UserName :");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        pswNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswNewPasswordKeyReleased(evt);
            }
        });

        lblUserName.setForeground(new java.awt.Color(255, 0, 0));

        lblPassword.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pswNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 450, 120));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnSave.setBackground(new java.awt.Color(153, 51, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 51, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 210, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/liquorStore/icons/llamamorada.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, 620, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validateUser(String newUser) {

        for (int i = 0; i < newUser.length(); i++) {
            char caracter = newUser.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
                return false;
            }
        }
        return true;
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        EncryptPassword ps = new EncryptPassword();
        String passwords = pswNewPassword.getText();
        String encryptedPassword;
        String newPaswd = ps.Encrypt(pswNewPassword.getText());
        String newUser = txtNewUser.getText();
        boolean val = validateUser(newUser);

        char password[] = passwords.toCharArray();
        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (password[i] + (char) 1);
        }
        encryptedPassword = String.valueOf(password);

        BasicDBObject document = new BasicDBObject();
        document.put("User", "'" + txtNewUser.getText() + "'");
        document.put("Password", "'" + encryptedPassword + "'");
        tabla.insert(document);
        if (val == false) {
            JOptionPane.showMessageDialog(rootPane, "User incorret, enter only letters!");
            txtNewUser.setText("");
        }
        String nP = pswNewPassword.getText();
        User user = new User(newUser, newPaswd);
        JsonFile fl = new JsonFile();
        fl.addToFile(user);
        JOptionPane.showMessageDialog(rootPane, "User register!");
        FrmLoginUser login = new FrmLoginUser();
        login.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNewUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewUserKeyTyped

        char letter = evt.getKeyChar();

        if (Character.isDigit(letter)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Please not numbers!!!");

        }
        if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 64) {
            JOptionPane.showMessageDialog(this, "Please not Special Characters!!!");
        }
    }//GEN-LAST:event_txtNewUserKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        FrmLoginUser login = new FrmLoginUser();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        encrypt();
        FrmBills frmBill = new FrmBills();
        frmBill.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtNewUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewUserKeyReleased
        enableButton();
        validateFields();
    }//GEN-LAST:event_txtNewUserKeyReleased

    private void pswNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswNewPasswordKeyReleased
        enableButton();
        validateFields();
    }//GEN-LAST:event_pswNewPasswordKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmNewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    public static javax.swing.JPasswordField pswNewPassword;
    public static javax.swing.JTextField txtNewUser;
    // End of variables declaration//GEN-END:variables
}
