/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Personal
 */
public class CrearCliente extends javax.swing.JPanel {

    /**
     * Creates new form CrearCliente
     */
    public CrearCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSTextFieldMaterial1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel2 = new javax.swing.JLabel();
        rSTextFieldMaterial2 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSTextFieldMaterial3 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel5 = new javax.swing.JLabel();
        rSTextFieldMaterial4 = new RSMaterialComponent.RSTextFieldMaterial();
        rSComboBoxMaterial2 = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel6 = new javax.swing.JLabel();
        rSTextFieldMaterial5 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel7 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 30, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR NUEVO CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 80));

        rSTextFieldMaterial1.setForeground(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial1.setCaretColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial1.setColorMaterial(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial1.setPhColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial1.setPlaceholder("Ingrese el nombre");
        rSTextFieldMaterial1.setSelectionColor(new java.awt.Color(29, 30, 51));
        add(rSTextFieldMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, -1));

        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        rSTextFieldMaterial2.setForeground(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial2.setColorMaterial(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial2.setPhColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial2.setPlaceholder("Ingrese el apellido");
        add(rSTextFieldMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 260, -1));

        jLabel3.setText("Numero de identificacion");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel4.setText("error");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 210, -1));

        rSTextFieldMaterial3.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldMaterial3.setColorMaterial(new java.awt.Color(0, 0, 0));
        rSTextFieldMaterial3.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        rSTextFieldMaterial3.setPhColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial3.setPlaceholder("Numero de identificacion");
        add(rSTextFieldMaterial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 260, -1));

        jLabel5.setText("error");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, -1));

        rSTextFieldMaterial4.setForeground(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial4.setColorMaterial(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial4.setPhColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial4.setPlaceholder("Direccion");
        rSTextFieldMaterial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSTextFieldMaterial4ActionPerformed(evt);
            }
        });
        add(rSTextFieldMaterial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 260, -1));

        rSComboBoxMaterial2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de identificacion:", "CC", "TI", "CE" }));
        rSComboBoxMaterial2.setColorMaterial(new java.awt.Color(29, 30, 51));
        rSComboBoxMaterial2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(rSComboBoxMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, -1));

        jLabel6.setText("Apellido");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 210, -1));

        rSTextFieldMaterial5.setForeground(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial5.setColorMaterial(new java.awt.Color(29, 30, 31));
        rSTextFieldMaterial5.setPhColor(new java.awt.Color(29, 30, 51));
        rSTextFieldMaterial5.setPlaceholder("Correo electronico");
        add(rSTextFieldMaterial5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 280, -1));

        jLabel7.setText("error");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));

        rSButton1.setBackground(new java.awt.Color(29, 30, 51));
        rSButton1.setText("Cancelar");
        rSButton1.setColorHover(new java.awt.Color(204, 0, 0));
        add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 100, -1));

        rSButton2.setBackground(new java.awt.Color(29, 30, 51));
        rSButton2.setText("Registrar");
        rSButton2.setColorHover(new java.awt.Color(0, 153, 0));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 90, -1));

        jLabel8.setBackground(new java.awt.Color(228, 233, 247));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 650, 390));

        jLabel9.setText("error");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private RSMaterialComponent.RSComboBoxMaterial rSComboBoxMaterial2;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial1;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial2;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial3;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial5;
    // End of variables declaration//GEN-END:variables
}
