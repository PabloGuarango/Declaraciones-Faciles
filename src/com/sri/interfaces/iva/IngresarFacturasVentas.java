package com.sri.interfaces.iva;

import com.mysql.jdbc.PreparedStatement;
import com.sri.clases.FacturaCompra;
import com.sri.clases.FacturaVenta;
import com.sri.clases.ListFacturasVentas;
import com.sri.clases.ValidarIdentificacion;
import com.sri.clases.conexion;
import java.sql.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.text.MaskFormatter;

public class IngresarFacturasVentas extends javax.swing.JFrame {

    public IngresarFacturasVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarjTable();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
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
        btnBorrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnCon1 = new javax.swing.JTable();
        cmbTipFact = new javax.swing.JComboBox();
        rdCero = new javax.swing.JRadioButton();
        rdDoce = new javax.swing.JRadioButton();
        checkLibre = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtIva1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        btnFactVentas = new javax.swing.JButton();
        btnFactCompras = new javax.swing.JButton();
        btnCalcularIVA3 = new javax.swing.JButton();
        btnCalcularIVA6 = new javax.swing.JButton();
        btnCalcularIVA7 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

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
        jLabel5.setText("Facturas de Ventas");

        jLabel9.setText("Cédula de identidad");

        jLabel10.setText("Cliente");

        jLabel11.setText("Fecha");

        txtFech.setDateFormatString("yyyy-MM-dd");

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

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

        tbnCon1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número Factura", "C.I.", "Cliente", "Fecha", "Tarifa", "Tipo de factura", "SubTotal", "IVA", "Total", "Libre Ejercicio Profesional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbnCon1);

        cmbTipFact.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Factura" }));

        rdCero.setText("Gravadas tarifa 0%");
        rdCero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectedRdCero(evt);
            }
        });

        rdDoce.setText("Gravadas tarifa 12%");
        rdDoce.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectedRdDoce(evt);
            }
        });

        checkLibre.setText("Libre ejercicio profesional");

        jLabel6.setText("Retención");

        jLabel8.setText("Retención");

        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel7.setText("%");

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
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(txtNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(588, 588, 588))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                                        .addComponent(jLabel10))))
                                            .addComponent(jLabel5))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel1)))
                                .addGap(242, 242, 242)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdCero)
                                    .addGap(38, 38, 38)
                                    .addComponent(rdDoce)))
                            .addGap(63, 63, 63)
                            .addComponent(cmbTipFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(263, 263, 263))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(btnAgregar)
                            .addGap(36, 36, 36)
                            .addComponent(btnConsultar)
                            .addGap(50, 50, 50)
                            .addComponent(btnModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar)
                            .addGap(159, 159, 159))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtIva1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(171, 171, 171))
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
                .addComponent(btnSalir)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdCero)
                    .addComponent(rdDoce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkLibre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIva1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarjTable() {
        tbnCon1.removeAll();
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        String dat;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select * from FacturasVentas order by tarifa;");
            int i = 0;
            while (rs.next()) {
                tbnCon1.setValueAt(rs.getString("codigoFactVenta"), i, 0);
                //JOptionPane.showMessageDialog(null, rs.getString("codigoFactCompra"));
                tbnCon1.setValueAt(rs.getString("Cliente_codigoCliente"), i, 1);
                tbnCon1.setValueAt(rs.getString("nombreCliente"), i, 2);
                tbnCon1.setValueAt(rs.getString("fechaFactVenta"), i, 3);
                tbnCon1.setValueAt(rs.getString("tarifa"), i, 4);
                tipoFacturaIN(rs.getInt("tipoFact"));
                tbnCon1.setValueAt(tipFactuIN, i, 5);
                tbnCon1.setValueAt(rs.getString("subtotal"), i, 6);
                tbnCon1.setValueAt(rs.getString("ivaFactVenta"), i, 7);
                tbnCon1.setValueAt(rs.getString("valorFactVenta"), i, 8);
                if(rs.getInt("libre")==0)
                    tbnCon1.setValueAt("NO", i, 9);
                else
                    tbnCon1.setValueAt("SI", i, 9);
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
    private boolean camposLlenos(){
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
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (camposLlenos()) {
            try {
                ValidarIdentificacion a = new ValidarIdentificacion();
                boolean a1 = a.validarCedula(this.txtRuc.getText());
                if (a1) {
                    tot = Math.rint((Double.parseDouble(this.txtTotal.getText())) * 100) / 100;
                    /*iva = Math.rint((tot * 0.12) * 100) / 100;
                     subt = tot - iva;*/
                    int mes = this.txtFech.getCalendar().get(Calendar.MONTH) + 1;
                    String fech = "" + this.txtFech.getCalendar().get(Calendar.YEAR) + "-" + mes + "-" + this.txtFech.getCalendar().get(Calendar.DAY_OF_MONTH);
                    int tarifa = 0;
                    tipoFacturaDB();
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
                        sql = "insert into FacturasVentas(codigoFactVenta, Cliente_codigoCliente, nombreCliente, fechaFactVenta, tarifa, tipoFact, subtotal, valorFactVenta, ivaFactVenta, libre) "
                                + "values("
                                + txtNumFact.getText() + ",'" + txtRuc.getText() + "','" + txtProv.getText() + "','" + fech + "'," +tarifa+","+ tipFactu + "," + subt + "," + tot + "," + iva + ","+libre+");";
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
                    llenarjTable();
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
                sql = "delete from FacturasVentas where codigoFactVenta= " + txtNumFact.getText() + ";";
                //JOptionPane.showMessageDialog(null, sql);
                PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
                n = psd.executeUpdate(sql);
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Factura Eliminada");
                    llenarjTable();
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
    if (txtNumFact.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el codigo de la factura que desea buscar");

    } else {
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select * from FacturasVentas where codigoFactVenta=" + txtNumFact.getText() + ";");
            int i = 0;
            while (rs.next()) {
                txtNumFact.setText(rs.getString("codigoFactVenta"));
                txtRuc.setText(rs.getString("Cliente_codigoCliente"));
                txtProv.setText((rs.getString("nombreCliente")));
                //rs.getString("fechaFactVenta");
                //rs.getString("tipoGastoFactCompra"));
                if (rs.getString("tarifa").equals("0")) {
                    this.rdCero.setSelected(true);
                } else {
                    this.rdDoce.setSelected(true);
                }
tipoFacturaIN(rs.getInt("tipoFact"));
                cmbTipFact.setSelectedItem(tipFactuIN);
                //tbnCon.setValueAt(rs.getString("tipoFact"));
                txtSubTotal.setText(rs.getString("subtotal"));
                txtIva.setText(rs.getString("ivaFactVenta"));
                txtTotal.setText(rs.getString("valorFactVenta"));
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
            sql = "update FacturasVentas set codigoFactVenta=" + txtNumFact.getText() + ", Cliente_codigoCliente='" + txtRuc.getText() + "',"
                    + "nombreCliente='" + txtProv.getText() + "', fechaFactVenta='" + fech + "', "
                    + " tarifa=" + tarifa + ", tipoFact='" + tipFactu + "',"
                    + " subtotal=" + Double.parseDouble(this.txtSubTotal.getText()) + ", valorFactVenta=" + tot + ", ivaFactVenta=" + Double.parseDouble(this.txtIva.getText()) + ", libre="+libre+" where codigoFactVenta=" + txtNumFact.getText() + "; ";
            //JOptionPane.showMessageDialog(null, sql);
            PreparedStatement psd = (PreparedStatement) cn.prepareStatement(sql);
            n = psd.executeUpdate(sql);
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Factura Actualizada");
                limpiarCampos();
                        llenarjTable();
            } else {
                JOptionPane.showMessageDialog(null, "Factura NO Actualizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Llene todos los campos");
    }
}//GEN-LAST:event_btnModificarActionPerformed
int tipFactu;
    private void tipoFacturaDB(){
    if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Locales (excluye activos fijos)")){
        tipFactu=1;
    }else{
        if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Activos fijos")){
            tipFactu=2;
        }else{
            if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Locales (excluye activos fijos) que no dan derecho a credito tributario")){
                tipFactu=3;
            }else{
                if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Activos fijos que no dan derecho a credito tributario")){
                    tipFactu=4;
                }else{
                    if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Locales (excluye activos fijos) que dan derecho a credito tributario")){
                        tipFactu=5;
                    }else{
                        if(String.valueOf(this.cmbTipFact.getSelectedItem()).equals("Activos fijos que dan derecho a credito tributario")){
                            tipFactu=6;
                        }else
                            JOptionPane.showMessageDialog(null, "Escoja el tipo de factura");
                    }
                }
            }
        }
    }
}
  String tipFactuIN;
    private void tipoFacturaIN(int db){
    if(db==1){
        tipFactuIN="Locales (excluye activos fijos)";
    }else{
        if(db==2){
            tipFactuIN="Activos fijos";
        }else{
            if(db==3){
                tipFactuIN="Locales (excluye activos fijos) que no dan derecho a credito tributario";
            }else{
                if(db==4){
                    tipFactuIN="Activos fijos que no dan derecho a credito tributario";
                }else{
                    if(db==5){
                        tipFactuIN="Locales (excluye activos fijos) que dan derecho a credito tributario";
                    }else{
                        if(db==6){
                            tipFactuIN="Activos fijos que dan derecho a credito tributario";
                        }else
                            JOptionPane.showMessageDialog(null, "Escoja el tipo de factura");
                    }
                }
            }
        }
    }
}  
    private void selectedRdCero(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectedRdCero
        if (this.rdDoce.isSelected()) {
            this.rdDoce.setSelected(false);
        }
        this.cmbTipFact.removeAllItems();
        this.cmbTipFact.addItem("Locales (excluye activos fijos) que no dan derecho a credito tributario");
        this.cmbTipFact.addItem("Activos fijos que no dan derecho a credito tributario");
        this.cmbTipFact.addItem("Locales (excluye activos fijos) que dan derecho a credito tributario");
        this.cmbTipFact.addItem("Activos fijos que dan derecho a credito tributario");
        subt = 0;
        iva = 0;
        txtIva.setText("" + iva);
        txtSubTotal.setText("" + subt);
    }//GEN-LAST:event_selectedRdCero

    private void selectedRdDoce(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectedRdDoce
        // TODO add your handling code here:
        if (this.rdCero.isSelected()) {
            this.rdCero.setSelected(false);
        }
        this.cmbTipFact.removeAllItems();
        this.cmbTipFact.addItem("Locales (excluye activos fijos)");
        this.cmbTipFact.addItem("Activos fijos");
    }//GEN-LAST:event_selectedRdDoce

private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
// TODO add your handling code here:
    if (rdDoce.isSelected()) {
            tot = Math.rint((Double.parseDouble(this.txtTotal.getText())) * 100) / 100;
            iva = Math.rint((tot * 0.12) * 100) / 100;
            subt =( tot - iva)*2;
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
}//GEN-LAST:event_jSpinner1StateChanged

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

    ListFacturasVentas l = new ListFacturasVentas();
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkLibre;
    private javax.swing.JComboBox cmbTipFact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton rdCero;
    private javax.swing.JRadioButton rdDoce;
    private javax.swing.JTable tbnCon1;
    private com.toedter.calendar.JDateChooser txtFech;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtIva1;
    private javax.swing.JTextField txtNumFact;
    private javax.swing.JTextField txtProv;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
