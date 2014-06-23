package com.sri.interfaces.iva;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sri.clases.ValidarIdentificacion;
import com.sri.clases.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Ingresos extends javax.swing.JFrame {
    public Ingresos() {
        initComponents();
        llenarTable();
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
    private int mes;
    private void mesDB() {
        String mesCom = String.valueOf(this.comboMeses.getSelectedItem());
        if (mesCom.equals("Enero")) {
            mes = 1;
        } else {
            if (mesCom.equals("Febrero")) {
                mes = 2;
            } else {
                if (mesCom.equals("Marzo")) {
                    mes = 3;
                } else {
                    if (mesCom.equals("Abril")) {
                        mes = 4;
                    } else {
                        if (mesCom.equals("Mayo")) {
                            mes = 5;
                        } else {
                            if (mesCom.equals("Junio")) {
                                mes = 6;
                            } else {
                                if (mesCom.equals("Julio")) {
                                    mes = 7;
                                } else {
                                    if (mesCom.equals("Agosto")) {
                                        mes = 8;
                                    } else {
                                        if (mesCom.equals("Septiembre")) {
                                            mes = 9;
                                        } else {
                                            if (mesCom.equals("Octubre")) {
                                                mes = 10;
                                            } else {
                                                if (mesCom.equals("Noviembre")) {
                                                    mes = 11;
                                                } else {
                                                    if (mesCom.equals("Diciembre")) {
                                                        mes = 12;
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
    private String mesin;
    private void mesIn(String mesbd) {
        if (mesbd.equals("1")) {
            mesin = "Enero";
        } else {
            if (mesbd.equals("2")) {
                mesin = "Febrero";
            } else {
                if (mesbd.equals("3")) {
                    mesin = "Marzo";
                } else {
                    if (mesbd.equals("4")) {
                        mesin = "Abril";
                    } else {
                        if (mesbd.equals("5")) {
                            mesin = "Mayo";
                        } else {
                            if (mesbd.equals("6")) {
                                mesin = "Junio";
                            } else {
                                if (mesbd.equals("7")) {
                                    mesin = "Julio";
                                } else {
                                    if (mesbd.equals("8")) {
                                        mesin = "Agosto";
                                    } else {
                                        if (mesbd.equals("9")) {
                                            mesin = "Septiembre";
                                        } else {
                                            if (mesbd.equals("10")) {
                                                mesin = "Octubre";
                                            } else {
                                                if (mesbd.equals("11")) {
                                                    mesin = "Noviembre";
                                                } else {
                                                    if (mesbd.equals("12")) {
                                                        mesin = "Diciembre";
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
    private void llenarTable() {
        tbnCon.removeAll();
        conexion cc = new conexion();
        Connection cn = (Connection) cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        String dat;
        try {
            stmt = (Statement) cn.createStatement();
            rs = stmt.executeQuery("select * from Ingresos;");
            int i = 0;
            while (rs.next()) {
                tbnCon.setValueAt(rs.getString("codigoIngreso"), i, 0);
                //JOptionPane.showMessageDialog(null, rs.getString("codigoFactCompra"));
                //this.comboAño.setSelectedItem(rs.getInt("año"));
                tbnCon.setValueAt(rs.getInt("año"), i, 1);

                mesIn(rs.getString("mes"));
                tbnCon.setValueAt(mesin, i, 2);
                tbnCon.setValueAt(rs.getString("sueldo"), i, 3);
                tbnCon.setValueAt(rs.getString("aporteIESS"), i, 4);
                tbnCon.setValueAt(rs.getString("impuestoRenta"), i, 5);
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
    private void limpiarCampos() {
        txtIESS.setText("");
        txtImpRenta.setText("");
        txtSueldo.setText("");
        txtId.setText("");
    }
    public boolean camposLlenos() {

        if (this.txtIESS.getText().equals("")) {
            return false;
        } else {
            if (this.txtImpRenta.getText().equals("")) {
                return false;
            } else {
                if (this.txtSueldo.getText().equals("")) {
                    return false;
                } else {
                    if (this.txtId.getText().equals("")) {
                        return false;
                    } else {
                        if (this.txtTotal.getText().equals("")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtImpRenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIESS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboAño = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        comboMeses = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbnCon = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnCalcularIVA7 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcularIVA6 = new javax.swing.JButton();
        btnCalcularIVA3 = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnFactVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualozar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el año:");

        txtSueldo.setText("0");
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSueldoKeyPressed(evt);
            }
        });

        txtImpRenta.setText("0");
        txtImpRenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImpRentaKeyPressed(evt);
            }
        });

        jLabel9.setText("Aporte al IESS");

        txtIESS.setText("0");
        txtIESS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIESSKeyPressed(evt);
            }
        });

        jLabel10.setText("Impuesto a la renta");

        jLabel3.setText("Identificador");

        jLabel1.setText("Sueldo");

        jLabel13.setText("Seleccione el mes:");

        jLabel4.setText("Total Ingreso:");

        txtTotal.setText("0");

        tbnCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Año", "Mes", "Sueldo", "Aporte al IESS", "Impuesto a la Renta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbnCon);
        if (tbnCon.getColumnModel().getColumnCount() > 0) {
            tbnCon.getColumnModel().getColumn(0).setResizable(false);
            tbnCon.getColumnModel().getColumn(1).setResizable(false);
            tbnCon.getColumnModel().getColumn(2).setResizable(false);
            tbnCon.getColumnModel().getColumn(3).setResizable(false);
            tbnCon.getColumnModel().getColumn(4).setResizable(false);
            tbnCon.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Ingresos");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIESS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(txtImpRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel10))))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel13)
                                .addGap(43, 43, 43)
                                .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnAgregar)
                        .addGap(36, 36, 36)
                        .addComponent(btnConsultar)
                        .addGap(50, 50, 50)
                        .addComponent(btnModificar)
                        .addGap(37, 37, 37)
                        .addComponent(btnBorrar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel5)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtImpRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCalcularIVA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA7.setText("Impuesto a la renta");
        btnCalcularIVA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA7ActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCalcularIVA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA6.setText("IVA");
        btnCalcularIVA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA6ActionPerformed(evt);
            }
        });

        btnCalcularIVA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_46632 (2).png"))); // NOI18N
        btnCalcularIVA3.setText("Ingresos");
        btnCalcularIVA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA3ActionPerformed(evt);
            }
        });

        btnFactCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactCompraICO.png"))); // NOI18N
        btnFactCompras.setText("Facturas Compras");
        btnFactCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactComprasActionPerformed(evt);
            }
        });

        btnFactVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactVentaICO.png"))); // NOI18N
        btnFactVentas.setText("Facturas Ventas");
        btnFactVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFactVentas)
                        .addGap(19, 19, 19)
                        .addComponent(btnFactCompras)
                        .addGap(5, 5, 5)
                        .addComponent(btnCalcularIVA3)
                        .addGap(41, 41, 41)
                        .addComponent(btnCalcularIVA6)
                        .addGap(19, 19, 19)
                        .addComponent(btnCalcularIVA7)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFactVentas)
                    .addComponent(btnFactCompras)
                    .addComponent(btnCalcularIVA3)
                    .addComponent(btnCalcularIVA6)
                    .addComponent(btnCalcularIVA7)
                    .addComponent(btnSalir))
                .addGap(7, 7, 7)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    if (txtId.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Ingrese el codigo del Ingreso que desea eliminar");

    } else {
        conexion cc = new conexion();
        Connection cn = (Connection) cc.conexion();

        String sql = "";

        int n = 0;
        try {
            sql = "delete from Ingresos where codigoIngreso= " + txtId.getText() + ";";
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
            n = psd.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Ingreso Eliminado");
                this.setVisible(false);
                Ingresos a = new Ingresos();
                a.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingreso no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}//GEN-LAST:event_btnBorrarActionPerformed
private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if (camposLlenos()) {
        mesDB();
        sld = Math.rint((Double.parseDouble(this.txtSueldo.getText())) * 100) / 100;
    iessV = Math.rint((Double.parseDouble(this.txtIESS.getText())) * 100) / 100;
    impRen = Math.rint((Double.parseDouble(this.txtImpRenta.getText())) * 100) / 100;
    tot = sld + iessV + impRen;
        conexion cc = new conexion();
        Connection cn = (Connection) cc.conexion();
        String sql = "";
        int n = 0;
        try {
            sql = "update Ingresos set codigoIngreso='" + txtId.getText() + "', año=" + String.valueOf(this.comboAño.getSelectedItem()) + ","
                    + "mes=" + mes + ", sueldo=" + sld + ", "
                    + " aporteIESS=" + iessV + ", impuestoRenta=" + impRen + " where codigoIngreso='" + txtId.getText() + "'; ";
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
            n = psd.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Ingreso Actualizado");
                limpiarCampos();
                llenarTable();
            } else {
                JOptionPane.showMessageDialog(null, "IngresoNO Actualizado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Llene todos los campos");
    }
}//GEN-LAST:event_btnModificarActionPerformed
private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    if (txtId.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Ingrese el codigo del Ingreso que desea buscar");

    } else {
        conexion cc = new conexion();
        Connection cn = (Connection) cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = (Statement) cn.createStatement();
            rs = stmt.executeQuery("select * from Ingresos where codigoIngreso='" + txtId.getText() + "';");
            int i = 0;
            while (rs.next()) {
                txtId.setText(rs.getString("codigoIngreso"));
                this.comboAño.setSelectedItem(rs.getInt("año"));
                mesIn(rs.getString("mes"));
                this.comboMeses.setSelectedItem(mesin);
                txtSueldo.setText(rs.getString("sueldo"));
                txtIESS.setText(rs.getString("aporteIESS"));
                txtImpRenta.setText((rs.getString("impuestoRenta")));
                
                i++;
            }
            if (txtIESS.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No existe la factura");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
}//GEN-LAST:event_btnConsultarActionPerformed
private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    if (camposLlenos()) {
        conexion cc = new conexion();
        Connection cn = (Connection) cc.conexion();
        mesDB();
        sld = Math.rint((Double.parseDouble(this.txtSueldo.getText())) * 100) / 100;
    iessV = Math.rint((Double.parseDouble(this.txtIESS.getText())) * 100) / 100;
    impRen = Math.rint((Double.parseDouble(this.txtImpRenta.getText())) * 100) / 100;
    tot = sld + iessV + impRen;
        String sql = "";

        int n = 0;
        try {
            sql = "insert into Ingresos(codigoIngreso, año, mes, sueldo, aporteIESS, impuestoRenta) "
                    + "values('"
                    + txtId.getText() + "'," + String.valueOf(this.comboAño.getSelectedItem()) + "," + mes + "," + sld + "," + iessV + "," + impRen +");";
            //System.out.print(sql);
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
            n = psd.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registros Guardados");
            } else {
                JOptionPane.showMessageDialog(null, "Registros no Guardados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        llenarTable();
        limpiarCampos();
    } else {
        JOptionPane.showMessageDialog(null, "Llenar todos los campos");
    }
}//GEN-LAST:event_btnAgregarActionPerformed
    double sld, iessV, impRen, tot;
private void txtSueldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyPressed
// TODO add your handling code here:
    sld = Math.rint((Double.parseDouble(this.txtSueldo.getText())) * 100) / 100;
    iessV = Math.rint((Double.parseDouble(this.txtIESS.getText())) * 100) / 100;
    impRen = Math.rint((Double.parseDouble(this.txtImpRenta.getText())) * 100) / 100;
    tot = sld + iessV + impRen;

    this.txtTotal.setText(String.valueOf(tot));
}//GEN-LAST:event_txtSueldoKeyPressed

private void txtIESSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIESSKeyPressed
// TODO add your handling code here:
    sld = Math.rint((Double.parseDouble(this.txtSueldo.getText())) * 100) / 100;
    iessV = Math.rint((Double.parseDouble(this.txtIESS.getText())) * 100) / 100;
    impRen = Math.rint((Double.parseDouble(this.txtImpRenta.getText())) * 100) / 100;
    tot = sld + iessV + impRen;

    this.txtTotal.setText(String.valueOf(tot));
}//GEN-LAST:event_txtIESSKeyPressed

private void txtImpRentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpRentaKeyPressed
// TODO add your handling code here:
    sld = Math.rint((Double.parseDouble(this.txtSueldo.getText())) * 100) / 100;
    iessV = Math.rint((Double.parseDouble(this.txtIESS.getText())) * 100) / 100;
    impRen = Math.rint((Double.parseDouble(this.txtImpRenta.getText())) * 100) / 100;
    tot = sld + iessV + impRen;
    this.txtTotal.setText(String.valueOf(tot));
}//GEN-LAST:event_txtImpRentaKeyPressed

    private void btnCalcularIVA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CalculoImpuestoRenta a = new CalculoImpuestoRenta();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA7ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalcularIVA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA6ActionPerformed
        this.setVisible(false);
        CalculoIva a = new CalculoIva();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA6ActionPerformed

    private void btnCalcularIVA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ingresos a = new Ingresos();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA3ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcularIVA3;
    private javax.swing.JButton btnCalcularIVA6;
    private javax.swing.JButton btnCalcularIVA7;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFactCompras;
    private javax.swing.JButton btnFactVentas;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboAño;
    private javax.swing.JComboBox comboMeses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbnCon;
    private javax.swing.JTextField txtIESS;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImpRenta;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
