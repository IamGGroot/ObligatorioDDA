package Interfaz;

import Controlador.ControladorVistaPrincipal;
import Dominio.Administrador;
import javax.swing.JOptionPane;

public class DialogoPrincipalAdministrador extends javax.swing.JDialog implements VistaPrincipalAdministrador {

    private ControladorVistaPrincipal controlador;

    public DialogoPrincipalAdministrador(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorVistaPrincipal(this, usuarioAdmin);
        inicializar();
    }

    private void inicializar() {
        this.setTitle("Bienvenido Administrador!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bEmularTransito = new javax.swing.JButton();
        bAprobacionRecarga = new javax.swing.JButton();
        bAsignarBonificacion = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bEmularTransito.setText("Emular transito");
        bEmularTransito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEmularTransito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmularTransitoActionPerformed(evt);
            }
        });

        bAprobacionRecarga.setText("Emular aprobación de recarga");
        bAprobacionRecarga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAprobacionRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprobacionRecargaActionPerformed(evt);
            }
        });

        bAsignarBonificacion.setText("Asignar bonificacion");
        bAsignarBonificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAsignarBonificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAsignarBonificacionActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAprobacionRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEmularTransito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAsignarBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(bEmularTransito)
                .addGap(18, 18, 18)
                .addComponent(bAprobacionRecarga)
                .addGap(18, 18, 18)
                .addComponent(bAsignarBonificacion)
                .addGap(18, 18, 18)
                .addComponent(bSalir)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEmularTransitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmularTransitoActionPerformed
        this.emularTransito();
    }//GEN-LAST:event_bEmularTransitoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.cerrar();
    }//GEN-LAST:event_bSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void bAprobacionRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAprobacionRecargaActionPerformed
        this.emularAprobacionRecarga();
    }//GEN-LAST:event_bAprobacionRecargaActionPerformed

    private void bAsignarBonificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAsignarBonificacionActionPerformed
        this.asignarBonificacion();
    }//GEN-LAST:event_bAsignarBonificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAprobacionRecarga;
    private javax.swing.JButton bAsignarBonificacion;
    private javax.swing.JButton bEmularTransito;
    private javax.swing.JButton bSalir;
    // End of variables declaration//GEN-END:variables

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

    private void emularTransito() {
        controlador.emularTransito();
    }

    private void emularAprobacionRecarga() {
        controlador.emularAprobacionRecarga();
    }

    private void asignarBonificacion() {
        controlador.asignarBonificacion();
    }

    @Override
    public void emularTransito(Administrador usuarioAdmin) {
        new DialogoEmularTransito((java.awt.Frame) this.getParent(), false, usuarioAdmin).setVisible(true);
    }

    @Override
    public void emularAprobacionRecarga(Administrador usuarioAdmin) {
        new VentanaEmularAprobaciónDeRecargas(usuarioAdmin).setVisible(true);
    }

    @Override
    public void asignarBonificacion(Administrador usuarioAdmin) {
        new DialogoAsignarBonificaciones((java.awt.Frame) this.getParent(), false, usuarioAdmin).setVisible(true);
    }
}
