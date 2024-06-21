/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JPasswordField;


/**
 *
 * @author Arturo ITSON
 */
public class frmIniciarSesion extends javax.swing.JFrame {


   
    public frmIniciarSesion() {
       initComponents();
        campoTextoUsuario1.setEditable(true);
        
        // Agregar ActionListener al botón Administrador
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
         // Agregar ActionListener al botón Ingresar
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        // Agregar un WindowListener para detectar cuando la ventana se abre
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowOpened(WindowEvent e) {
            // Ajustar el color del texto del campo de usuario
            campoTextoUsuario1.setForeground(Color.BLACK); // Cambia el color del texto a negro
        }
    }); 
    

      
    }

    public String getUsuario() {
        return campoTextoUsuario1.getText();
    }

    public String getContrasena() {
        return campoTextoContraseña.getText();
    }

    public JTextField getCampoTextoContraseña() {
        return campoTextoContraseña;
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
        campoTextoContraseña = new javax.swing.JTextField();
        campoTextoUsuario1 = new javax.swing.JTextField();
        jblUsuario = new javax.swing.JLabel();
        jblContraseña = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoTextoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        campoTextoContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoTextoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoContraseñaActionPerformed(evt);
            }
        });

        campoTextoUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        campoTextoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        campoTextoUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoTextoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario1ActionPerformed(evt);
            }
        });

        jblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblUsuario.setText("Usuario");

        jblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblContraseña.setText("Contraseña");

        btnAdmin.setBackground(new java.awt.Color(23, 154, 249));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnAdmin.setText("Administrador");
        btnAdmin.setBorder(null);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnIngresar.setBackground(new java.awt.Color(23, 154, 249));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTextoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jblContraseña)
                        .addGap(284, 284, 284))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTextoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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

    private void campoTextoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoContraseñaActionPerformed

    private void campoTextoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario1ActionPerformed
private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {
 
       frmInicioAdmin adminFrame = new frmInicioAdmin();
        adminFrame.setVisible(true);
        this.dispose(); 
    }
    /**
     * @param args the command line arguments
     */
 private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {
      
// Verificar si el usuario y la contraseña son correctos
        String usuario = campoTextoUsuario1.getText();
        String contrasena = campoTextoContraseña.getText();

        if (usuario.equals("usuario") && contrasena.equals("1234")) { // Ejemplo de validación
            // Abrir el formulario frmInicioUsuario
            frmInicioUsuario usuarioFrame = new frmInicioUsuario();
            usuarioFrame.setVisible(true);
            this.dispose(); // Cierra el formulario actual
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

  public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmIniciarSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField campoTextoContraseña;
    private javax.swing.JTextField campoTextoUsuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblContraseña;
    private javax.swing.JLabel jblUsuario;
    // End of variables declaration//GEN-END:variables
}
