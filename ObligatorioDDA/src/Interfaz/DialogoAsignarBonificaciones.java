package Interfaz;

import Controlador.ControladorAsignarBonificaciones;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogoAsignarBonificaciones extends javax.swing.JDialog implements VistaAsignarBonificaciones {

    private ControladorAsignarBonificaciones controlador;

    public DialogoAsignarBonificaciones(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorAsignarBonificaciones(this, usuarioAdmin);
        inicializar();

    }

    private void inicializar() {
        this.setTitle("Asignar Bonificaciones");
        controlador.listarBonificaciones();
        controlador.listarPuestos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tCedula1 = new javax.swing.JTextField();
        lBonificaciones = new javax.swing.JLabel();
        lPuestos = new javax.swing.JLabel();
        lCedula = new javax.swing.JLabel();
        cBonificaciones = new javax.swing.JComboBox<>();
        cPuestos = new javax.swing.JComboBox<>();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBonificacionPuesto = new javax.swing.JTable();
        bAsignar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        lPropietario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tCedula = new javax.swing.JTextField();

        tCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCedula1ActionPerformed(evt);
            }
        });

        setTitle("Asignar bonificaciones");

        lBonificaciones.setText("Bonificaciones:");

        lPuestos.setText("Puestos:");

        lCedula.setText("Cédula:");

        cBonificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBonificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBonificacionesActionPerformed(evt);
            }
        });

        cPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPuestosActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tablaBonificacionPuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bonificación", "Puesto"
            }
        ));
        jScrollPane1.setViewportView(tablaBonificacionPuesto);

        bAsignar.setText("Asignar");
        bAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAsignarActionPerformed(evt);
            }
        });

        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(bAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lBonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cBonificaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBonificaciones)
                    .addComponent(cBonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPuestos))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar)
                    .addComponent(lCedula)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAsignar))
                .addGap(18, 18, 18)
                .addComponent(bCerrar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCedula1ActionPerformed
    }//GEN-LAST:event_tCedula1ActionPerformed

    private void cPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPuestosActionPerformed

    private void cBonificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBonificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBonificacionesActionPerformed

    private void bAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAsignarActionPerformed
        asignarBonificacion();
    }//GEN-LAST:event_bAsignarActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_bBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAsignar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JComboBox<String> cBonificaciones;
    private javax.swing.JComboBox<String> cPuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBonificaciones;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lPropietario;
    private javax.swing.JLabel lPuestos;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCedula1;
    private javax.swing.JTable tablaBonificacionPuesto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void listarBonificaciones(List<Bonificacion> bonificaciones) {
        DefaultComboBoxModel listaDefault = new DefaultComboBoxModel();
        cBonificaciones.setModel(listaDefault);
        listaDefault.addElement("Elija una opción");

        for (Bonificacion b : bonificaciones) {
            listaDefault.addElement(b.getNombre());
        }

    }

    @Override
    public void listarPuestos(List<Puesto> puestos) {
        DefaultComboBoxModel listaDefault = new DefaultComboBoxModel();
        cPuestos.setModel(listaDefault);
        listaDefault.addElement("Elija una opción");

        for (Puesto p : puestos) {
            listaDefault.addElement(p.getNombre());
        }

    }

    @Override
    public void mostrarBonificaciones(List<Propietario> propietarios) {

        Propietario propietarioSeleccionado = propietarios.get(0);
        lPropietario.setText("Propietario: " + propietarioSeleccionado.getNombre());

        DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Bonificación", "Puesto"}, 0);
        tablaBonificacionPuesto.setModel(modeloTabla);

        for (Bonificacion bonificacion : propietarioSeleccionado.getBonificaciones()) {
            modeloTabla.addRow(new Object[]{bonificacion.getNombre(), bonificacion.getPuesto().getNombre()});
        }
    }

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
    public void buscar() {
        String cedula = tCedula.getText();
        controlador.buscarPropietario(cedula);
    }

    @Override
    public void asignarBonificacion() {

        Propietario propietarioSeleccionado = controlador.getPropietarioPorCedula(tCedula.getText());

        if (propietarioSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún propietario", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Bonificacion bonificacionSeleccionada = (Bonificacion) cBonificaciones.getSelectedItem();
        Puesto puestoSeleccionado = (Puesto) cPuestos.getSelectedItem();

        if (bonificacionSeleccionada == null || puestoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Debe especificar una bonificación y un puesto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (propietarioSeleccionado.tieneBonificacionAsignada(puestoSeleccionado)) {
            JOptionPane.showMessageDialog(this, "El propietario ya tiene una bonificación asignada para ese puesto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        controlador.asignarBonificacion(propietarioSeleccionado, bonificacionSeleccionada, puestoSeleccionado);
    }

}
