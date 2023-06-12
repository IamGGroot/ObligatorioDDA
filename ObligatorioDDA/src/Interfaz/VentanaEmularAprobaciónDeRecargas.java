package Interfaz;

import Controlador.ControladorEmularAprobacionRecarga;
import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Recarga;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaEmularAprobaciónDeRecargas extends javax.swing.JFrame implements VistaEmularAprobacionRecarga {

    private ControladorEmularAprobacionRecarga controlador;

    public VentanaEmularAprobaciónDeRecargas(Administrador usuarioAdmin) {
        initComponents();
        this.controlador = new ControladorEmularAprobacionRecarga(this, usuarioAdmin);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lRecargasPendientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecargas = new javax.swing.JTable();
        bAprobar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();

        setTitle("Aprobación de recargas");

        lRecargasPendientes.setText("Recargas pendientes:");

        tablaRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Propietario", "Monto"
            }
        ));
        tablaRecargas.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tablaRecargas);

        bAprobar.setText("Aprobar");
        bAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprobarActionPerformed(evt);
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lRecargasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(bAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bAprobar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lRecargasPendientes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(bCerrar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAprobarActionPerformed
        this.aprobarRecarga();
        // TODO add your handling code here:
    }//GEN-LAST:event_bAprobarActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.cerrar();        // TODO add your handling code here:
    }//GEN-LAST:event_bCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAprobar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lRecargasPendientes;
    private javax.swing.JTable tablaRecargas;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        controlador.listarListarRecargasPendientes();
    }

    @Override
    public void mostrarRecargas(List<Propietario> propietariosConRecargasPendientes) {
        DefaultTableModel modeloDefault = crearTabla();
        tablaRecargas.setModel(modeloDefault);
        llenarTabla(modeloDefault, propietariosConRecargasPendientes);
        renderCustomTablaRecargas();
    }

    public void aprobarRecarga() {
        int selectedRow = tablaRecargas.getSelectedRow();
        if (selectedRow != -1) {
            Propietario propietario = (Propietario) tablaRecargas.getValueAt(selectedRow, 1);
            Recarga recarga = (Recarga) tablaRecargas.getValueAt(selectedRow, 2);
            controlador.aprobarRecarga(recarga, propietario);
        }
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        dispose();
    }
    
    private void cerrar(){
    controlador.cerrar();
    }

    private DefaultTableModel crearTabla() {
        DefaultTableModel modeloDefault = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0 || columnIndex == 2) {
                    return Recarga.class;
                } else {
                    return Propietario.class;
                }
            }
        };
        modeloDefault.addColumn("Fecha");
        modeloDefault.addColumn("Propietario");
        modeloDefault.addColumn("Monto");

        return modeloDefault;
    }

    private void llenarTabla(DefaultTableModel modeloDefault, List<Propietario> propietariosConRecargasPendientes) {
        for (int i = 0; i < propietariosConRecargasPendientes.size(); i++) {
            Propietario p = propietariosConRecargasPendientes.get(i);
            for (Recarga r : p.getCuenta().getRecargasPendientes()) {
                modeloDefault.addRow(new Object[]{r, p, r});
            }
        }
    }

    private void renderCustomTablaRecargas() {
        tablaRecargas.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                Date fecha = ((Recarga) value).getFechaYHora();
                setText(fecha.toString());
            }
        });
        tablaRecargas.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                setText(((Propietario) value).getNombre());
            }
        });
        tablaRecargas.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                Double monto = ((Recarga) value).getMonto();
                setText(monto.toString());
            }
        });

    }
}
