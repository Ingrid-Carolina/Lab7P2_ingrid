/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Principio extends javax.swing.JFrame {
 Futbol a = new Futbol();
  admin ad = new admin();
    /**
     * Creates new form Principio
     */
    public Principio() {
        
        a.listausuario.add(new Usuario ("fer",342,"fer"));
        a.listausuario.add(new Usuario ("nuila",34536,"nuila"));
        a.listausuario.add(new Usuario ("admin",12345,"admin"));
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUserInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jIngresar = new javax.swing.JButton();
        jPasswordInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contrase??a");

        jIngresar.setText("Ingresar");
        jIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(jIngresar))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jIngresar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngresarMouseClicked
        // TODO add your handling code here:
        ArrayList<Usuario> lista = a.listausuario;
        Random rnd = new Random();
        String nombre = jUserInput.getText();
        String password = jPasswordInput.getText();
        try {
            if (((Usuario)lista.get(0)).getNombreUsuario().equalsIgnoreCase(nombre) &&((Usuario)lista.get(0)).getPassword().equalsIgnoreCase(password) ||
                  ((Usuario)lista.get(1)).getNombreUsuario().equalsIgnoreCase(nombre) &&((Usuario)lista.get(1)).getPassword().equalsIgnoreCase(password)||
                    ((Usuario)lista.get(2)).getNombreUsuario().equalsIgnoreCase(nombre) &&((Usuario)lista.get(2)).getPassword().equalsIgnoreCase(password) ) {
                JOptionPane.showConfirmDialog(this, "Bienvenido");
                a.setVisible(true);
                setVisible(false);
            } else {
                lista.add(new Usuario(nombre, idGenerator(), password));
                JOptionPane.showConfirmDialog(this, "Bienvenido nuevo usuario");
                a.setVisible(true);
                setVisible(false);
            }
            if (((Usuario)lista.get(0)).getNombreUsuario().equalsIgnoreCase("admin") &&((Usuario)lista.get(0)).getPassword().equalsIgnoreCase(password) ||
                  ((Usuario)lista.get(1)).getNombreUsuario().equalsIgnoreCase("admin") &&((Usuario)lista.get(1)).getPassword().equalsIgnoreCase(password)||
                    ((Usuario)lista.get(2)).getNombreUsuario().equalsIgnoreCase("admin") &&((Usuario)lista.get(2)).getPassword().equalsIgnoreCase(password) ) {
                JOptionPane.showConfirmDialog(this, "Bienvenido Admin");
                 ad.setVisible(true);
                 a.setVisible(false);
                setVisible(false);
            }else {
                lista.add(new Usuario(nombre, idGenerator(), password));
                JOptionPane.showConfirmDialog(this, "Bienvenido nuevo admin");
                ad.setVisible(true);
                a.setVisible(false);
                setVisible(false);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principio().setVisible(true);
            }
        });
    }
      public int idGenerator() {
        Random rnd = new Random();
        int id = rnd.nextInt(1000);
        boolean centinela = false;
        while (centinela == true) {
            int cont = 0;
            ArrayList<Usuario> lista = a.listausuario;
            for (int i = 0; i < lista.size(); i++) {
               // if (lista.get(i) instanceof Usuario vario) {                 
                    if (lista.get(i).getID() == id) {
                        cont++;
                    //}
                }
            }
            if (cont > 0) {
                id = rnd.nextInt();
            } else {
                centinela = true;
            }
        }
        return id;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPasswordInput;
    private javax.swing.JTextField jUserInput;
    // End of variables declaration//GEN-END:variables
}
