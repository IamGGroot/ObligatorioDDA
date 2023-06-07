
package Interfaz;

import Dominio.Administrador;
import Dominio.Propietario;
import Dominio.Recarga;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class EmularAprobaciónDeRecargas extends javax.swing.JFrame implements VistaEmularAprobacionRecarga {

    public EmularAprobaciónDeRecargas(Administrador usuarioAdmin) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lRecargasPendientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRecargas = new javax.swing.JTable();
        bAprobar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane1.setViewportView(tablaRecargas);

        bAprobar.setText("Aprobar");
        bAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprobarActionPerformed(evt);
            }
        });

        bCerrar.setText("Cerrar");

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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAprobar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lRecargasPendientes;
    private javax.swing.JTable tablaRecargas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarRecargas(List<Propietario> propietariosConRecargasPendientes) {
        String[] columnNames = {"Fecha", "Propietario", "Monto"};
        DefaultTableModel modeloDefault = new DefaultTableModel(columnNames, propietariosConRecargasPendientes.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaRecargas.setModel(modeloDefault);

 

        TableModel modeloDatos = tablaRecargas.getModel();
        for (int i = 0; i < propietariosConRecargasPendientes.size(); i++) {
            Propietario p = propietariosConRecargasPendientes.get(i);
            for(Recarga r: p.getCuenta().getRecargasPendientes()){
                //modeloDatos.setValueAt(formatDate(r.getFechaYHora()), i, 0);
                modeloDatos.setValueAt(r.getFechaYHora(), i, 0);
                modeloDatos.setValueAt(p.getNombre(), i, 1);
                modeloDatos.setValueAt(r.getMonto(), i, 2);
            }
            
        }
    }

    @Override
    public void aprobarRecarga() {
    //TODO terminar   
    // controlador.aprobar();
    }

    @Override
    public void cerrar() {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
