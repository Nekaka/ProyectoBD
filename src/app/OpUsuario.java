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

/**
 *
 * @author Nekaka
 */
public class OpUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuarios
     */
    public OpUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtNomApe = new javax.swing.JTextField();
        pswPass = new javax.swing.JPasswordField();
        btnCrearUser = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, 30));

        txtNomApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomApeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 170, 30));

        pswPass.setText("jPasswordField1");
        pswPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswPassFocusGained(evt);
            }
        });
        jPanel1.add(pswPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 170, 30));

        btnCrearUser.setText("Crear Usuario");
        btnCrearUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearUserMouseClicked(evt);
            }
        });
        jPanel1.add(btnCrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        btnActualizar.setText("Actualizar Usuario");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        btnBorrar.setText("Borrar Usuario");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel1.setText("User:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel2.setText("Pass:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel3.setText("Nombre apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon_Minimizar.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 40));

        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icon_Cerrar.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Volver.png"))); // NOI18N
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel1.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtNomApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomApeActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(OpUsuario.ICONIFIED);//Para minimizar
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialog);
        if (result == 0){
            System.exit(0);//Cerrar el programa
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnCrearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUserMouseClicked
        int mensaje = JOptionPane.YES_NO_OPTION;
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea registrar un nuevo usuario?", "Registro", mensaje);
        if(respuesta == 0){
            if(txtUser.getText().equals("") || pswPass.getText().equals("") || txtNomApe.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Ingrese datos en todos los campos correspondientes!!");
            }else{
                try {
                    DAO oDAO = new DAO();
                    oDAO.crearUsuario(txtUser.getText(), pswPass.getText(), txtNomApe.getText());
                    txtUser.setText(null);
                    pswPass.setText(null);
                    txtNomApe.setText(null);
                    txtUser.requestFocus();
                    JOptionPane.showMessageDialog(rootPane, "Usuario creado correctamente");
                    jtable.setModel(oDAO.show_table_user());
                } catch (SQLException ex) {
                    Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnCrearUserMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            DAO oDAO = new DAO();
            jtable.setModel(oDAO.show_table_user());
            
        } catch (SQLException ex) {
            Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void pswPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPassFocusGained
        pswPass.setText(null);
    }//GEN-LAST:event_pswPassFocusGained

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        Admin admin = new Admin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
        int seleccion = jtable.rowAtPoint(evt.getPoint());
        txtID.setText(String.valueOf(jtable.getValueAt(seleccion, 0)));
        txtUser.setText(String.valueOf(jtable.getValueAt(seleccion, 1)));
        pswPass.setText(String.valueOf(jtable.getValueAt(seleccion, 2)));
        txtNomApe.setText(String.valueOf(jtable.getValueAt(seleccion, 3)));
        
    }//GEN-LAST:event_jtableMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        int mensaje = JOptionPane.YES_NO_OPTION;
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea borrar este usuario?", "Borrar usuario", mensaje);
        
        if(respuesta == 0){
            try {
                DAO oDAO = new DAO();
                oDAO.borrarUsuario(Integer.parseInt(txtID.getText()));
                txtID.setText(null);
                txtUser.setText(null);
                pswPass.setText(null);
                txtNomApe.setText(null);
                jtable.setModel(oDAO.show_table_user());
                JOptionPane.showConfirmDialog(rootPane, "Usuario borrado correctamente!!");
            } catch (SQLException ex) {
                Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        int mensaje = JOptionPane.YES_NO_OPTION;
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea actualizar este usuario?", "Actualizar usuario", mensaje);
        
        if(respuesta == 0){
            try {
                DAO oDAO = new DAO();
                oDAO.actualizarUsuario(Integer.parseInt(txtID.getText()), txtUser.getText(), pswPass.getText(), txtNomApe.getText());
                txtID.setText(null);
                txtUser.setText(null);
                pswPass.setText(null);
                txtNomApe.setText(null);
                jtable.setModel(oDAO.show_table_user());
                JOptionPane.showMessageDialog(rootPane, "Datos del usuario actualizados correctamente!!");
            } catch (SQLException ex) {
                Logger.getLogger(OpUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

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
            java.util.logging.Logger.getLogger(OpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrearUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomApe;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
