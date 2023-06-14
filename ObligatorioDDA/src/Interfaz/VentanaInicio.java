package Interfaz;

import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLoginAdministrador = new javax.swing.JButton();
        bLoginPropietario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bLoginAdministrador.setText("Login Administrador");
        bLoginAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginAdministradorActionPerformed(evt);
            }
        });

        bLoginPropietario.setText("Login Propietario");
        bLoginPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginPropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(bLoginAdministrador)
                .addGap(67, 67, 67)
                .addComponent(bLoginPropietario)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLoginAdministrador)
                    .addComponent(bLoginPropietario))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoginAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginAdministradorActionPerformed
        this.loginAdministrador();
    }//GEN-LAST:event_bLoginAdministradorActionPerformed

    private void bLoginPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginPropietarioActionPerformed
        this.loginPropietario();
    }//GEN-LAST:event_bLoginPropietarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrar();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLoginAdministrador;
    private javax.swing.JButton bLoginPropietario;
    // End of variables declaration//GEN-END:variables

    private void loginAdministrador() {
        new DialogoLoginAdministrador(this, false).setVisible(true);
    }

    private void loginPropietario() {
        new DialogoLoginPropietario(this, false).setVisible(true);
    }

    private void cerrar() {
        if(JOptionPane.showConfirmDialog(this, "Confirma que desea salir", "Salir del sistema", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0); //salir completamente del sistema
        }
    }

}
