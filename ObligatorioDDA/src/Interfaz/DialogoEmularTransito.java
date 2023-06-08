package Interfaz;

import Controlador.ControladorEmularTransito;
import Dominio.Administrador;
import Dominio.Puesto;
import Dominio.Tarifa;
import Servicios.FachadaServicios;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogoEmularTransito extends javax.swing.JDialog implements VistaEmularTransito {

    private ControladorEmularTransito controlador;

    public DialogoEmularTransito(java.awt.Frame parent, boolean modal, Administrador usuarioAdmin) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorEmularTransito(this, usuarioAdmin);
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
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.cerrar();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void cPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPuestosActionPerformed
        this.mostrarTarifas();
    }//GEN-LAST:event_cPuestosActionPerformed

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
        DefaultComboBoxModel listaDefault = new DefaultComboBoxModel();
        cPuestos.setModel(listaDefault);
        listaDefault.addElement("Elija una opción");

        for (Puesto p : puestos) {
            listaDefault.addElement(p.getNombre());
        }

    }

    public void mostrarTarifas() {

        String selectedPuesto = (String) cPuestos.getSelectedItem();

        if (!selectedPuesto.equals("Elija una opción")) {
            List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();
            Puesto selectedPuestoPro = null;
            for (Puesto p : puestos) {
                if (p.getNombre() == selectedPuesto) {
                    selectedPuestoPro = p;
                    break;
                }
            }

            List<Tarifa> tarifas = selectedPuestoPro.getTarifas();

            //FALTA REPENSAR SI CADA PUESTO TIENE SUS TARIFAS O LAS TARIFAS EXISTEN GLOBALMENTE PARA TODOS LOS PUESTOS
            String[] columnNames = {"Categoría", "Monto"};
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
                modeloDefault.addRow(new Object[]{t.getCategoria().getNombre(), t.getMonto()});

            }
        }
    }
}
