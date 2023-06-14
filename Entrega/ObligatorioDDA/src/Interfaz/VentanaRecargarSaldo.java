package Interfaz;

import Controlador.ControladorRecargarSaldo;
import Dominio.Propietario;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class VentanaRecargarSaldo extends javax.swing.JFrame implements VistaRecargarSaldo {

    private ControladorRecargarSaldo controlador;

    public VentanaRecargarSaldo(Frame parent, boolean modal, Propietario propietario) {
        initComponents();
        this.controlador = new ControladorRecargarSaldo(this, propietario);
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSaldoCuenta = new javax.swing.JLabel();
        fUsuario = new javax.swing.JLabel();
        tMontoARecargar = new javax.swing.JTextField();
        lMontoARecargar = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        nSaldoCuenta = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        tNombreUsuario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Recarga de saldo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fSaldoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/dinero.png"))); // NOI18N

        fUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/usuario.png"))); // NOI18N

        lMontoARecargar.setText("Monto a recargar:");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        nSaldoCuenta.setEditable(false);
        nSaldoCuenta.setColumns(1);
        nSaldoCuenta.setRows(1);
        nSaldoCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nSaldoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nSaldoCuenta.setOpaque(false);
        jScrollPane11.setViewportView(nSaldoCuenta);

        tNombreUsuario.setEditable(false);
        tNombreUsuario.setColumns(1);
        tNombreUsuario.setRows(1);
        tNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tNombreUsuario.setOpaque(false);
        jScrollPane10.setViewportView(tNombreUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(fSaldoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(fUsuario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lMontoARecargar)
                        .addGap(36, 36, 36)
                        .addComponent(tMontoARecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fSaldoCuenta)
                            .addComponent(fUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMontoARecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tMontoARecargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        this.solicitarRecarga();
    }//GEN-LAST:event_bAceptarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrar();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel fSaldoCuenta;
    private javax.swing.JLabel fUsuario;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JLabel lMontoARecargar;
    private javax.swing.JTextArea nSaldoCuenta;
    private javax.swing.JTextField tMontoARecargar;
    private javax.swing.JTextArea tNombreUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarSaldo(double saldo) {
        nSaldoCuenta.setText("$ " + saldo);
    }

    @Override
    public void mostrarNombre(String nombre) {
        tNombreUsuario.setText(nombre);
    }

    private void inicializar() {
        controlador.obtenerNombre();
        controlador.obtenerSaldo();
    }

    private void solicitarRecarga() {
        try {
            double monto = Double.parseDouble(tMontoARecargar.getText());
            controlador.enviarRecarga(monto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El monto solo admite caracteres numéricos", "Monto inválido", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cerrar() {
        controlador.cerrar();
    }

    @Override
    public void mostrarError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Login incorrecto", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarExito(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Recarga", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public boolean confirmar(String mensaje, String title) {
        return JOptionPane.showConfirmDialog(this, mensaje, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    @Override
    public void salir() {
        dispose();
    }
}
