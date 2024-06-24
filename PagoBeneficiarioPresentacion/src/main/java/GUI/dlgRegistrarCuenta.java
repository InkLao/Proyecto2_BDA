/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import DTO.BeneficiarioDTO;
import DTO.CuentaBancariaDTO;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.BeneficiarioNegocio;
import negocio.CuentaBancariaNegocio;
import negocio.IBeneficiarioNegocio;
import negocio.ICuentaBancariaNegocio;

/**
 *
 * @author Arturo ITSON
 */
public class dlgRegistrarCuenta extends javax.swing.JDialog {

    ICuentaBancariaNegocio negocio = new CuentaBancariaNegocio();
    IBeneficiarioNegocio negocioBeneficiario = new BeneficiarioNegocio();
    
    /**
     * Creates new form dlgRegistrarCuenta
     */
    public dlgRegistrarCuenta() {
        super();
        initComponents();
        
        
        try{
        cargarBeneficiariosEnComboBox();
        }
        catch(NegocioException ex){
        }
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
        btnConfirmar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jblBanco = new javax.swing.JLabel();
        jblBanco1 = new javax.swing.JLabel();
        jblBanco2 = new javax.swing.JLabel();
        jblBanco3 = new javax.swing.JLabel();
        campoTextoBanco = new javax.swing.JTextField();
        campoTextoClave = new javax.swing.JTextField();
        campoTextoCuenta = new javax.swing.JTextField();
        ComboBoxBeneficiario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Cuenta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnConfirmar.setBackground(new java.awt.Color(51, 255, 51));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setText("Guardar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

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

        jblBanco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblBanco.setForeground(new java.awt.Color(0, 0, 0));
        jblBanco.setText("Banco");

        jblBanco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblBanco1.setForeground(new java.awt.Color(0, 0, 0));
        jblBanco1.setText("Clave");

        jblBanco2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblBanco2.setForeground(new java.awt.Color(0, 0, 0));
        jblBanco2.setText("Num. Cuenta");

        jblBanco3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jblBanco3.setForeground(new java.awt.Color(0, 0, 0));
        jblBanco3.setText("Beneficiario");

        ComboBoxBeneficiario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblBanco)
                            .addComponent(jblBanco3)
                            .addComponent(jblBanco2)
                            .addComponent(jblBanco1))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoTextoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(97, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblBanco)
                    .addComponent(campoTextoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblBanco1)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblBanco2)
                    .addComponent(campoTextoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblBanco3)
                    .addComponent(ComboBoxBeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        String banco = campoTextoBanco.getText();
        String clave = campoTextoClave.getText();
        String numCuenta = campoTextoCuenta.getText();
        
        CuentaBancariaDTO cuenta = new CuentaBancariaDTO();
        cuenta.setBanco(banco);
        cuenta.setClabe(clave);
        cuenta.setNumeroDeCuenta(numCuenta);
        cuenta.setEliminada(false);
        cuenta.setBeneficiarioId(Long.parseLong(String.valueOf(ComboBoxBeneficiario.getSelectedItem())));
        
        try {
            negocio.crear(cuenta);
            JOptionPane.showMessageDialog(this, "Cuenta agregada");
            this.dispose();
            frmAdministrarCuentas cuent = new frmAdministrarCuentas();
            cuent.setVisible(true);
            
        } catch (NegocioException ex) {
            Logger.getLogger(dlgRegistrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    
    private void cargarBeneficiariosEnComboBox() throws NegocioException {
        List<BeneficiarioDTO> beneficiarios = negocioBeneficiario.obtenerTodos(); // Aquí obtienes los beneficiarios desde la capa de negocio
        ComboBoxBeneficiario.removeAllItems(); // Primero limpias el comboBox
        for (BeneficiarioDTO bene : beneficiarios) {
            ComboBoxBeneficiario.addItem((String.valueOf(bene.getId()))); // Luego agregas cada clasificación al comboBox
        }
}    
    
    
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxBeneficiario;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoBanco;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JTextField campoTextoCuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblBanco;
    private javax.swing.JLabel jblBanco1;
    private javax.swing.JLabel jblBanco2;
    private javax.swing.JLabel jblBanco3;
    // End of variables declaration//GEN-END:variables
}
