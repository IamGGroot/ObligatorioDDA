package Interfaz;

import Controlador.ControladorAsignarBonificaciones;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Renderizable;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DialogoAsignarBonificaciones extends javax.swing.JDialog implements VistaAsignarBonificaciones {

    private ControladorAsignarBonificaciones controlador;

    public DialogoAsignarBonificaciones(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorAsignarBonificaciones(this, usuarioAdmin);
        cBonificaciones.setRenderer(new Detalle());
        cPuestos.setRenderer(new Detalle());

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

        lBonificaciones = new javax.swing.JLabel();
        lPuestos = new javax.swing.JLabel();
        lCedula = new javax.swing.JLabel();
        cBonificaciones = new javax.swing.JComboBox();
        cPuestos = new javax.swing.JComboBox();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBonificacionPuesto = new javax.swing.JTable();
        bAsignar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        lPropietario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Asignar bonificaciones");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lBonificaciones.setText("Bonificaciones:");

        lPuestos.setText("Puestos:");

        lCedula.setText("Cédula:");

        cBonificaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBonificaciones.setSelectedIndex(-1);
        cBonificaciones.setToolTipText("");

        cPuestos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cPuestos.setSelectedIndex(-1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void bAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAsignarActionPerformed
        this.asignarBonificacion();
    }//GEN-LAST:event_bAsignarActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        this.buscar();
    }//GEN-LAST:event_bBuscarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cerrar();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAsignar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JComboBox cBonificaciones;
    private javax.swing.JComboBox cPuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBonificaciones;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lPropietario;
    private javax.swing.JLabel lPuestos;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTable tablaBonificacionPuesto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void listarBonificaciones(List<Bonificacion> bonificaciones) {

        DefaultComboBoxModel<Bonificacion> model = new DefaultComboBoxModel<>();
        for (Bonificacion b : bonificaciones) {
            model.addElement(b);
        }
        cBonificaciones.setModel(model);
    }

    @Override
    public void listarPuestos(List<Puesto> puestos) {

        DefaultComboBoxModel<Puesto> model = new DefaultComboBoxModel<>();
        for (Puesto p : puestos) {
            model.addElement(p);
        }
        cPuestos.setModel(model);
    }

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

    public void buscar() {
        try {
            int cedula = Integer.parseInt(tCedula.getText());
            controlador.buscarPropietarioPorCedula(cedula);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cédula solo admite caracteres numéricos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mostrarPropietarioYTabla(Propietario p) {
        mostrarPropietario(p);
        mostrarTabla(p);
    }

    private void mostrarPropietario(Propietario p) {
        lPropietario.setText(p.getNombre());
    }

    private void mostrarTabla(Propietario propietario) {

        DefaultTableModel modeloDefault = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modeloDefault.addColumn("Bonificación");
        modeloDefault.addColumn("Puesto");
        tablaBonificacionPuesto.setModel(modeloDefault);

        for (int i = 0; i < propietario.getBonificaciones().size(); i++) {
            Bonificacion b = propietario.getBonificaciones().get(i);

            modeloDefault.addRow(new Object[]{b, b.getPuesto()});

        }
        renderCustomTablaBonificacionPuesto();
    }

    public void asignarBonificacion() {
        try {
            int cedula = Integer.parseInt(tCedula.getText());
            Puesto selectedPuesto = (Puesto) cPuestos.getSelectedItem();
            Bonificacion selectedBonificacion = (Bonificacion) cBonificaciones.getSelectedItem();
            controlador.asignarBonificacion(selectedBonificacion, selectedPuesto, cedula);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cédula solo admite caracteres numéricos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "", JOptionPane.ERROR_MESSAGE);
    }

    private class Detalle implements ListCellRenderer<Renderizable> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Renderizable> list, Renderizable value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = new JLabel();
            label.setText(value.getRenderDetail());
            return label;
        }

    }

    private void renderCustomTablaBonificacionPuesto() {

        tablaBonificacionPuesto.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                String bonificacion = ((Bonificacion) value).getTipoBonificacion().getNombre();
                setText(bonificacion);
            }
        });
        tablaBonificacionPuesto.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                String puesto = ((Puesto) value).getNombre();
                setText(puesto);

            }
        });

    }
}
