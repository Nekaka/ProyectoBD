/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bd.DAO;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author vania
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/image/Icono_normal.png")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblIconNom = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblIconContra = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblIconoTienda = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon_Minimizar.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jpIngreso.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon_Cerrar.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jpIngreso.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter_ON.png"))); // NOI18N
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jpIngreso.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 130, 40));
        jpIngreso.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setText("Nombre de usuario:");
        jpIngreso.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        lblIconNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IconChic.png"))); // NOI18N
        jpIngreso.add(lblIconNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 40, 40));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");
        jpIngreso.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lblIconContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Candado.png"))); // NOI18N
        jpIngreso.add(lblIconContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, 40));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon_1.png"))); // NOI18N
        jpIngreso.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 110, 110));

        lblIconoTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icono_chikito.png"))); // NOI18N
        jpIngreso.add(lblIconoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 140, 130));

        pswPass.setText("jPasswordField1");
        pswPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswPassFocusGained(evt);
            }
        });
        jpIngreso.add(pswPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 240, 30));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(Login.ICONIFIED);//Para minimizar
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialog);
        if (result == 0){
            System.exit(0);//Cerrar el programa
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        if(txtUser.getText().equals("") || pswPass.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos en todos los campos correspondientes!!");
            txtUser.setText(null);
            pswPass.setText(null);
            txtUser.requestFocus();   
        }else{
            try {
                DAO oDAO = new DAO();
                Usuario oUsuario = oDAO.esUsuario(txtUser.getText(), pswPass.getText());
                System.out.println("" +  txtUser.getText() + pswPass.getText());
                
                if(oUsuario == null){
                    JOptionPane.showMessageDialog(rootPane, "Este usuario no existe!!");
                    txtUser.setText(null);
                    pswPass.setText(null);
                    txtUser.requestFocus();
                }else if(oUsuario.getId() == 1){
                    Admin admin = new Admin();
                    admin.setVisible(true);
                    this.dispose();
                }else{
                    Caja caja = new Caja();
                    caja.setVisible(true);
                    this.dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void pswPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPassFocusGained
        pswPass.setText(null);
    }//GEN-LAST:event_pswPassFocusGained

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIconContra;
    private javax.swing.JLabel lblIconNom;
    private javax.swing.JLabel lblIconoTienda;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
