/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Personal
 */
public class Contrasena extends javax.swing.JFrame {

    /**
     * Creates new form Contrasena
     */
    public Contrasena() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("CARPINTERIA JOSE ABEL");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();

        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 30));
        jPanel9.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 490, 50));
        jPanel9.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        rSButton1.setText("Cancelar");
        rSButton1.setColorHover(new java.awt.Color(204, 0, 0));
        rSButton1.setColorText(new java.awt.Color(0, 0, 0));
        jPanel9.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 160, 50));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 520, 520));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 610, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // Acción del botón login
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // Evento de clic en login
    }//GEN-LAST:event_loginMouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        login lg = new login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contrasena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton login;
    private rojeru_san.RSButton rSButton1;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
