package com.sri.interfaces.iva;

import com.mysql.jdbc.PreparedStatement;
import com.sri.clases.FacturaCompra;
import com.sri.clases.ListFacturasCompras;
import com.sri.clases.Metodos;
import com.sri.clases.ValidarIdentificacion;
import com.sri.clases.conexion;
import java.sql.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class IngresarFacturasCompra extends javax.swing.JFrame {

    public IngresarFacturasCompra() {
        initComponents();
        llenarTable();
        this.setLocationRelativeTo(null);
        String[] tipoGastos = {"Salud", "Alimentación", "Vestuario",};
        this.comboTipoGastos.addItem("Salud");
        this.comboTipoGastos.addItem("Alimentación");
        this.comboTipoGastos.addItem("Vestimenta");
        this.comboTipoGastos.addItem("Vivienda");
        this.comboTipoGastos.addItem("Educación");
        this.comboTipoGastos.addItem("Negocio");
        this.txtFech.setMaxSelectableDate(new Date(2014, 05, 25));
    }

    void limpiarCampos() {
        this.txtIva.setText("");
        this.txtNumFact.setText("");
        this.txtRuc.setText("");
        this.txtProv.setText("");
        this.txtTotal.setText("");
        this.txtSubTotal.setText("");
        this.txtFech.setCalendar(null);
//this.btnAgregar

    }

    void bloquear() {
        this.txtIva.setEnabled(false);
        //this.txtNumFact.setEnabled(false);
        this.txtRuc.setEnabled(false);
        this.txtProv.setEnabled(false);
        this.txtTotal.setEnabled(false);
        this.txtSubTotal.setEnabled(false);
        //this.btnBorrar.setEnabled(false);
    }

    public boolean camposLlenos() {

        if (this.txtNumFact.getText().equals("")) {
            return false;
        } else {
            if (this.txtRuc.getText().equals("")) {
                return false;
            } else {
                if (this.txtProv.getText().equals("")) {
                    return false;
                } else {
                    if (this.txtTotal.getText().equals("")) {
                        return false;
                    } else {

                        if (this.txtFech.equals("")) {
                            return false;
                        } else {
                            if (rdCero.isSelected() == false & rdDoce.isSelected() == false) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    void desbloquear() {
        this.txtIva.setEnabled(true);
        //this.txtNumFact.setEnabled(false);
        this.txtRuc.setEnabled(true);
        this.txtProv.setEnabled(true);
        this.txtTotal.setEnabled(true);
        this.txtSubTotal.setEnabled(true);
        //this.btnBorrar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtSubTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProv = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFech = new com.toedter.calendar.JDateChooser();
        txtNumFact = new javax.swing.JTextField();
        comboTipoGastos = new javax.swing.JComboBox();
        btnBorrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnCon = new javax.swing.JTable();
        rdDoce = new javax.swing.JRadioButton();
        cmbTipFact = new javax.swing.JComboBox();
        rdCero = new javax.swing.JRadioButton();
        checkLibre = new javax.swing.JCheckBox();
        btnFactVentas = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnCalcularIVA3 = new javax.swing.JButton();
        btnCalcularIVA6 = new javax.swing.JButton();
        btnCalcularIVA7 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código de factura");

        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalKeyPressed(evt);
            }
        });

        jLabel2.setText("Precio Total");

        jLabel3.setText("IVA");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("Subtotal");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Facturas de Compras (Adquisiciones)");

        jLabel9.setText("RUC");

        jLabel10.setText("Proveedor");

        jLabel11.setText("Fecha");

        txtFech.setDateFormatString("yyyy-MM-dd");

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo de Gasto");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualozar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tbnCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número Factura", "RUC", "Proveedor", "Fecha", "Tipo de Gasto", "Tarifa", "Tipo de factura", "SubTotal", "IVA", "Valor", "Libre ejercicio profesional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbnCon);

        rdDoce.setText("Gravadas tarifa 12%");
        rdDoce.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdDoceselectedRdDoce(evt);
            }
        });

        cmbTipFact.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Factura" }));

        rdCero.setText("Gravadas tarifa 0%");
        rdCero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdCeroselectedRdCero(evt);
            }
        });

        checkLibre.setText("Libre ejercicio profesional");

        btnFactVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactVentaICO.png"))); // NOI18N
        btnFactVentas.setText("Facturas Ventas");
        btnFactVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactVentasActionPerformed(evt);
            }
        });

        btnFactCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FactCompraICO.png"))); // NOI18N
        btnFactCompras.setText("Facturas Compras");
        btnFactCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactComprasActionPerformed(evt);
            }
        });

        btnCalcularIVA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_46632 (2).png"))); // NOI18N
        btnCalcularIVA3.setText("Ingresos");
        btnCalcularIVA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA3ActionPerformed(evt);
            }
        });

        btnCalcularIVA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flaticon_562 (1).png"))); // NOI18N
        btnCalcularIVA6.setText("IVA");
        btnCalcularIVA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIVA6ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdCero)
                                .addGap(38, 38, 38)
                                .addComponent(rdDoce)
                                .addGap(6, 6, 6)
                                .addComponent(cmbTipFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnConsultar)
                                        .addGap(50, 50, 50)
                                        .addComponent(btnModificar)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnBorrar))
                                    .addComponent(checkLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(328, 328, 328))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(btnSalir)
                        .addGap(0, 24, Short.MAX_VALUE))))
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
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(txtNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdCero)
                    .addComponent(rdDoce)
                    .addComponent(cmbTipFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5))
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTable() {
        tbnCon.removeAll();
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        String dat;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select * from FacturasCompras order by tarifa;");
            int i = 0;
            while (rs.next()) {
                tbnCon.setValueAt(rs.getString("codigoFactCompra"), i, 0);
                //JOptionPane.showMessageDialog(null, rs.getString("codigoFactCompra"));
                tbnCon.setValueAt(rs.getString("codProveedor"), i, 1);
                tbnCon.setValueAt(rs.getString("nombreProveedor"), i, 2);
                tbnCon.setValueAt(rs.getString("fechaFactCompra"), i, 3);
                tbnCon.setValueAt(rs.getString("tipoGastoFactCompra"), i, 4);
                tbnCon.setValueAt(rs.getString("tarifa"), i, 5);
                tipoFacturaIN(rs.getInt("tipoFact"));
                tbnCon.setValueAt(tipFactuIN, i, 6);
                tbnCon.setValueAt(rs.getString("subtotal"), i, 7);
                tbnCon.setValueAt(rs.getString("ivaFactCompra"), i, 8);
                tbnCon.setValueAt(rs.getString("valorFactCompra"), i, 9);
                if(rs.getInt("libre")==0)
                    tbnCon.setValueAt("NO", i, 9);
                else
                    tbnCon.setValueAt("SI", i, 9);
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        /*int i = 0;
        
        for (FacturaCompra f : l.getT()) {
        tbnCon.setValueAt(f.getNumFactura(), i, 0);
        tbnCon.setValueAt(f.getCodProvee(), i, 1);
        tbnCon.setValueAt(f.getNomProvee(), i, 2);
        tbnCon.setValueAt(f.getFecha(), i, 3);
        tbnCon.setValueAt(f.getSubtotal(), i, 4);
        tbnCon.setValueAt(f.getIva(), i, 5);
        tbnCon.setValueAt(f.getTotal(), i, 6);
        tbnCon.setValueAt(f.getTipoGasto(), i, 7);
        i++;*/
        //}
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (camposLlenos()) {
            try {
                ValidarIdentificacion a = new ValidarIdentificacion();
                boolean a1 = a.validarRucPersonaNatural(this.txtRuc.getText());
                boolean a2 = a.validarRucSociedadPrivada(this.txtRuc.getText());
                if (a1 | a2) {
                    tot = Math.rint((Double.parseDouble(this.txtTotal.getText())) * 100) / 100;
                    /*iva = Math.rint((tot * 0.12) * 100) / 100;
                    subt = tot - iva;*/
                    tipoFacturaDB();
                    int mes = this.txtFech.getCalendar().get(Calendar.MONTH) + 1;
                    String fech = "" + this.txtFech.getCalendar().get(Calendar.YEAR) + "-" + mes + "-" + this.txtFech.getCalendar().get(Calendar.DAY_OF_MONTH);
                    int tarifa = 0;
                    if (rdCero.isSelected()) {
                        tarifa = 0;
                    }
                    if (rdDoce.isSelected()) {
                        tarifa = 12;
                    }
                    int libre;
                    if(checkLibre.isSelected()){
                        libre=1;
                    }else{
                        libre=0;
                    }
                    conexion cc = new conexion();
                    Connection cn = cc.conexion();

                    String sql = "";

                    int n = 0;
                    try {
                        sql = "insert into FacturasCompras(codigoFactCompra, codProveedor, nombreProveedor, fechaFactCompra, tipoGastoFactCompra, tarifa, tipoFact, subtotal, valorFactCompra, ivaFactCompra, libre) "
                                + "values("
                                + txtNumFact.getText() + ",'" + txtRuc.getText() + "','" + txtProv.getText() + "','" + fech + "','" + String.valueOf(this.comboTipoGastos.getSelectedItem()) + "'," + tarifa + ",'" + tipFactu + "'," + subt + "," + tot + "," + iva + ","+libre+");";
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
                    JOptionPane.showMessageDialog(null, "Ruc Ingresado Incorrecto");
                }
            } catch (Exception ex) {
                Logger.getLogger(IngresarFacturasCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyPressed
        // TODO add your handling code here:
        if (rdDoce.isSelected()) {
            tot = Math.rint((Double.parseDouble(this.txtTotal.getText())) * 100) / 100;
            iva = Math.rint((tot * 0.12) * 100) / 100;
            subt = tot - iva;
            this.txtIva.setText(String.valueOf(iva));

            this.txtSubTotal.setText(String.valueOf(subt));

        } else {
            if (rdCero.isSelected()) {
                this.txtIva.setText(String.valueOf(iva));

                this.txtSubTotal.setText(String.valueOf(subt));
            } else {
                JOptionPane.showMessageDialog(null, "Escoja la tarifa");
                txtTotal.setText("");
            }
        }
    }//GEN-LAST:event_txtTotalKeyPressed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (txtNumFact.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la factura que desea eliminar");

        } else {
            conexion cc = new conexion();
            Connection cn = cc.conexion();

            String sql = "";

            int n = 0;
            try {
                sql = "delete from FacturasCompras where codigoFactCompra= " + txtNumFact.getText() + ";";
                //JOptionPane.showMessageDialog(null, sql);
                PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
                n = psd.executeUpdate(sql);
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Factura Eliminada");
                    llenarTable();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Factura no existe");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
// TODO add your handling code here:
    if (txtNumFact.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Ingrese el codigo de la factura que desea buscar");

    } else {
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select * from FacturasCompras where codigoFactCompra=" + txtNumFact.getText() + ";");
            int i = 0;
            while (rs.next()) {
                txtNumFact.setText(rs.getString("codigoFactCompra"));
                txtRuc.setText(rs.getString("codProveedor"));
                txtProv.setText((rs.getString("nombreProveedor")));
                //rs.getString("fechaFactCompra");
                comboTipoGastos.setSelectedItem(rs.getString("tipoGastoFactCompra"));
                if (rs.getString("tarifa").equals("0")) {
                    this.rdCero.setSelected(true);
                } else {
                    this.rdDoce.setSelected(true);
                }
                tipoFacturaIN(rs.getInt("tipoFact"));
                cmbTipFact.setSelectedItem(tipFactuIN);
                txtSubTotal.setText(rs.getString("subtotal"));
                txtIva.setText(rs.getString("ivaFactCompra"));
                txtTotal.setText(rs.getString("valorFactCompra"));
                if(rs.getInt("libre")==0)
                    checkLibre.setSelected(false);
                else
                    checkLibre.setSelected(true);
                i++;
            }
            if (txtRuc.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No existe la factura");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
    /*FacturaCompra a = l.buscarFact(txtNumFact.getText());
    if (a != null) {
    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
    String as = a.getFecha();
    try {
    this.txtFech.setDate(formatoDelTexto.parse(as));
    } catch (ParseException ex) {
    ex.printStackTrace();
    }
    this.txtRuc.setText(a.getCodProvee());
    this.txtProv.setText(a.getNomProvee());
    this.txtIva.setText(String.valueOf(a.getIva()));
    this.txtTotal.setText(String.valueOf(a.getTotal()));
    this.txtSubTotal.setText(String.valueOf(a.getSubtotal()));
    //this.comboTipoGastos.set
    llenarTable();
    } else {
    JOptionPane.showMessageDialog(null, "No existe la factura");
    }*/

}//GEN-LAST:event_btnConsultarActionPerformed

private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if (camposLlenos()) {
        int tarifa = 0;
        if (rdCero.isSelected()) {
            tarifa = 0;
        }
        if (rdDoce.isSelected()) {
            tarifa = 12;
        }
        tipoFacturaDB();
        tot = Math.rint((Double.parseDouble(this.txtTotal.getText())) * 100) / 100;
        int mes = this.txtFech.getCalendar().get(Calendar.MONTH) + 1;
        String fech = "" + this.txtFech.getCalendar().get(Calendar.YEAR) + "-" + mes + "-" + this.txtFech.getCalendar().get(Calendar.DAY_OF_MONTH);
        int libre;
                    if(checkLibre.isSelected()){
                        libre=1;
                    }else{
                        libre=0;
                    }
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        String sql = "";
        int n = 0;
        try {
            sql = "update FacturasCompras set codigoFactCompra=" + txtNumFact.getText() + ", codProveedor='" + txtRuc.getText() + "',"
                    + "nombreProveedor='" + txtProv.getText() + "', fechaFactCompra='" + fech + "', tipoGastoFactCompra='" + String.valueOf(this.comboTipoGastos.getSelectedItem()) + "',"
                    + " tarifa=" + tarifa + ", tipoFact='" + tipFactu + "',"
                    + " subtotal=" + Double.parseDouble(this.txtSubTotal.getText()) + ", valorFactCompra=" + tot + ", ivaFactCompra=" + Double.parseDouble(this.txtIva.getText()) + "libre="+libre+" where codigoFactCompra=" + txtNumFact.getText() + "; ";
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
            n = psd.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Factura Actualizada");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Factura NO Actualizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        llenarTable();

    } else {
        JOptionPane.showMessageDialog(null, "Llene todos los campos");
    }
}//GEN-LAST:event_btnModificarActionPerformed
    int tipFactu;

    private void tipoFacturaDB() {
        if (String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Adquisiciones y pagos (excluye activos fijos con derecho a crédito tributario)")) {
            tipFactu = 1;
        } else {
            if (String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Locales de activos fijos con derecho a crédito tributario")) {
                tipFactu = 2;
            } else {
                if (String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Otras adquisiciones y pagos (Sin derecho a crédito tributario)")) {
                    tipFactu = 3;
                } else {
                    if (String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Adquisiciones y pagos (incluye activos fijos)")) {
                        tipFactu = 4;
                    } else {
                        if (String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Realizadas a contribuyentes RISE")) {
                            tipFactu = 5;
                        } else {
                            JOptionPane.showMessageDialog(null, "Escoja el tipo de factura");
                        }
                    }
                }
            }
        }

    }
    String tipFactuIN;

    private void tipoFacturaIN(int db) {
        if (db == 1) {
            tipFactuIN = "Adquisiciones y pagos (excluye activos fijos con derecho a crédito tributario)";
        } else {
            if (db == 2) {
                tipFactuIN = "Locales de activos fijos con derecho a crédito tributario";
            } else {
                if (db == 3) {
                    tipFactuIN = "Otras adquisiciones y pagos (Sin derecho a crédito tributario)";
                } else {
                    if (db == 4) {
                        tipFactuIN = "Adquisiciones y pagos (incluye activos fijos)";
                    } else {
                        if (db == 5) {
                            tipFactuIN = "Realizadas a contribuyentes RISE";
                        } else {
                            JOptionPane.showMessageDialog(null, "Escoja el tipo de factura");
                        }
                    }
                }
            }
        }
    }
    private void rdDoceselectedRdDoce(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdDoceselectedRdDoce
        // TODO add your handling code here:
        if (this.rdCero.isSelected()) {
            this.rdCero.setSelected(false);
        }
        this.cmbTipFact.removeAllItems();
        this.cmbTipFact.addItem("Adquisiciones y pagos (excluye activos fijos con derecho a crédito tributario)");
        this.cmbTipFact.addItem("Locales de activos fijos con derecho a crédito tributario");
        this.cmbTipFact.addItem("Otras adquisiciones y pagos (Sin derecho a crédito tributario)");

    }//GEN-LAST:event_rdDoceselectedRdDoce
    private void rdCeroselectedRdCero(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdCeroselectedRdCero
        if (this.rdDoce.isSelected()) {
            this.rdDoce.setSelected(false);
        }
        this.cmbTipFact.removeAllItems();
        this.cmbTipFact.addItem("Adquisiciones y pagos (incluye activos fijos)");
        this.cmbTipFact.addItem("Realizadas a contribuyentes RISE");
        subt = 0;
        iva = 0;
        txtIva.setText("" + iva);
        txtSubTotal.setText("" + subt);
    }//GEN-LAST:event_rdCeroselectedRdCero

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

    private void btnCalcularIVA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIVA3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ingresos a = new Ingresos();
        a.setVisible(true);
    }//GEN-LAST:event_btnCalcularIVA3ActionPerformed

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    ListFacturasCompras l = new ListFacturasCompras();
    double tot;
    double iva;
    double subt;
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
    private javax.swing.JCheckBox checkLibre;
    private javax.swing.JComboBox cmbTipFact;
    private javax.swing.JComboBox comboTipoGastos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdCero;
    private javax.swing.JRadioButton rdDoce;
    private javax.swing.JTable tbnCon;
    private com.toedter.calendar.JDateChooser txtFech;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNumFact;
    private javax.swing.JTextField txtProv;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
