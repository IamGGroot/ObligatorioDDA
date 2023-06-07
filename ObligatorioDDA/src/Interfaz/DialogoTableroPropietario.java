package Interfaz;

import Controlador.ControladorTableroPropietario;
import Dominio.Bonificacion;
import Dominio.Notificacion;
import Dominio.Propietario;
import Dominio.Recarga;
import Dominio.Transito;
import Dominio.Vehiculo;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DialogoTableroPropietario extends javax.swing.JDialog implements VistaTableroPropietario {

    private ControladorTableroPropietario controlador;

    public DialogoTableroPropietario(java.awt.Frame parent, boolean modal, Propietario propietario) {
        super(parent, modal);
        initComponents();
        this.controlador = new ControladorTableroPropietario(this, propietario);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotificaciones = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        nVehiculos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        nNotificaciones = new javax.swing.JTextArea();
        fRecarga = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        nBonificaciones = new javax.swing.JTextArea();
        fVehiculo = new javax.swing.JLabel();
        fBonificacion = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        nTransitos = new javax.swing.JTextArea();
        fTransito = new javax.swing.JLabel();
        fSaldoCuenta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tNombreUsuario = new javax.swing.JTextArea();
        fNotificacion = new javax.swing.JLabel();
        fUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaRecargas = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        nSaldoCuenta = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTransitos = new javax.swing.JTable();
        bBorrar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaBonificaciones = new javax.swing.JTable();
        bCerrar = new javax.swing.JButton();
        bRecargar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        nRecargas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaNotificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Mensaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaNotificaciones);

        nVehiculos.setEditable(false);
        nVehiculos.setColumns(1);
        nVehiculos.setRows(1);
        nVehiculos.setAutoscrolls(false);
        nVehiculos.setDragEnabled(true);
        jScrollPane12.setViewportView(nVehiculos);

        nNotificaciones.setEditable(false);
        nNotificaciones.setColumns(1);
        nNotificaciones.setRows(1);
        jScrollPane7.setViewportView(nNotificaciones);

        fRecarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/recarga.png"))); // NOI18N

        nBonificaciones.setEditable(false);
        nBonificaciones.setColumns(1);
        nBonificaciones.setRows(1);
        jScrollPane8.setViewportView(nBonificaciones);

        fVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/vehiculo.png"))); // NOI18N

        fBonificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/bonificacion.png"))); // NOI18N

        nTransitos.setEditable(false);
        nTransitos.setColumns(1);
        nTransitos.setRows(1);
        jScrollPane9.setViewportView(nTransitos);

        fTransito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/transito.png"))); // NOI18N

        fSaldoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/dinero.png"))); // NOI18N

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Modelo", "Color", "# Tránsitos", "Monto Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaVehiculos);

        tNombreUsuario.setEditable(false);
        tNombreUsuario.setColumns(1);
        tNombreUsuario.setRows(1);
        tNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tNombreUsuario.setOpaque(false);
        jScrollPane10.setViewportView(tNombreUsuario);

        fNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/notificacion.png"))); // NOI18N

        fUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/usuario.png"))); // NOI18N

        tablaRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha recarga", "Monto", "Estado", "Administrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaRecargas);

        nSaldoCuenta.setEditable(false);
        nSaldoCuenta.setColumns(1);
        nSaldoCuenta.setRows(1);
        nSaldoCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nSaldoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nSaldoCuenta.setOpaque(false);
        jScrollPane11.setViewportView(nSaldoCuenta);

        tablaTransitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Puesto", "Matrícula", "Tarifa", "Tarifa (monto)", "Bonific.", "Bonific.(monto)", "Monto pagado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaTransitos);

        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        tablaBonificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre bonificación", "Puesto", "Fecha asignada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaBonificaciones);

        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        bRecargar.setText("Recargar");
        bRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecargarActionPerformed(evt);
            }
        });

        nRecargas.setEditable(false);
        nRecargas.setColumns(1);
        nRecargas.setRows(1);
        jScrollPane6.setViewportView(nRecargas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(fSaldoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(fRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fBonificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fVehiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325)
                                .addComponent(fUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 327, Short.MAX_VALUE))
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fSaldoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fVehiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8)
                            .addComponent(fBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane6)
                            .addComponent(fRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRecargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(fNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bBorrar)))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecargarActionPerformed
        this.recargar();
    }//GEN-LAST:event_bRecargarActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        this.borrarNotificaciones();
    }//GEN-LAST:event_bBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bRecargar;
    private javax.swing.JLabel fBonificacion;
    private javax.swing.JLabel fNotificacion;
    private javax.swing.JLabel fRecarga;
    private javax.swing.JLabel fSaldoCuenta;
    private javax.swing.JLabel fTransito;
    private javax.swing.JLabel fUsuario;
    private javax.swing.JLabel fVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea nBonificaciones;
    private javax.swing.JTextArea nNotificaciones;
    private javax.swing.JTextArea nRecargas;
    private javax.swing.JTextArea nSaldoCuenta;
    private javax.swing.JTextArea nTransitos;
    private javax.swing.JTextArea nVehiculos;
    private javax.swing.JTextArea tNombreUsuario;
    private javax.swing.JTable tablaBonificaciones;
    private javax.swing.JTable tablaNotificaciones;
    private javax.swing.JTable tablaRecargas;
    private javax.swing.JTable tablaTransitos;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        controlador.obtenerNombre();
        controlador.obtenerSaldo();
        controlador.obtenerVehiculos();
        controlador.obtenerBonificaciones();
        controlador.obtenerTransitos();
        controlador.obtenerRecargas();
        controlador.obtenerNotificaciones();
    }

    @Override
    public void mostrarNombrePropietario(String nombre) {
        tNombreUsuario.setText(nombre);
    }

    @Override
    public void mostrarSaldo(double saldo) {
        nSaldoCuenta.setText("$ " + saldo);
    }

    @Override
    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        String[] columnNames = {"Matrícula", "Modelo", "Color", "# Tránsitos", "Monto Total"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, vehiculos.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaVehiculos.setModel(modeloDefault);

        TableModel modeloDatos = tablaVehiculos.getModel();
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            modeloDatos.setValueAt(v.getMatricula(), i, 0);
            modeloDatos.setValueAt(v.getModelo(), i, 1);
            modeloDatos.setValueAt(v.getColor(), i, 2);
            modeloDatos.setValueAt(v.getTransitos().size(), i, 3);
            modeloDatos.setValueAt(v.montoTotalTransitos(), i, 4);
        }
        nVehiculos.setText(vehiculos.size() + "");
    }

    @Override
    public void mostrarBonificaciones(List<Bonificacion> bonificaciones) {
        String[] columnNames = {"Nombre bonificación", "Puesto", "Fecha asignada"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, bonificaciones.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaBonificaciones.setModel(modeloDefault);

        TableModel modeloDatos = tablaBonificaciones.getModel();
        for (int i = 0; i < bonificaciones.size(); i++) {
            Bonificacion b = bonificaciones.get(i);
            modeloDatos.setValueAt(b.getTipoBonificacion().getNombre(), i, 0);
            modeloDatos.setValueAt(b.getPuesto().getNombre(), i, 1);
            modeloDatos.setValueAt(formatDate(b.getFechaAsignada()), i, 2);
        }
        nBonificaciones.setText(bonificaciones.size() + "");
    }

    private String formatDate(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(fecha);
    }

    @Override
    public void mostrarTransitos(List<Transito> transitos) {
        String[] columnNames = {"Puesto", "Matrícula", "Tarifa", "Tarifa (monto)", "Bonific.", "Bonific.(monto)", "Monto pagado", "Fecha"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, transitos.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaTransitos.setModel(modeloDefault);

        TableModel modeloDatos = tablaTransitos.getModel();
        for (int i = 0; i < transitos.size(); i++) {
            Transito t = transitos.get(i);
            Vehiculo v = t.getVehiculo();
            modeloDatos.setValueAt(t.getPuesto().getNombre(), i, 0);
            modeloDatos.setValueAt(t.getVehiculo().getMatricula(), i, 1);
            modeloDatos.setValueAt(t.getPuesto().tarifaParaVehiculo(v).getNombre(), i, 2);
            modeloDatos.setValueAt(t.getPuesto().tarifaParaVehiculo(v).getMonto(), i, 3);
            modeloDatos.setValueAt(t.getBonificacion().getTipoBonificacion().getNombre(), i, 4);
            modeloDatos.setValueAt(t.getBonificacion().calcularBonificacion(), i, 5);
            modeloDatos.setValueAt(t.calcularMonto(v), i, 6);
            modeloDatos.setValueAt(formatDate(t.getFechaYHora()), i, 7);
        }
        nTransitos.setText(transitos.size() + "");
    }

    @Override
    public void mostrarRecargas(List<Recarga> recargas) {
        String[] columnNames = {"Fecha recarga", "Monto", "Estado", "Administrador"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, recargas.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaRecargas.setModel(modeloDefault);

        TableModel modeloDatos = tablaRecargas.getModel();
        for (int i = 0; i < recargas.size(); i++) {
            Recarga r = recargas.get(i);
            modeloDatos.setValueAt(formatDate(r.getFechaYHora()), i, 0);
            modeloDatos.setValueAt(r.getMonto(), i, 1);
            modeloDatos.setValueAt(r.getEstado(), i, 2);
            modeloDatos.setValueAt(r.getAdministrador().getNombre(), i, 3);
        }
        nRecargas.setText(recargas.size() + "");
    }

    @Override
    public void mostrarNotificaciones(List<Notificacion> notificaciones) {
        String[] columnNames = {"Fecha", "Mensaje"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, notificaciones.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaNotificaciones.setModel(modeloDefault);

        TableModel modeloDatos = tablaNotificaciones.getModel();
        for (int i = 0; i < notificaciones.size(); i++) {
            Notificacion n = notificaciones.get(i);
            modeloDatos.setValueAt(formatDate(n.getFechaYHora()), i, 0);
            modeloDatos.setValueAt(n.getMensaje(), i, 1);
        }
        nNotificaciones.setText(notificaciones.size() + "");
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        dispose();
    }

    private void cerrar() {
        controlador.cerrar();
    }

    private void recargar() {
        controlador.recargar();
    }

    private void borrarNotificaciones() {
        controlador.borrarNotificaciones();
    }
}
