package Interfaz;

import Controlador.ControladorEmularTransito;
import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Categoria;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Renderizable;
import Dominio.Tarifa;
import Dominio.Vehiculo;
import Servicios.FachadaServicios;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DialogoEmularTransito extends javax.swing.JDialog implements VistaEmularTransito {

    private ControladorEmularTransito controlador;

    public DialogoEmularTransito(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorEmularTransito(this, usuarioAdmin);
        cPuestos.setRenderer(new Detalle());
        inicializar();
    }

    private void inicializar() {
        this.setTitle("Emular transitos");
        controlador.listarPuestos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lPuestos = new javax.swing.JLabel();
        lTarifas = new javax.swing.JLabel();
        lMatricula = new javax.swing.JLabel();
        bCerrar = new javax.swing.JButton();
        tMatricula = new javax.swing.JTextField();
        bRegistrar = new javax.swing.JButton();
        cPuestos = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTarifas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lPuestos.setText("Puestos:");

        lTarifas.setText("Tarifas:");

        lMatricula.setText("Ingrese matricula:");

        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        bRegistrar.setText("Registrar");
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });

        cPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPuestosActionPerformed(evt);
            }
        });

        tTarifas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tTarifas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMatricula)
                    .addComponent(lPuestos)
                    .addComponent(lTarifas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tMatricula)
                            .addComponent(bCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(bRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPuestos)
                            .addComponent(cPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lTarifas)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistrar))
                .addGap(18, 18, 18)
                .addComponent(bCerrar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void cPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPuestosActionPerformed
        this.mostrarTarifas();
    }//GEN-LAST:event_cPuestosActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        this.registrar();
    }//GEN-LAST:event_bRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JComboBox cPuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMatricula;
    private javax.swing.JLabel lPuestos;
    private javax.swing.JLabel lTarifas;
    private javax.swing.JTextField tMatricula;
    private javax.swing.JTable tTarifas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cerrar() {
        controlador.cerrar();
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        dispose();
    }

    @Override
    public void listarPuestos(List<Puesto> puestos) {

   
        for (Puesto p : puestos) {
            cPuestos.addItem(p);
        }

    }

    public void mostrarTarifas() {

        Puesto selectedPuesto = (Puesto) cPuestos.getSelectedItem();

        if (!selectedPuesto.equals("Elija una opción")) {

            List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();

            List<Tarifa> tarifas = selectedPuesto.getTarifas();

            DefaultTableModel modeloDefault = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            modeloDefault.addColumn("Categoría");
            modeloDefault.addColumn("Monto");
            tTarifas.setModel(modeloDefault);

            for (int i = 0; i < tarifas.size(); i++) {
                Tarifa t = tarifas.get(i);
                modeloDefault.addRow(new Object[]{t, t});

            }
            renderCustomTablaTarifas();
        }
    }

    private void registrar() {
        String matricula = tMatricula.getText();

        //falta hacer excepciones
        if (matricula.isEmpty()) {
            mostrarMensaje("Ingrese la matrícula del vehículo");
            return;
        }

        Puesto selectedPuesto = (Puesto) cPuestos.getSelectedItem();

        if (selectedPuesto.equals("Elija una opción")) {
            mostrarMensaje("Debe elegir una opción");
            return;
        }

        Date fechaHoraActual = new Date();

        Vehiculo vehiculo = controlador.obtenerVehiculoPorMatricula(matricula);

        if (vehiculo == null) {
            mostrarMensaje("No existe el vehículo");
            return;
        }
        Propietario propietario = vehiculo.getPropietario();

        double costoTransito = controlador.calcularCostoTransito(vehiculo, selectedPuesto);
        if (costoTransito == -1) {
            mostrarMensaje("No se encontró una tarifa para la categoría del vehículo con la matrícula indicada");
            return;
        }

        Bonificacion bonificacion = controlador.obtenerBonificacion(propietario, selectedPuesto);

        if (bonificacion != null) {
            costoTransito = costoTransito * bonificacion.calcularBonificacion() / 100;
        }

        double saldoPropietario = controlador.getSaldoCuentaPropietario(propietario);

        if (costoTransito > saldoPropietario) {
            mostrarMensaje("El saldo del propietario es insuficiente. Efectúe una recarga para poder realizar el tránsito.");
            return;
        }

        controlador.registrarTransito(fechaHoraActual, bonificacion, selectedPuesto, vehiculo, costoTransito);

        saldoPropietario = controlador.getSaldoCuentaPropietario(propietario);

        mostrarMensaje(
                "Propietario: " + propietario.getNombre() + "\n"
                + "Categoría: " + vehiculo.getCategoria().getNombre() + "\n"
                + "Bonificación: " + bonificacion.getNombre() + "\n"
                + "Costo Tránsito: " + costoTransito + "\n"
                + "Saldo Actual: " + saldoPropietario
        );

        String notificacion = "Pasaste por el puesto " + selectedPuesto.getNombre() + " con el vehículo " + vehiculo.getMatricula();
        controlador.registrarNotificacion(notificacion, fechaHoraActual, propietario);

        if (saldoPropietario < propietario.getSaldoMinimo()) {
            String notificacionSaldo = "Tu saldo actual es de $" + saldoPropietario + " Te recomendamos hacer una recarga";
            controlador.registrarNotificacion(notificacionSaldo, fechaHoraActual, propietario);
        }

    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
    }

    private class Detalle implements ListCellRenderer<Renderizable> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Renderizable> list, Renderizable value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = new JLabel();
            label.setText(value.getRenderDetail());
            return label;
        }

    }

    private void renderCustomTablaTarifas() {
        tTarifas.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                String cat = ((Tarifa) value).getCategoria().getNombre();
                setText(cat);
            }
        });
        tTarifas.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                Double monto = ((Tarifa) value).getMonto();
                setText(Double.toString(monto));

            }
        });

    }
}
