package com.sri.interfaces.iva;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sri.clases.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculoIva extends javax.swing.JFrame {
    public CalculoIva() {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAño = new javax.swing.JComboBox();
        comboMeses = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        btnCacular = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnFactVentas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcularIVA6 = new javax.swing.JButton();
        btnCalcularIVA7 = new javax.swing.JButton();
        btnCalcularIVA3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("406");

        lbltotal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal.setText("Impuesto generado");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("FACTURAS DE VENTAS");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("FACTURAS DE COMPRAS");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel26.setText("Locales (excluye activos fijos) gravadas tarifa 12%:");

        lblVB1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB1.setText("0");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setText("Activos fijos gravadas tarifa 12%:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Locales (excluye activos fijos) gravadas tarifa 0% que no dan derecho a credito tributario:");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setText("Activos fijos gravadas tarifa 0% que no dan derecho a credito tributario:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel30.setText("Activos fijos gravadas tarifa 0% que dan derecho a credito tributario:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel31.setText("Locales (excluye activos fijos) gravadas tarifa 0% que dan derecho a credito tributario:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel32.setText("RESULTADOS DE FACTURAS DE COMPRAS:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel33.setText("Adquisiciones realizadas a contribuyentes RISE:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel35.setText("Adquisiciones y pagos (incluye activos fijos)  gravados tarifa 0%:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel36.setText("Otras adquisiciones y pagos gravados tarifa 12% (Sin derecho a crédito tributario):");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Adquisiciones Locales de activos fijos gravados tarifa 12% (con derecho a crédito tributario):");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setText("Adquisiciones y pagos (excluye activos fijos) gravados tarifa 12% (con derecho a crédito tributario):");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel39.setText("Número total de facturas :");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel34.setText("RESULTADOS DE FACTURAS DE VENTAS:");

        lblVB2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB2.setText("0");

        lblVB3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB3.setText("0");

        lblVB4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB4.setText("0");

        lblVB5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB5.setText("0");

        lblVB6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB6.setText("0");

        lbltotal7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal7.setText("0");

        lblVB1C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB1C.setText("0");

        lblVB2C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB2C.setText("0");

        lblVB3C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB3C.setText("0");

        lblVB4C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB4C.setText("0");

        lblVB5C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVB5C.setText("0");

        lbltotal13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal13.setText("0");

        lbltotal14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal14.setText("Valor bruto");

        lbltotal15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal15.setText("Subtotal");

        lbltotal16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal16.setText("Impuesto generado");

        lbltotal17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal17.setText("Valor bruto");

        lbltotal18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotal18.setText("Subtotal");

        lblVSB1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB1.setText("0");

        lblVSB2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB2.setText("0");

        lblIVAVen2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVAVen2.setText("0");

        lblIVAVen1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVAVen1.setText("0");

        lblVSB1C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB1C.setText("0");

        lblVSB2C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB2C.setText("0");

        lblVSB3C.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblVSB3C.setText("0");

        lblIVACom1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom1.setText("0");

        lblIVACom2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom2.setText("0");

        lblIVACom3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblIVACom3.setText("0");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel40.setText("Número total de facturas :");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 204, 51));
        jLabel41.setText("401");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 204, 51));
        jLabel42.setText("402");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 204, 51));
        jLabel43.setText("403");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 204, 51));
        jLabel44.setText("404");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 204, 51));
        jLabel45.setText("405");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 51, 255));
        jLabel46.setText("421");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 51, 255));
        jLabel47.setText("422");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 51));
        jLabel48.setText("Total ventas y otras operaciones:");

        lbltotVentas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotVentas.setText("0");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 51));
        jLabel49.setText("409");

        lbltotalIVAVentas.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotalIVAVentas.setText("0");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 51));
        jLabel50.setText("429=499");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 0));
        jLabel51.setText("500");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 0));
        jLabel52.setText("501");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 0));
        jLabel53.setText("502");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 0));
        jLabel54.setText("507");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 0));
        jLabel55.setText("508");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 255));
        jLabel56.setText("520");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 255));
        jLabel57.setText("522");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 255));
        jLabel58.setText("521");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 0, 51));
        jLabel59.setText("Total adquisiciones y pagos:");

        lbltotCmpras.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotCmpras.setText("0");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 0, 51));
        jLabel60.setText("509");

        lbltotalIVACom.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbltotalIVACom.setText("0");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 0, 51));
        jLabel61.setText("529");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 204));
        jLabel62.setText("(401+402+405+406)/409");

        lblFactor.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblFactor.setText("0");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 204));
        jLabel63.setText("563");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 204));
        jLabel64.setText("Factor de proporcionalidad para crédito tributario:");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 204));
        jLabel65.setText("(520+521)x563");

        lblCre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblCre.setText("0");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 204));
        jLabel66.setText("564");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 204));
        jLabel67.setText("Factor de proporcionalidad para crédito tributario:");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 204));
        jLabel68.setText("Impuesto Causado (SI 499 - 564 es mayor que cero):");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 204));
        jLabel69.setText("Crédito tributario aplicable en este período (SI 499-564 es menor que cero):");

        lblImpCau.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblImpCau.setText("0");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 204));
        jLabel70.setText("601");

        lblAplica.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblAplica.setText("0");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 204));
        jLabel71.setText("602");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(400, 400, 400)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(620, 620, 620)
                            .addComponent(lbltotal14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(lbltotal15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbltotal13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(278, 278, 278)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(lblVSB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblIVAVen1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(386, 386, 386)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(lblVSB2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblIVAVen2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(67, 67, 67)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(170, 170, 170)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addGap(86, 86, 86)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel34)
                            .addGap(14, 14, 14)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbltotVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(lbltotalIVAVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(420, 420, 420)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(620, 620, 620)
                            .addComponent(lbltotal17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(lbltotal18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lbltotal16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lbltotal7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB1C, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(lblVSB1C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lblIVACom1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB2C, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblVSB2C, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIVACom2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB3C, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblVSB3C, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIVACom3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB4C, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(153, 153, 153)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblVB5C, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel32)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbltotCmpras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbltotalIVACom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblCre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblImpCau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblAplica, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbltotal14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotal15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel40)
                        .addComponent(lbltotal13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel26))
                        .addComponent(jLabel41)
                        .addComponent(lblVB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVSB1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46)
                        .addComponent(lblIVAVen1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel27))
                        .addComponent(jLabel42)
                        .addComponent(lblVB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVSB2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47)
                        .addComponent(lblIVAVen2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel28))
                        .addComponent(jLabel43)
                        .addComponent(lblVB3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel29))
                        .addComponent(jLabel44)
                        .addComponent(lblVB4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel31))
                        .addComponent(jLabel45)
                        .addComponent(lblVB5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel30))
                        .addComponent(jLabel12)
                        .addComponent(lblVB6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addComponent(jLabel48)
                        .addComponent(jLabel49)
                        .addComponent(lbltotVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotalIVAVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jLabel7)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbltotal17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotal18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotal16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotal7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(lblVB1C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVSB1C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)
                        .addComponent(lblIVACom1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52)
                        .addComponent(lblVB2C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58)
                        .addComponent(lblVSB2C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIVACom2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53)
                        .addComponent(lblVB3C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57)
                        .addComponent(lblVSB3C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIVACom3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54)
                        .addComponent(lblVB4C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)
                        .addComponent(lblVB5C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59)
                        .addComponent(jLabel60)
                        .addComponent(lbltotCmpras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltotalIVACom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel64)
                        .addComponent(jLabel62)
                        .addComponent(jLabel63)
                        .addComponent(lblFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel67)
                        .addComponent(jLabel65)
                        .addComponent(jLabel66)
                        .addComponent(lblCre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel68)
                        .addComponent(jLabel70)
                        .addComponent(lblImpCau, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel69)
                        .addComponent(jLabel71)
                        .addComponent(lblAplica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1040, 540));

        jLabel1.setText("Seleccione el año:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Calculo del IVA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 60, -1, -1));

        getContentPane().add(comboAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        getContentPane().add(comboMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        jLabel13.setText("Seleccione el mes:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        btnCacular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCacular.setText("Calcular");
        btnCacular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCacular, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 106, -1, -1));

        btnFactCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactCompraICO.png"))); // NOI18N
        btnFactCompras.setText("Facturas Compras");
        btnFactCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactComprasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        btnFactVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactVentaICO.png"))); // NOI18N
        btnFactVentas.setText("Facturas Ventas");
        btnFactVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        btnCalcularIVA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA6.setText("IVA");
        btnCalcularIVA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularIVA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        btnCalcularIVA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA7.setText("Impuesto a la renta");
        btnCalcularIVA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularIVA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btnCalcularIVA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_46632 (2).png"))); // NOI18N
        btnCalcularIVA3.setText("Ingresos");
        btnCalcularIVA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularIVA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnCacularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacularActionPerformed
    limpiarcampos();
    mes();
    conexion cc = new conexion();
    Connection cn = (Connection) cc.conexion();
    Statement stmt = null;
    ResultSet rs = null;
    try {
        stmt = (Statement) cn.createStatement();
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

    private void btnCalcularIVA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA6ActionPerformed
        this.setVisible(false);
        CalculoIva a = new CalculoIva();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA6ActionPerformed

    private void btnCalcularIVA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CalculoImpuestoRenta a = new CalculoImpuestoRenta();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA7ActionPerformed

    private void btnCalcularIVA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ingresos a = new Ingresos();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCacular;
    private javax.swing.JButton btnCalcularIVA3;
    private javax.swing.JButton btnCalcularIVA6;
    private javax.swing.JButton btnCalcularIVA7;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
