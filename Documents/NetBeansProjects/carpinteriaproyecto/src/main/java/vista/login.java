/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Contrl_login;
import java.awt.Color;
//import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Usuario;


/**
 *
 * @author buitr
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("CARPINTERIA JOSE ABEL");
        this.setSize(new Dimension(700, 500));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        rSButtonMetroBeanInfo1 = new rojerusan.RSButtonMetroBeanInfo();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        passtxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jPanel8 = new javax.swing.JPanel();

        jPanel5.setBackground(new java.awt.Color(29, 30, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel4.setText("¡BIENVENIDO!");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 270, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 270, 10));

        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("INGRESE SU USUARIO");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel6.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 270, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, -1));

        jCheckBox1.setText("Recuerdame");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 106, -1));

        passtxt.setForeground(new java.awt.Color(204, 204, 204));
        passtxt.setText("********");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        jPanel6.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 10));

        jLabel2.setText("¿Olvidaste contraseña?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(29, 30, 51));
        rSMaterialButtonRectangle1.setText("INGRESAR");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel6.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 190, 50));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 400, 540));

        jPanel8.setBackground(new java.awt.Color(29, 30, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        ////
        Contrasena contra= new Contrasena();
        contra.setVisible(true); // Hacer visible la nueva ventana
        // Cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_jLabel2MousePressed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
 if(txt_usuario.getText().equals(""));
   txt_usuario.setText("");
   txt_usuario.setForeground(Color.black);
   passtxt.setText("********");
    passtxt.setForeground(Color.black);
    }//GEN-LAST:event_passtxtMousePressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed

    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
   if(txt_usuario.getText().equals("")){
   txt_usuario.setText("");
   txt_usuario.setForeground(Color.black);
   
   }
   if(String.valueOf(passtxt.getPassword()).isEmpty()){
   passtxt.setText("********");
    passtxt.setForeground(Color.black);
   }
   
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
       Login();
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passtxt;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables


private void Login(){
 if(!txt_usuario.getText().isEmpty()&& !passtxt.getText().isEmpty()){
    Contrl_login controlUsuario= new Contrl_login();
     Usuario usuario = new Usuario();
    usuario.setUsuario(txt_usuario.getText().trim());
     usuario.setContrasena(passtxt.getText().trim());
     
     if(controlUsuario.loginUser(usuario)){
        JOptionPane.showMessageDialog(null, "Logeo Exitoso. Bienvenido "+usuario);
           Principal prin= new Principal();
        prin.setVisible(true); // Hacer visible la nueva ventana
        // Cerrar la ventana actual
        this.dispose();
    }else{
         JOptionPane.showMessageDialog(null, "el usuario o las credenciales estan incorrectas, intente de nuevo");
     }
     
 }else{
      JOptionPane.showMessageDialog(null, "porfavor rellene todos los campos");
}
}

}
    
    
    

