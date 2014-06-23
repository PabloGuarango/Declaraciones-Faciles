package com.sri.interfaces.iva;

import com.sri.clases.conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class Calculo extends javax.swing.JFrame {

    public Calculo() {
        initComponents();
        this.setLocationRelativeTo(null);

        for (int i = 1970; i < 2015; i++) {
            this.comboAño.addItem(i);
        }
        this.comboAño.setSelectedItem(2014);
        this.comboMeses.addItem("Enero");
        this.comboMeses.addItem("Febrero");
        this.comboMeses.addItem("Marzo");
        this.comboMeses.addItem("Abril");
        this.comboMeses.addItem("Mayo");
        this.comboMeses.addItem("Junio");
        this.comboMeses.addItem("Julio");
        this.comboMeses.addItem("Agosto");
        this.comboMeses.addItem("Septiembre");
        this.comboMeses.addItem("Octubre");
        this.comboMeses.addItem("Noviembre");
        this.comboMeses.addItem("Diciembre");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAño = new javax.swing.JComboBox();
        comboMeses = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        btnCacular = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCalcularIVA = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnFactVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        lblVB1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblVB2 = new javax.swing.JLabel();
        lblVB3 = new javax.swing.JLabel();
        lblVB4 = new javax.swing.JLabel();
        lblVB5 = new javax.swing.JLabel();
        lblVB6 = new javax.swing.JLabel();
        lbltotal7 = new javax.swing.JLabel();
        lblVB1C = new javax.swing.JLabel();
        lblVB2C = new javax.swing.JLabel();
        lblVB3C = new javax.swing.JLabel();
        lblVB4C = new javax.swing.JLabel();
        lblVB5C = new javax.swing.JLabel();
        lbltotal13 = new javax.swing.JLabel();
        lbltotal14 = new javax.swing.JLabel();
        lbltotal15 = new javax.swing.JLabel();
        lbltotal16 = new javax.swing.JLabel();
        lbltotal17 = new javax.swing.JLabel();
        lbltotal18 = new javax.swing.JLabel();
        lblVSB1 = new javax.swing.JLabel();
        lblVSB2 = new javax.swing.JLabel();
        lblIVAVen2 = new javax.swing.JLabel();
        lblIVAVen1 = new javax.swing.JLabel();
        lblVSB1C = new javax.swing.JLabel();
        lblVSB2C = new javax.swing.JLabel();
        lblVSB3C = new javax.swing.JLabel();
        lblIVACom1 = new javax.swing.JLabel();
        lblIVACom2 = new javax.swing.JLabel();
        lblIVACom3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lbltotVentas = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbltotalIVAVentas = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lbltotCmpras = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lbltotalIVACom = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        lblFactor = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lblCre = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lblImpCau = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        lblAplica = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Seleccione el año:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("406");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 30, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Calculo del IVA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        getContentPane().add(comboAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        getContentPane().add(comboMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel13.setText("Seleccione el mes:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        btnCacular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCacular.setText("Calcular");
        btnCacular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCacular, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        lbltotal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal.setText("Impuesto generado");
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 130, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("FACTURAS DE VENTAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("FACTURAS DE COMPRAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        btnCalcularIVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA.setText("CALCULAR IVA");
        btnCalcularIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        btnFactCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactCompraICO.png"))); // NOI18N
        btnFactCompras.setText("Facturas Compras");
        btnFactCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        btnFactVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactVentaICO.png"))); // NOI18N
        btnFactVentas.setText("Facturas Ventas");
        btnFactVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel26.setText("Locales (excluye activos fijos) gravadas tarifa 12%:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 312, -1));

        lblVB1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB1.setText("0");
        getContentPane().add(lblVB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 110, 20));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setText("Activos fijos gravadas tarifa 12%:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 204, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Locales (excluye activos fijos) gravadas tarifa 0% que no dan derecho a credito tributario:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setText("Activos fijos gravadas tarifa 0% que no dan derecho a credito tributario:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setText("Activos fijos gravadas tarifa 0% que dan derecho a credito tributario:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel31.setText("Locales (excluye activos fijos) gravadas tarifa 0% que dan derecho a credito tributario:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel32.setText("RESULTADOS DE FACTURAS DE COMPRAS:");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, -1, 20));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel33.setText("Adquisiciones realizadas a contribuyentes RISE:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 437, 20));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel35.setText("Adquisiciones y pagos (incluye activos fijos)  gravados tarifa 0%:");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 477, 20));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setText("Otras adquisiciones y pagos gravados tarifa 12% (Sin derecho a crédito tributario):");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 509, 20));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Adquisiciones Locales de activos fijos gravados tarifa 12% (con derecho a crédito tributario):");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 561, 20));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setText("Adquisiciones y pagos (excluye activos fijos) gravados tarifa 12% (con derecho a crédito tributario):");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 587, 20));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel39.setText("Número total de facturas :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 20));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setText("RESULTADOS DE FACTURAS DE VENTAS:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        lblVB2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB2.setText("0");
        getContentPane().add(lblVB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, 20));

        lblVB3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB3.setText("0");
        getContentPane().add(lblVB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 120, 20));

        lblVB4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB4.setText("0");
        getContentPane().add(lblVB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 110, 20));

        lblVB5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB5.setText("0");
        getContentPane().add(lblVB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 120, 20));

        lblVB6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB6.setText("0");
        getContentPane().add(lblVB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 120, 20));

        lbltotal7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal7.setText("0");
        getContentPane().add(lbltotal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 120, 20));

        lblVB1C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB1C.setText("0");
        getContentPane().add(lblVB1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 120, 20));

        lblVB2C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB2C.setText("0");
        getContentPane().add(lblVB2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 110, 20));

        lblVB3C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB3C.setText("0");
        getContentPane().add(lblVB3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 110, 20));

        lblVB4C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB4C.setText("0");
        getContentPane().add(lblVB4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 110, 20));

        lblVB5C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB5C.setText("0");
        getContentPane().add(lblVB5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 120, 20));

        lbltotal13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal13.setText("0");
        getContentPane().add(lbltotal13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 110, 20));

        lbltotal14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal14.setText("Valor bruto");
        getContentPane().add(lbltotal14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 90, 20));

        lbltotal15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal15.setText("Subtotal");
        getContentPane().add(lbltotal15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 80, 20));

        lbltotal16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal16.setText("Impuesto generado");
        getContentPane().add(lbltotal16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 130, 20));

        lbltotal17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal17.setText("Valor bruto");
        getContentPane().add(lbltotal17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 90, 20));

        lbltotal18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal18.setText("Subtotal");
        getContentPane().add(lbltotal18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 80, 20));

        lblVSB1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB1.setText("0");
        getContentPane().add(lblVSB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 90, 20));

        lblVSB2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB2.setText("0");
        getContentPane().add(lblVSB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 90, 20));

        lblIVAVen2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVAVen2.setText("0");
        getContentPane().add(lblIVAVen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 130, 20));

        lblIVAVen1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVAVen1.setText("0");
        getContentPane().add(lblIVAVen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 130, 20));

        lblVSB1C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB1C.setText("0");
        getContentPane().add(lblVSB1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 100, 20));

        lblVSB2C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB2C.setText("0");
        getContentPane().add(lblVSB2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 110, 20));

        lblVSB3C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB3C.setText("0");
        getContentPane().add(lblVSB3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 110, 20));

        lblIVACom1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom1.setText("0");
        getContentPane().add(lblIVACom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 550, 120, 20));

        lblIVACom2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom2.setText("0");
        getContentPane().add(lblIVACom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 110, 20));

        lblIVACom3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom3.setText("0");
        getContentPane().add(lblIVACom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 110, 20));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel40.setText("Número total de facturas :");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 204, 51));
        jLabel41.setText("401");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 30, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 204, 51));
        jLabel42.setText("402");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 30, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 204, 51));
        jLabel43.setText("403");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 30, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 204, 51));
        jLabel44.setText("404");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 30, -1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 204, 51));
        jLabel45.setText("405");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 30, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 51, 255));
        jLabel46.setText("421");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 30, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 51, 255));
        jLabel47.setText("422");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 30, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 51));
        jLabel48.setText("Total ventas y otras operaciones:");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 200, -1));

        lbltotVentas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotVentas.setText("0");
        getContentPane().add(lbltotVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 120, 20));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 51));
        jLabel49.setText("409");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, -1));

        lbltotalIVAVentas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotalIVAVentas.setText("0");
        getContentPane().add(lbltotalIVAVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 120, 20));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 51));
        jLabel50.setText("429=499");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 60, 20));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 0));
        jLabel51.setText("500");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 30, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 0));
        jLabel52.setText("501");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 30, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 0));
        jLabel53.setText("502");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 30, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 0));
        jLabel54.setText("507");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 30, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 0));
        jLabel55.setText("508");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, 30, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 255));
        jLabel56.setText("520");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 30, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 255));
        jLabel57.setText("522");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, 30, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 255));
        jLabel58.setText("521");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 30, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 0, 51));
        jLabel59.setText("Total adquisiciones y pagos:");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 710, 200, -1));

        lbltotCmpras.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotCmpras.setText("0");
        getContentPane().add(lbltotCmpras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 710, 120, 20));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 0, 51));
        jLabel60.setText("509");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 30, -1));

        lbltotalIVACom.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotalIVACom.setText("0");
        getContentPane().add(lbltotalIVACom, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 710, 120, 20));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 0, 51));
        jLabel61.setText("529");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 710, 30, 20));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 204));
        jLabel62.setText("(401+402+405+406)/409");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, 150, -1));

        lblFactor.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblFactor.setText("0");
        getContentPane().add(lblFactor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 750, 120, 20));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 204));
        jLabel63.setText("563");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 750, 30, -1));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 204));
        jLabel64.setText("Factor de proporcionalidad para crédito tributario:");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 750, 300, -1));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 204));
        jLabel65.setText("(520+521)x563");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 150, -1));

        lblCre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblCre.setText("0");
        getContentPane().add(lblCre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 780, 120, 20));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 204));
        jLabel66.setText("564");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 780, 30, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 204));
        jLabel67.setText("Factor de proporcionalidad para crédito tributario:");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 780, 300, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 204));
        jLabel68.setText("Impuesto Causado (SI 499 - 564 es mayor que cero):");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, 320, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 204));
        jLabel69.setText("Crédito tributario aplicable en este período (SI 499-564 es menor que cero):");
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 840, 450, -1));

        lblImpCau.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblImpCau.setText("0");
        getContentPane().add(lblImpCau, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 810, 120, 20));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 204));
        jLabel70.setText("601");
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 810, 30, -1));

        lblAplica.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblAplica.setText("0");
        getContentPane().add(lblAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 840, 120, 20));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 204));
        jLabel71.setText("602");
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 840, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void limpiarcampos() {
        lbltotal.setText("0");
    }
    String mes = null;

    private void mes() {
        String mesCom = String.valueOf(this.comboMeses.getSelectedItem());
        if (mesCom.equals("Enero")) {
            mes = "January";
        } else {
            if (mesCom.equals("Febrero")) {
                mes = "February";
            } else {
                if (mesCom.equals("Marzo")) {
                    mes = "March";
                } else {
                    if (mesCom.equals("Abril")) {
                        mes = "April";
                    } else {
                        if (mesCom.equals("Mayo")) {
                            mes = "May";
                        } else {
                            if (mesCom.equals("Junio")) {
                                mes = "June";
                            } else {
                                if (mesCom.equals("Julio")) {
                                    mes = "July";
                                } else {
                                    if (mesCom.equals("Agosto")) {
                                        mes = "August";
                                    } else {
                                        if (mesCom.equals("Septiembre")) {
                                            mes = "September";
                                        } else {
                                            if (mesCom.equals("Octubre")) {
                                                mes = "October";
                                            } else {
                                                if (mesCom.equals("Noviembre")) {
                                                    mes = "November";
                                                } else {
                                                    if (mesCom.equals("Diciembre")) {
                                                        mes = "December";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
private void btnCacularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacularActionPerformed
    limpiarcampos();
    mes();
    conexion cc = new conexion();
    Connection cn = cc.conexion();
    Statement stmt = null;
    ResultSet rs = null;
    try {
        stmt = cn.createStatement();
        //Ventas
        rs = stmt.executeQuery("select count(ivafactventa) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + ";");
        while (rs.next()) {
            int inom = rs.getInt("id_t");
            lbltotal13.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB1.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB2.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=3;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB3.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=4;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB4.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=5;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB5.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=6;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB6.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(subtotal) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVSB1.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(subtotal) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVSB2.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(ivaFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblIVAVen1.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(ivaFactVenta) as id_t from FacturasVentas where monthname(fechafactVenta)='" + mes + "'and year(fechafactVenta)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblIVAVen2.setText("" + inom);
        }
        float a = Float.parseFloat(lblVB1.getText()) + Float.parseFloat(lblVB2.getText()) + Float.parseFloat(lblVB3.getText()) + Float.parseFloat(lblVB4.getText()) + Float.parseFloat(lblVB5.getText()) + Float.parseFloat(lblVB6.getText());
        lbltotVentas.setText("" + a);
        a = Float.parseFloat(lblIVAVen1.getText()) + Float.parseFloat(lblIVAVen2.getText());
        lbltotalIVAVentas.setText("" + a);
        //Compras
        rs = stmt.executeQuery("select count(ivaFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + ";");
        while (rs.next()) {
            int inom = rs.getInt("id_t");
            lbltotal7.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB1C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB2C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=3;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB3C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=4;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB4C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(valorFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=5;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVB5C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(subtotal) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVSB1C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(subtotal) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVSB2C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(subtotal) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =3;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblVSB3C.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(ivaFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact =1;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblIVACom1.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(ivaFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=2;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblIVACom2.setText("" + inom);
        }
        rs = stmt.executeQuery("select sum(ivaFactCompra) as id_t from FacturasCompras where monthname(fechaFactCompra)='" + mes + "'and year(fechaFactCompra)=" + String.valueOf(this.comboAño.getSelectedItem()) + " and tipoFact=3;");
        while (rs.next()) {
            float inom = rs.getFloat("id_t");
            lblIVACom3.setText("" + inom);
        }
        float a1 = (float) (Math.rint((Float.parseFloat(lblVB1C.getText()) + Float.parseFloat(lblVB2C.getText()) + Float.parseFloat(lblVB3C.getText()) + Float.parseFloat(lblVB4C.getText()) + Float.parseFloat(lblVB5C.getText())) * 100) / 100);
        lbltotCmpras.setText("" + a1);
        a1 = (float) (Math.rint((Float.parseFloat(lblIVACom1.getText()) + Float.parseFloat(lblIVACom2.getText()) + Float.parseFloat(lblIVACom3.getText())) * 100) / 100);
        lbltotalIVACom.setText("" + a1);
        float f = (float) (Math.rint((Float.parseFloat(lblVB1.getText()) + Float.parseFloat(lblVB2.getText()) + Float.parseFloat(lblVB5.getText()) + Float.parseFloat(lblVB6.getText())) / Float.parseFloat(lbltotVentas.getText()) * 100) / 100);
        lblFactor.setText("" + f);
        float cre = (float) (Math.rint((Float.parseFloat(lblIVACom1.getText()) + Float.parseFloat(lblIVACom2.getText())) * Float.parseFloat(lblFactor.getText()) * 100) / 100);
        lblCre.setText("" + cre);
        float imp = (float) (Math.rint((Float.parseFloat(lbltotalIVAVentas.getText()) - Float.parseFloat(lblCre.getText())) * 100) / 100);
        if (imp > 0) {
            lblImpCau.setText("" + imp);
        } else {
            lblAplica.setText("" + imp);
        }
    } catch (SQLException ex) {
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    } finally {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) {
            } // ignore 

            rs = null;
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) {
            } 
            stmt = null;
        }
    }
}//GEN-LAST:event_btnCacularActionPerformed

    private void btnCalcularIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVAActionPerformed
        this.setVisible(false);
        CalculoIva a = new CalculoIva();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVAActionPerformed

    private void btnFactComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactComprasActionPerformed
        this.setVisible(false);
        IngresarFacturasCompra a = new IngresarFacturasCompra();
        a.setVisible(true);
    }//GEN-LAST:event_btnFactComprasActionPerformed

    private void btnFactVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactVentasActionPerformed
        this.setVisible(false);
        IngresarFacturasVentas a = new IngresarFacturasVentas();
        a.setVisible(true);
    }//GEN-LAST:event_btnFactVentasActionPerformed

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
}//GEN-LAST:event_btnSalirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCacular;
    private javax.swing.JButton btnCalcularIVA;
    private javax.swing.JButton btnFactCompras;
    private javax.swing.JButton btnFactVentas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboAño;
    private javax.swing.JComboBox comboMeses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel lblAplica;
    private javax.swing.JLabel lblCre;
    private javax.swing.JLabel lblFactor;
    private javax.swing.JLabel lblIVACom1;
    private javax.swing.JLabel lblIVACom2;
    private javax.swing.JLabel lblIVACom3;
    private javax.swing.JLabel lblIVAVen1;
    private javax.swing.JLabel lblIVAVen2;
    private javax.swing.JLabel lblImpCau;
    private javax.swing.JLabel lblVB1;
    private javax.swing.JLabel lblVB1C;
    private javax.swing.JLabel lblVB2;
    private javax.swing.JLabel lblVB2C;
    private javax.swing.JLabel lblVB3;
    private javax.swing.JLabel lblVB3C;
    private javax.swing.JLabel lblVB4;
    private javax.swing.JLabel lblVB4C;
    private javax.swing.JLabel lblVB5;
    private javax.swing.JLabel lblVB5C;
    private javax.swing.JLabel lblVB6;
    private javax.swing.JLabel lblVSB1;
    private javax.swing.JLabel lblVSB1C;
    private javax.swing.JLabel lblVSB2;
    private javax.swing.JLabel lblVSB2C;
    private javax.swing.JLabel lblVSB3C;
    private javax.swing.JLabel lbltotCmpras;
    private javax.swing.JLabel lbltotVentas;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotal13;
    private javax.swing.JLabel lbltotal14;
    private javax.swing.JLabel lbltotal15;
    private javax.swing.JLabel lbltotal16;
    private javax.swing.JLabel lbltotal17;
    private javax.swing.JLabel lbltotal18;
    private javax.swing.JLabel lbltotal7;
    private javax.swing.JLabel lbltotalIVACom;
    private javax.swing.JLabel lbltotalIVAVentas;
    // End of variables declaration//GEN-END:variables
}
