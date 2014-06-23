package com.sri.interfaces;

import com.sri.interfaces.iva.Calculo;
import com.sri.interfaces.iva.CalculoImpuestoRenta;
import com.sri.interfaces.iva.CalculoIva;
import com.sri.interfaces.iva.IngresarFacturasCompra;
import com.sri.interfaces.iva.IngresarFacturasVentas;
import com.sri.interfaces.iva.Ingresos;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        btnFactVentas = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnCalcularIVA = new javax.swing.JButton();
        btnCalcularIVA1 = new javax.swing.JButton();
        btnCalcularIVA2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFactVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactVenta.png"))); // NOI18N
        btnFactVentas.setText("Facturas Ventas");
        btnFactVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactVentasActionPerformed(evt);
            }
        });

        btnFactCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactCompra.png"))); // NOI18N
        btnFactCompras.setText("Facturas Compras");
        btnFactCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactComprasActionPerformed(evt);
            }
        });

        btnCalcularIVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562.png"))); // NOI18N
        btnCalcularIVA.setText("Impuesto a la renta");
        btnCalcularIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVAActionPerformed(evt);
            }
        });

        btnCalcularIVA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562.png"))); // NOI18N
        btnCalcularIVA1.setText("IVA");
        btnCalcularIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA1ActionPerformed(evt);
            }
        });

        btnCalcularIVA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_46632.png"))); // NOI18N
        btnCalcularIVA2.setText("Ingresos");
        btnCalcularIVA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Calcular Datos para:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFactVentas)
                                .addGap(180, 180, 180)
                                .addComponent(btnFactCompras))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnCalcularIVA2)
                        .addGap(0, 263, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcularIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcularIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFactVentas)
                    .addComponent(btnFactCompras))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularIVA2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularIVA)
                    .addComponent(btnCalcularIVA1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnFactVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactVentasActionPerformed
    this.setVisible(false);
    IngresarFacturasVentas a = new IngresarFacturasVentas();
    a.setVisible(true);
}//GEN-LAST:event_btnFactVentasActionPerformed

private void btnFactComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactComprasActionPerformed
    this.setVisible(false);
    IngresarFacturasCompra a = new IngresarFacturasCompra();
    a.setVisible(true);
}//GEN-LAST:event_btnFactComprasActionPerformed

private void btnCalcularIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVAActionPerformed
    this.setVisible(false);
    CalculoImpuestoRenta a = new CalculoImpuestoRenta();
    a.setVisible(true);
}//GEN-LAST:event_btnCalcularIVAActionPerformed

private void btnCalcularIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA1ActionPerformed
// TODO add your handling code here:
   this.setVisible(false);
    CalculoIva a = new CalculoIva();
    a.setVisible(true);
    
}//GEN-LAST:event_btnCalcularIVA1ActionPerformed

private void btnCalcularIVA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA2ActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    Ingresos a = new Ingresos();
    a.setVisible(true);
}//GEN-LAST:event_btnCalcularIVA2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularIVA;
    private javax.swing.JButton btnCalcularIVA1;
    private javax.swing.JButton btnCalcularIVA2;
    private javax.swing.JButton btnFactCompras;
    private javax.swing.JButton btnFactVentas;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
