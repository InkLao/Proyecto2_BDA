/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Arturo ITSON
 */
public class frmCambiarEstatus extends javax.swing.JFrame {

  private DefaultTableModel tableModel; // Define el modelo de tabla para jTable2
    public frmCambiarEstatus() {
        initComponents();
       
            // Agregar ActionListener 
       btnVerGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGuardarActionPerformed(evt);
            }
        });
         // Inicializa el modelo de jTable2 con datos (para demostración)
        Object[][] data = {
            {1, "Cuenta1", 100.0, 2, "2023-01-01 10:00", "Creado"},
            {2, "Cuenta2", 200.0, 3, "2023-02-02 11:00", "Creado"}
        };
        String[] columns = {"Id Pago", "Cuenta", "Monto", "No. Parcialidades", "Fecha - Hora", "Estado Actual", "Cambiar Estado"};
        tableModel = new DefaultTableModel(data, columns) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 6) {
                    return JComboBox.class; // Retorna la clase JComboBox para la columna "Cambiar Estado"
                }
                return super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 6; // Solo la columna "Cambiar Estado" es editable
            }
        };
        jTable2.setModel(tableModel);
        // Configura un editor de combo box personalizado para la columna "Cambiar Estado"
        TableColumn cambiarEstadoColumn = jTable2.getColumnModel().getColumn(6);
        cambiarEstadoColumn.setCellEditor(new DefaultCellEditor(createComboBox()));
        // Configura un renderizador personalizado para mostrar el combo box en las celdas de la tabla
        cambiarEstadoColumn.setCellRenderer((TableCellRenderer) new ComboBoxRenderer());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnVerGuardar = new javax.swing.JButton();
        btnVerRegresar = new javax.swing.JButton();
        btnCambiarMensaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambiar Estatus");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setBackground(new java.awt.Color(225, 225, 225));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Pago", "Cuenta", "Monto", "No. Parcialidades", "Fecha - Hora", "Estado Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnVerGuardar.setBackground(new java.awt.Color(23, 154, 249));
        btnVerGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerGuardar.setText("Guardar");
        btnVerGuardar.setBorder(null);
        btnVerGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGuardarActionPerformed(evt);
            }
        });

        btnVerRegresar.setBackground(new java.awt.Color(23, 154, 249));
        btnVerRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerRegresar.setText("Regresar");
        btnVerRegresar.setBorder(null);
        btnVerRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegresarActionPerformed(evt);
            }
        });

        btnCambiarMensaje.setBackground(new java.awt.Color(23, 154, 249));
        btnCambiarMensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCambiarMensaje.setText("Cambiar Mensaje");
        btnCambiarMensaje.setBorder(null);
        btnCambiarMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnCambiarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Método auxiliar para crear un combo box con las opciones especificadas
    private JComboBox<String> createComboBox() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Autorizado");
        comboBox.addItem("Rechazado");
        comboBox.addItem("Modificado");
        comboBox.addItem("Completado");
        comboBox.addItem("Pagado");
        return comboBox;
    }
  
// Renderizador personalizado para mostrar el combo box en las celdas de la tabla
    class ComboBoxRenderer extends JComboBox<String> implements TableCellRenderer {
        public ComboBoxRenderer() {
            setOpaque(true);
        } 
@Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setSelectedItem(value);
            return this;
        }
    }

    private void btnVerGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGuardarActionPerformed
         JOptionPane.showMessageDialog(null, "Se guardó correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnVerGuardarActionPerformed

    private void btnVerRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegresarActionPerformed
         frmInicioAdmin adminFrame = new  frmInicioAdmin ();
        adminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerRegresarActionPerformed

    private void btnCambiarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarMensajeActionPerformed
        frmCambiarMensaje men = new frmCambiarMensaje();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCambiarMensajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarMensaje;
    private javax.swing.JButton btnVerGuardar;
    private javax.swing.JButton btnVerRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
