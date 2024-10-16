/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentation.inventario;

import entidad.constantes.Constants;
import entidad.entitys.inventario.Category;
import entidad.entitys.inventario.Store;
import lombok.extern.log4j.Log4j2;
import negocio.inventario.LogicalStorage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ivanl
 */
@Log4j2
public class StorageForm extends javax.swing.JPanel {

    LogicalStorage logicalStorage = new LogicalStorage();
    Store storeOperation = Store.builder().build();

    /**
     * Creates new form StorageForm
     */
    public StorageForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textBodega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBodega = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE ALMACENAMIENTOS DE LOS PRODUCTOS");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Nombre bodega");

        tableBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Descripcion", "Bodega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBodega.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableBodegaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBodegaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBodega);
        if (tableBodega.getColumnModel().getColumnCount() > 0) {
            tableBodega.getColumnModel().getColumn(0).setMinWidth(0);
            tableBodega.getColumnModel().getColumn(0).setMaxWidth(0);
            tableBodega.getColumnModel().getColumn(1).setResizable(false);
            tableBodega.getColumnModel().getColumn(2).setResizable(false);
            tableBodega.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnAgregarActionPerformed(evt);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boton-menos.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(textNombre)
                                    .addComponent(textDescription)
                                    .addComponent(textBodega, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnAgregarActionPerformed
        String result = logicalStorage.addStorage(getValues());
        JOptionPane.showMessageDialog(null, result);
        getAllStorage();
        cleanForm();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String result = logicalStorage.updateStorage(getValues());
        JOptionPane.showMessageDialog(null, result);
        getAllStorage();
        cleanForm();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String result = logicalStorage.deleteStorage(storeOperation);
        JOptionPane.showMessageDialog(null, result);
        getAllStorage();
        cleanForm();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setEnabledButtons();
        getAllStorage();
        cleanForm();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tableBodegaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableBodegaAncestorAdded
        getAllStorage();
        setEnabledButtons();
    }//GEN-LAST:event_tableBodegaAncestorAdded

    private void tableBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBodegaMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableBodega.getModel();
        int indexSelect = tableBodega.getSelectedRow();

        storeOperation.setIdStore(Integer.valueOf(defaultTableModel.getValueAt(indexSelect, 0).toString()));
        textNombre.setText(defaultTableModel.getValueAt(indexSelect, 1).toString());
        textDescription.setText(defaultTableModel.getValueAt(indexSelect, 2).toString());
        textBodega.setText(defaultTableModel.getValueAt(indexSelect, 3).toString());
        setEnabledOperations();
    }//GEN-LAST:event_tableBodegaMouseClicked

    private void setEnabledButtons() {
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setVisible(false);
        btnAgregar.setEnabled(true);
        textNombre.setFocusable(true);
    }

    private void setEnabledOperations() {
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setVisible(true);
        btnAgregar.setEnabled(false);
        textNombre.setFocusable(true);
    }
    
    private void cleanForm() {
        textBodega.setText(Constants.EMPTY);
        textDescription.setText(Constants.EMPTY);
        textNombre.setText(Constants.EMPTY);
        textNombre.setFocusable(true);
    }
    
    private void getAllStorage() {
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableBodega.getModel();
        defaultTableModel.setRowCount(0);

        try {
            List<Store> storeList = logicalStorage.findAllStorage();

            for (Store store : storeList) {
                defaultTableModel.addRow(new Object[]{
                        store.getIdStore(),
                        store.getName(),
                        store.getDescription(),
                        store.getUbication()
                });
            }

            defaultTableModel.fireTableDataChanged();
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCancelar.setVisible(false);
            btnAgregar.setEnabled(true);
        } catch (ParseException e) {
            log.error("Error: {}", e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
        }

    }

    private Store getValues() {
        return Store.builder()
                .idStore(storeOperation.getIdStore())
                .name(textNombre.getText())
                .description(textDescription.getText())
                .ubication(textBodega.getText())
                .build();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBodega;
    private javax.swing.JTextField textBodega;
    private javax.swing.JTextField textDescription;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
