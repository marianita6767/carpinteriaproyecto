/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ZenBook
 */
public class Inventario extends javax.swing.JPanel {

    /**
     * Creates new form Inventario
     */
    public Inventario() {

        initComponents();
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMateriales = new rojeru_san.RSButtonRiple();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterialIcon();
        btnHerramientas = new rojeru_san.RSButtonRiple();
        jPanelMaterial1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSButton4 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();
        rSButton6 = new rojeru_san.RSButton();
        jPanelMaterial2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rSButton7 = new rojeru_san.RSButton();
        rSButton8 = new rojeru_san.RSButton();
        rSButton9 = new rojeru_san.RSButton();
        jPanelMaterial3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jPanelMaterial4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnProductos = new rojeru_san.RSButtonRiple();
        btnMovimientos = new rojeru_san.RSButtonRiple();
        btnNuevo = new rojeru_san.RSButtonRiple();

        setBackground(new java.awt.Color(228, 233, 247));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(32767, 32));
        setPreferredSize(new java.awt.Dimension(1015, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMateriales.setBackground(new java.awt.Color(0, 0, 0));
        btnMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/box.png"))); // NOI18N
        btnMateriales.setText("  Materiales");
        btnMateriales.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialesActionPerformed(evt);
            }
        });
        add(btnMateriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, -1));

        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setColorIcon(new java.awt.Color(0, 0, 0));
        txtBuscar.setColorMaterial(new java.awt.Color(153, 153, 153));
        txtBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscar.setPhColor(new java.awt.Color(102, 102, 102));
        txtBuscar.setPlaceholder("Buscar...");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 357, -1));

        btnHerramientas.setBackground(new java.awt.Color(0, 0, 0));
        btnHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wrench.png"))); // NOI18N
        btnHerramientas.setText("  Herramientas");
        btnHerramientas.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHerramientasActionPerformed(evt);
            }
        });
        add(btnHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, -1));

        jPanelMaterial1.setBackground(new java.awt.Color(46, 49, 82));
        jPanelMaterial1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdfimg.jpeg"))); // NOI18N
        jPanelMaterial1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo: 101");
        jPanelMaterial1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre: Mdf");
        jPanelMaterial1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria: Maderas");
        jPanelMaterial1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        rSButton4.setBackground(new java.awt.Color(255, 51, 51));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete (1).png"))); // NOI18N
        jPanelMaterial1.add(rSButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 30, 20));

        rSButton5.setBackground(new java.awt.Color(0, 153, 255));
        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil (1)_1.png"))); // NOI18N
        jPanelMaterial1.add(rSButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 30, 20));

        rSButton6.setBackground(new java.awt.Color(0, 204, 0));
        rSButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        rSButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton6ActionPerformed(evt);
            }
        });
        jPanelMaterial1.add(rSButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 30, 20));

        add(jPanelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 330));

        jPanelMaterial2.setBackground(new java.awt.Color(46, 49, 82));
        jPanelMaterial2.setPreferredSize(new java.awt.Dimension(261, 329));
        jPanelMaterial2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pega-madera-40 (2).jpg"))); // NOI18N
        jPanelMaterial2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo: 102");
        jPanelMaterial2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre: Pegamento");
        jPanelMaterial2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Categoria: Adhesivos");
        jPanelMaterial2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        rSButton7.setBackground(new java.awt.Color(255, 51, 51));
        rSButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete (1).png"))); // NOI18N
        jPanelMaterial2.add(rSButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 30, 20));

        rSButton8.setBackground(new java.awt.Color(0, 153, 255));
        rSButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil (1)_1.png"))); // NOI18N
        jPanelMaterial2.add(rSButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 30, 20));

        rSButton9.setBackground(new java.awt.Color(0, 204, 0));
        rSButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        rSButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton9ActionPerformed(evt);
            }
        });
        jPanelMaterial2.add(rSButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 30, 20));

        add(jPanelMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 210, 330));

        jPanelMaterial3.setBackground(new java.awt.Color(46, 49, 82));
        jPanelMaterial3.setPreferredSize(new java.awt.Dimension(225, 355));
        jPanelMaterial3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clavos (3).jpeg"))); // NOI18N
        jPanelMaterial3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 240, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo: 103");
        jPanelMaterial3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre: Clavos");
        jPanelMaterial3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categoria: Tornillería");
        jPanelMaterial3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        rSButton1.setBackground(new java.awt.Color(255, 51, 51));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete (1).png"))); // NOI18N
        jPanelMaterial3.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 30, 20));

        rSButton3.setBackground(new java.awt.Color(0, 153, 255));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil (1)_1.png"))); // NOI18N
        jPanelMaterial3.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 30, 20));

        rSButton2.setBackground(new java.awt.Color(0, 204, 0));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanelMaterial3.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 30, 20));

        add(jPanelMaterial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 210, 330));

        jPanelMaterial4.setBackground(new java.awt.Color(46, 49, 82));
        jPanelMaterial4.setPreferredSize(new java.awt.Dimension(225, 355));
        jPanelMaterial4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdfimg.jpeg"))); // NOI18N
        jPanelMaterial4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanelMaterial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 210, 330));

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda-de-comestibles.png"))); // NOI18N
        btnProductos.setText("  Productos terminados");
        btnProductos.setToolTipText("");
        btnProductos.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 250, -1));

        btnMovimientos.setBackground(new java.awt.Color(0, 0, 0));
        btnMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transfer.png"))); // NOI18N
        btnMovimientos.setText("  Movimientos");
        btnMovimientos.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientosActionPerformed(evt);
            }
        });
        add(btnMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 180, -1));

        btnNuevo.setBackground(new java.awt.Color(46, 49, 82));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus (2).png"))); // NOI18N
        btnNuevo.setText(" Nuevo");
        btnNuevo.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 130, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaterialesActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHerramientasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHerramientasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMovimientosActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton6ActionPerformed

    private void rSButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton9ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnHerramientas;
    private rojeru_san.RSButtonRiple btnMateriales;
    private rojeru_san.RSButtonRiple btnMovimientos;
    private rojeru_san.RSButtonRiple btnNuevo;
    private rojeru_san.RSButtonRiple btnProductos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelMaterial1;
    private javax.swing.JPanel jPanelMaterial2;
    private javax.swing.JPanel jPanelMaterial3;
    private javax.swing.JPanel jPanelMaterial4;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton6;
    private rojeru_san.RSButton rSButton7;
    private rojeru_san.RSButton rSButton8;
    private rojeru_san.RSButton rSButton9;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscar;
    // End of variables declaration//GEN-END:variables


}

