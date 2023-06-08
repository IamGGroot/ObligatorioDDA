package Interfaz;

import Controlador.ControladorEmularAprobacionRecarga;
import Dominio.Administrador;
import javax.swing.JOptionPane;

public class DialogoAsignarBonificaciones extends javax.swing.JDialog //implements vistaAsignarBonificaciones 
{

    private ControladorEmularAprobacionRecarga controlador;

    public DialogoAsignarBonificaciones(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
//        controlador = new ControladorEmularAprobacionRecarga(this, usuarioAdmin);
        inicializar();

    }

    private void inicializar() {
        this.setTitle("ASignar Bonificaciones");
        controlador.listarBonificaciones();
//        controlador.listarPuestos();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tCedula1 = new javax.swing.JTextField();
        lBonificaciones = new javax.swing.JLabel();
        lPuestos = new javax.swing.JLabel();
        lCedula = new javax.swing.JLabel();
        comboBonificaciones = new javax.swing.JComboBox<>();
        comboPuestos = new javax.swing.JComboBox<>();
        tPropietario = new javax.swing.JTextField();
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

        comboBonificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBonificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBonificacionesActionPerformed(evt);
            }
        });

        comboPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuestosActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");

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

        lPropietario.setText("Propietario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBonificaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBonificaciones)
                    .addComponent(comboBonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPuestos))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar)
                    .addComponent(lCedula)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPropietario)
                    .addComponent(tPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAsignar))
                .addGap(18, 18, 18)
                .addComponent(bCerrar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCedula1ActionPerformed
    }//GEN-LAST:event_tCedula1ActionPerformed

    private void comboPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuestosActionPerformed

    private void comboBonificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBonificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBonificacionesActionPerformed

    private void bAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAsignarActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
//        this.cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAsignar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JComboBox<String> comboBonificaciones;
    private javax.swing.JComboBox<String> comboPuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBonificaciones;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lPropietario;
    private javax.swing.JLabel lPuestos;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCedula1;
    private javax.swing.JTextField tPropietario;
    private javax.swing.JTable tablaBonificacionPuesto;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void cerrar() {
////        controlador.cerrar();
//    }
//
//    @Override
//    public boolean confirmar(String mensaje, String title) {
//        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
//    }
//
//    @Override
//    public void salir() {
//        dispose();
//
//    }
}
