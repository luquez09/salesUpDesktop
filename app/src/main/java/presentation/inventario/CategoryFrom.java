package presentation.inventario;

import entidad.entitys.inventario.Category;
import lombok.extern.log4j.Log4j2;
import negocio.inventario.LogicalCategory;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ivanl
 */
@Log4j2
public class CategoryFrom extends javax.swing.JFrame {

    private final LogicalCategory logicalCategory = new LogicalCategory();
    private Category accionCategory = Category.builder().build();
    /**
     * Creates new form CategoryFrom
     */
    public CategoryFrom() {
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
        textNameCategory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textDescriptionCategory = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDataCategory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                try {
                    formComponentShown();
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups!! Ocurrio un error: " + e.getMessage());
                }
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        textDescriptionCategory.setColumns(3);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnAceptarActionPerformed(evt);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups!! Ocurrio un error: " + e.getMessage());
                }
            }
        });

        tableDataCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Descripcion", "Creacion", "Moficacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDataCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDataCategory);
        if (tableDataCategory.getColumnModel().getColumnCount() > 0) {
            tableDataCategory.getColumnModel().getColumn(0).setMinWidth(1);
            tableDataCategory.getColumnModel().getColumn(0).setMaxWidth(1);
            tableDataCategory.getColumnModel().getColumn(1).setResizable(false);
            tableDataCategory.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GESTIONAR CATEGORIA DE PRODUCTOS");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnActualizarActionPerformed(evt);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups!! Ocurrio un error: " + e.getMessage());
                }
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnEliminarActionPerformed(evt);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups!! Ocurrio un error: " + e.getMessage());
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(textNameCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(textDescriptionCategory)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDescriptionCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDataCategoryMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tableDataCategoryMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableDataCategory.getModel();
        int indexSelect = tableDataCategory.getSelectedRow();

        textNameCategory.setText(defaultTableModel.getValueAt(indexSelect, 1).toString());
        textDescriptionCategory.setText(defaultTableModel.getValueAt(indexSelect, 2).toString());
        accionCategory.setIdCategory(Integer.valueOf(defaultTableModel.getValueAt(indexSelect, 0).toString()));
        accionCategory.setName(defaultTableModel.getValueAt(indexSelect, 1).toString());
        accionCategory.setDescription(defaultTableModel.getValueAt(indexSelect, 2).toString());
    }//GEN-LAST:event_tableDataCategoryMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnActualizarActionPerformed
        log.info("Actualizando categoria con ID: {}", accionCategory.getIdCategory());
        String result = logicalCategory.updateCategory(accionCategory);
        formComponentShown();
        JOptionPane.showMessageDialog(null, "Actualizacion: " + result);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnEliminarActionPerformed
        log.info("Eliminando categoria con ID: {}", accionCategory.getIdCategory());
        String result = logicalCategory.deleteCategory(accionCategory);
        formComponentShown();
        JOptionPane.showMessageDialog(null, "Eliminacion: " + result);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarActionPerformed(ActionEvent evt) throws ParseException {
        Category category = Category.builder()
                .name(textNameCategory.getText())
                .description(textDescriptionCategory.getText())
                .build();

        String result = logicalCategory.addCategory(category);
        formComponentShown();
        JOptionPane.showMessageDialog(null, result);
    }

    private void formComponentShown() throws ParseException {
        List<Category> categoryList = logicalCategory.categoryList();
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableDataCategory.getModel();
        defaultTableModel.setRowCount(0);

        for (Category category : categoryList) {
            defaultTableModel.addRow(new Object[] {
                category.getIdCategory(),
                category.getName(),
                category.getDescription(),
                category.getDateCreate(),
                category.getDateUpdate()
            });
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDataCategory;
    private javax.swing.JTextField textDescriptionCategory;
    private javax.swing.JTextField textNameCategory;
    // End of variables declaration//GEN-END:variables
}
