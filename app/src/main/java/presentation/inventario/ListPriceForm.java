package presentation.inventario;

import entidad.constantes.Constants;
import entidad.entitys.inventario.Category;
import entidad.entitys.inventario.ListPrice;
import entidad.entitys.inventario.Product;
import lombok.extern.log4j.Log4j2;
import negocio.inventario.LogicalListPrice;
import negocio.inventario.LogicalProduct;
import negocio.utils.UtilsDate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ivanl
 */
@Log4j2
public class ListPriceForm extends JPanel {

    private final LogicalListPrice logicalListPrice = new LogicalListPrice();
    private final LogicalProduct logicalProduct = new LogicalProduct();
    private ListPrice listPriceItems = ListPrice.builder().build();
    private List<Product> listProductResult = new ArrayList<>();
    private String searchProduct;
    private int idProductFind;
    /**
     * Creates new form ListPriceForm
     */
    public ListPriceForm() {
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

        btnGroupState = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textDescription = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioButtonTrue = new javax.swing.JRadioButton();
        radioButtonFalse = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListPrice = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDateCreate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelDateUpdate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GESTION LISTA PRECIOS DE PRODUCTOS");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Estado");

        btnGroupState.add(radioButtonTrue);
        radioButtonTrue.setText("Habilitado");

        btnGroupState.add(radioButtonFalse);
        radioButtonFalse.setText("Deshabilitado");

        tableListPrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Precio", "Descripcion", "Estado", "create", "update", "idProduct", "Producto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListPriceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListPrice);
        if (tableListPrice.getColumnModel().getColumnCount() > 0) {
            tableListPrice.getColumnModel().getColumn(0).setMinWidth(0);
            tableListPrice.getColumnModel().getColumn(0).setMaxWidth(0);
            tableListPrice.getColumnModel().getColumn(1).setResizable(false);
            tableListPrice.getColumnModel().getColumn(2).setResizable(false);
            tableListPrice.getColumnModel().getColumn(3).setMinWidth(0);
            tableListPrice.getColumnModel().getColumn(3).setMaxWidth(0);
            tableListPrice.getColumnModel().getColumn(4).setResizable(false);
            tableListPrice.getColumnModel().getColumn(5).setMinWidth(0);
            tableListPrice.getColumnModel().getColumn(5).setMaxWidth(0);
            tableListPrice.getColumnModel().getColumn(6).setMinWidth(0);
            tableListPrice.getColumnModel().getColumn(6).setMaxWidth(0);
            tableListPrice.getColumnModel().getColumn(7).setMinWidth(0);
            tableListPrice.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LISTA DE PRECIOS");

        jLabel1.setText("Fecha Creacion");

        labelDateCreate.setText("-/-/-");

        jLabel9.setText("Fecha Actualizacion");

        labelDateUpdate.setText("-/-/-");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LISTA DE PRODUCTOS");

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    tableProductosMouseClicked(evt);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups, ocurrio un error: " + e.getMessage());
                    log.info("Ups, ocurrio un error: " + e.getMessage());
                }
            }
        });
        jScrollPane2.setViewportView(tableProductos);
        if (tableProductos.getColumnModel().getColumnCount() > 0) {
            tableProductos.getColumnModel().getColumn(0).setMinWidth(1);
            tableProductos.getColumnModel().getColumn(0).setMaxWidth(1);
            tableProductos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel12.setText("Buscar");

        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBuscarKeyReleased(evt);
            }
        });

        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnAgregarActionPerformed(evt);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Ups, ocurrio un error: " + e.getMessage());
                    log.info("Ups, ocurrio un error: " + e.getMessage());
                }
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/actualizar-flecha.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boton-menos.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonTrue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioButtonFalse))
                            .addComponent(labelDateUpdate)
                            .addComponent(jLabel9)
                            .addComponent(labelDateCreate)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnClean))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonTrue)
                            .addComponent(radioButtonFalse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDateCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDateUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCleanActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        textBuscar.setText(Constants.EMPTY);
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnAgregarActionPerformed(ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnAgregarActionPerformed
       DefaultTableModel defaultTableModel = (DefaultTableModel)tableProductos.getModel();
       int indexSelect = tableProductos.getSelectedRow();

       if (validateField()) {
           ListPrice listPriceSave = ListPrice.builder()
                   .name(textNombre.getText())
                   .price(Double.parseDouble(textPrecio.getText()))
                   .description(textDescription.getText())
                   .isActive(radioButtonTrue.isSelected())
                   .fk_idProduct(Integer.parseInt(defaultTableModel.getValueAt(indexSelect, 0).toString()))
                   .build();

           log.info(listPriceSave.toString());
           String result = logicalListPrice.addListPrice(listPriceSave);
           JOptionPane.showMessageDialog(null, result);
       }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        //getAllDataListPrice();
        getAllDataProduct();
        getAllDataListPrice();
        enableButton(false);
        btnCancelar.setVisible(false);
        radioButtonTrue.setSelected(true);
    }//GEN-LAST:event_formAncestorAdded

    private void tableProductosMouseClicked(MouseEvent evt) throws ParseException {//GEN-FIRST:event_tableProductosMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableProductos.getModel();
        int indexSelect = tableProductos.getSelectedRow();
        String nameProduct = defaultTableModel.getValueAt(indexSelect, 1).toString();

        DefaultTableModel modelListPrice = (DefaultTableModel)tableListPrice.getModel();
        modelListPrice.setRowCount(0);

        List<ListPrice> listPrices = logicalListPrice.findAllListPriceByProduct(
                Integer.parseInt(defaultTableModel.getValueAt(indexSelect, 0).toString()));

        if (listPrices.isEmpty()) {
            JOptionPane.showMessageDialog(
                null, "No se tienen listas de precios para el producto: " + nameProduct);
        } else {
            modelListPrice.setRowCount(0);

            for (ListPrice listPrice : listPrices) {
                modelListPrice.addRow(new Object[]{
                        listPrice.getIdListPrice(),
                        listPrice.getName(),
                        listPrice.getPrice(),
                        listPrice.getDescription(),
                        listPrice.getIsActive(),
                        listPrice.getDateCreate(),
                        listPrice.getDateUpdate(),
                        listPrice.getFk_idProduct(),
                        nameProduct
                });
            }
        }
    }//GEN-LAST:event_tableProductosMouseClicked

    private void tableListPriceMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tableListPriceMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableListPrice.getModel();
        int indexSelect = tableListPrice.getSelectedRow();
        
        textNombre.setText(defaultTableModel.getValueAt(indexSelect, 1).toString());
        textPrecio.setText(defaultTableModel.getValueAt(indexSelect, 2).toString());
        textDescription.setText(defaultTableModel.getValueAt(indexSelect, 3).toString());

        if (defaultTableModel.getValueAt(indexSelect, 4).toString().equals(Constants.TRUE)) {
            radioButtonTrue.setSelected(true);
        } else {
            radioButtonFalse.setSelected(true);
        }

        labelDateCreate.setText(UtilsDate.getDateFormated(defaultTableModel.getValueAt(indexSelect, 5).toString()));
        labelDateUpdate.setText(UtilsDate.getDateFormated(defaultTableModel.getValueAt(indexSelect, 6).toString()));

        listPriceItems.setIdListPrice(Integer.parseInt(defaultTableModel.getValueAt(indexSelect, 0).toString()));
        enableButton(true);

    }//GEN-LAST:event_tableListPriceMouseClicked

    private void enableButton(Boolean aBoolean) {
        textNombre.setFocusable(true);
        if (aBoolean) {
            btnActualizar.setEnabled(true);
            btnBorrar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnCancelar.setVisible(true);
            btnAgregar.setEnabled(false);
        } else {
            btnActualizar.setEnabled(false);
            btnBorrar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnCancelar.setVisible(false);
            btnAgregar.setEnabled(true);
        }
    }
    private void btnActualizarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        listPriceItems.setPrice(Double.parseDouble(textPrecio.getText()));
        listPriceItems.setName(textNombre.getText());
        listPriceItems.setDescription(textDescription.getText());
        listPriceItems.setIsActive(radioButtonTrue.isSelected());

        if (validateField()) {
            String result = logicalListPrice.updateListPrice(listPriceItems);
            JOptionPane.showMessageDialog(null, result);
            cleanForm();
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int option = JOptionPane.showConfirmDialog(null,
                "Seguro de eliminar, lista de precio ?",
                "ELIMINANDO LISTA",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == 0) {
            String result = logicalListPrice.deleteListPrice(listPriceItems);
            JOptionPane.showMessageDialog(null, result);
            cleanForm();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cleanForm();
        enableButton(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void textBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarKeyReleased
        searchProduct(textBuscar.getText());
    }//GEN-LAST:event_textBuscarKeyReleased

    private void getAllDataListPrice() {
        SwingUtilities.invokeLater(() -> {
            try {
                List<ListPrice> listPricesResult = logicalListPrice.findAllListPrice();
                DefaultTableModel defaultTableModel = (DefaultTableModel)tableListPrice.getModel();
                defaultTableModel.setRowCount(0);

                for (ListPrice listPrice : listPricesResult) {
                    log.info(listPrice.getNameProduct());
                    defaultTableModel.addRow(new Object[] {
                            listPrice.getIdListPrice(),
                            listPrice.getName(),
                            listPrice.getPrice(),
                            listPrice.getDescription(),
                            listPrice.getIsActive(),
                            listPrice.getDateCreate(),
                            listPrice.getDateUpdate(),
                            listPrice.getFk_idProduct(),
                            listPrice.getNameProduct()
                    });
                }

            } catch (ParseException e) {
                log.error("Ups!! Ocurrio un error al cargar los datos: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrio un error, causa: " + e.getMessage());
            }
        });

    }

    private void getAllDataProduct() {
        SwingUtilities.invokeLater(() -> {
            try {
                listProductResult = logicalProduct.findAllProduct();
                DefaultTableModel defaultTableModel = (DefaultTableModel)tableProductos.getModel();
                defaultTableModel.setRowCount(0);

                if (listProductResult.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Registremos productos primero.");
                } else {
                    for (Product product : listProductResult) {
                        defaultTableModel.addRow(new Object[] {
                                product.getIdProduct(),
                                product.getName()
                        });
                    }
                }

            } catch (ParseException e) {
                log.error("Ups!! Ocurrio un error al cargar los datos: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrio un error, causa: " + e.getMessage());
            }
        });
    }

    private void searchProduct(String nameProduct) {
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableProductos.getModel();
        defaultTableModel.setRowCount(0);
        List<Product> productListFilter;

        if (nameProduct.isEmpty() || nameProduct.isBlank()) {
            lblBuscar.setText("Sin resultados.");
            productListFilter = listProductResult;
        } else {
            productListFilter = listProductResult.stream()
                .filter(product -> product.getName().toLowerCase().startsWith(nameProduct.toLowerCase()))
                .toList();

            lblBuscar.setText("Resultados: " + productListFilter.size());
        }

        for (Product product : productListFilter) {
            defaultTableModel.addRow(new Object[] {
                    product.getIdProduct(),
                    product.getName()
            });
        }
    }

    private void cleanForm() {
        DefaultTableModel defaultTableModel = (DefaultTableModel)tableListPrice.getModel();
        defaultTableModel.setRowCount(0);
        textNombre.setText(Constants.EMPTY);
        textDescription.setText(Constants.EMPTY);
        textPrecio.setText(Constants.EMPTY);
        textBuscar.setText(Constants.EMPTY);
        labelDateUpdate.setText(Constants.FORMAT_LABEL_DATE);
        labelDateCreate.setText(Constants.FORMAT_LABEL_DATE);
        radioButtonTrue.setSelected(false);
        radioButtonFalse.setSelected(false);
        textNombre.setFocusable(true);
        getAllDataListPrice();
    }

    private boolean validateField() {
        int indexSelect = tableProductos.getSelectedRow();

        ListPrice listPriceValidate = ListPrice.builder()
                .name(textNombre.getText())
                .price(textPrecio.getText().isEmpty() ? null : Double.parseDouble(textPrecio.getText()))
                .description(textDescription.getText())
                .build();

        String result = logicalListPrice.validateData(listPriceValidate);
        if (!result.equals(Constants.EMPTY) || indexSelect  == -1) {
            result = result.concat("No se te olvide, selecciona un producto.");
            JOptionPane.showMessageDialog(null, result);
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClean;
    private javax.swing.ButtonGroup btnGroupState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDateCreate;
    private javax.swing.JLabel labelDateUpdate;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JRadioButton radioButtonFalse;
    private javax.swing.JRadioButton radioButtonTrue;
    private javax.swing.JTable tableListPrice;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textDescription;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
