/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Arturo ITSON
 */
public class frmAdministrarPagos extends javax.swing.JFrame {

    /**
     * Creates new form frmAdministrarPagos
     */
    public frmAdministrarPagos() {
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

        jPanel1 = new javax.swing.JPanel();
        comboBoxTipoPagos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        campoTextoMonto = new javax.swing.JTextField();
        campoTextoFechaHora = new javax.swing.JTextField();
        campoTextoEstatus = new javax.swing.JTextField();
        campoTextoMensualidades = new javax.swing.JTextField();
        campoTextoRestante = new javax.swing.JTextField();
        jblMonto = new javax.swing.JLabel();
        jblFechaHora = new javax.swing.JLabel();
        jblEstatus = new javax.swing.JLabel();
        jblMensualidades = new javax.swing.JLabel();
        jblRestante = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar Pagos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        comboBoxTipoPagos.setBackground(new java.awt.Color(225, 225, 225));
        comboBoxTipoPagos.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxTipoPagos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Pago", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        campoTextoMonto.setBackground(new java.awt.Color(225, 225, 225));
        campoTextoMonto.setForeground(new java.awt.Color(0, 0, 0));
        campoTextoMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTextoFechaHora.setBackground(new java.awt.Color(225, 225, 225));
        campoTextoFechaHora.setForeground(new java.awt.Color(0, 0, 0));
        campoTextoFechaHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTextoEstatus.setBackground(new java.awt.Color(225, 225, 225));
        campoTextoEstatus.setForeground(new java.awt.Color(0, 0, 0));
        campoTextoEstatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTextoMensualidades.setBackground(new java.awt.Color(225, 225, 225));
        campoTextoMensualidades.setForeground(new java.awt.Color(0, 0, 0));
        campoTextoMensualidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoTextoRestante.setBackground(new java.awt.Color(225, 225, 225));
        campoTextoRestante.setForeground(new java.awt.Color(0, 0, 0));
        campoTextoRestante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jblMonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblMonto.setForeground(new java.awt.Color(0, 0, 0));
        jblMonto.setText("Monto");

        jblFechaHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblFechaHora.setForeground(new java.awt.Color(0, 0, 0));
        jblFechaHora.setText("Fecha y hora");

        jblEstatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblEstatus.setForeground(new java.awt.Color(0, 0, 0));
        jblEstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblEstatus.setText("Estatus");

        jblMensualidades.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblMensualidades.setForeground(new java.awt.Color(0, 0, 0));
        jblMensualidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblMensualidades.setText("Mensualidades");

        jblRestante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblRestante.setForeground(new java.awt.Color(0, 0, 0));
        jblRestante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblRestante.setText("Restante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(campoTextoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jblMonto)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTextoFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTextoEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jblMensualidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTextoMensualidades))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTextoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblMonto)
                    .addComponent(jblFechaHora)
                    .addComponent(jblEstatus)
                    .addComponent(jblMensualidades)
                    .addComponent(jblRestante))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoMensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(225, 225, 225));
        jTextField1.setForeground(new java.awt.Color(225, 225, 225));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnRegresar.setBackground(new java.awt.Color(23, 154, 249));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboBoxTipoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(comboBoxTipoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdministrarPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdministrarPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdministrarPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdministrarPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdministrarPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoEstatus;
    private javax.swing.JTextField campoTextoFechaHora;
    private javax.swing.JTextField campoTextoMensualidades;
    private javax.swing.JTextField campoTextoMonto;
    private javax.swing.JTextField campoTextoRestante;
    private javax.swing.JComboBox<String> comboBoxTipoPagos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jblEstatus;
    private javax.swing.JLabel jblFechaHora;
    private javax.swing.JLabel jblMensualidades;
    private javax.swing.JLabel jblMonto;
    private javax.swing.JLabel jblRestante;
    // End of variables declaration//GEN-END:variables
}
