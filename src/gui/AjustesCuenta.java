/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import data.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Conexion;

/**
 *
 * @author Gaia F. Braccia
 */
public class AjustesCuenta extends javax.swing.JFrame {
    Usuario datosUsuario = VentanaInicioSesion.getU();
    /** Creates new form AjustesCuenta */
    public AjustesCuenta() {
        initComponents();
        obtenerDatosUsuario();
        desactivar(false);
    }
    
    public void desactivar(boolean f){
        txtUsuario.setEnabled(f);
        txtApellido.setEnabled(f);
        txtCorreo.setEnabled(f);
        txtEdad.setEnabled(f);
        txtNombre2.setEnabled(f);
        txtContraseña.setEnabled(f);
    }
    
    public void obtenerDatosUsuario() {
        

        

        txtNombre2.setText(datosUsuario.getNombre());
        txtApellido.setText(datosUsuario.getApellido());
        txtCorreo.setText(datosUsuario.getCorreo());
        txtEdad.setText(String.valueOf(datosUsuario.getEdad()));
        txtUsuario.setText(datosUsuario.getId());
        txtContraseña.setText("*******");

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labAngulo2 = new javax.swing.JLabel();
        labAngulo5 = new javax.swing.JLabel();
        labAngulo7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labAngulo13 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labAngulo4 = new javax.swing.JLabel();
        labAngulo8 = new javax.swing.JLabel();
        labAngulo14 = new javax.swing.JLabel();
        butVolver = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        butEditar = new javax.swing.JButton();
        butGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labAngulo2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        labAngulo2.setText("Edad:");
        jPanel1.add(labAngulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        labAngulo5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        labAngulo5.setText("Apellido:");
        jPanel1.add(labAngulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        labAngulo7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        labAngulo7.setText("Correo:");
        jPanel1.add(labAngulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ajustes de cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 350, -1));

        labAngulo13.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labAngulo13.setText("Datos de usuario:");
        jPanel1.add(labAngulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 20));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 190, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 50, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, -1));

        labAngulo4.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labAngulo4.setText("Datos de cuenta:");

        labAngulo8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        labAngulo8.setText("  Nombre de usuario:");

        labAngulo14.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        labAngulo14.setText("Contraseña:");

        butVolver.setText("Volver");
        butVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVolverActionPerformed(evt);
            }
        });

        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));

        butEditar.setText("Editar datos");
        butEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEditarActionPerformed(evt);
            }
        });

        butGuardarCambios.setText("Guardar cambios");
        butGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labAngulo4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(butVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(butGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labAngulo8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(labAngulo14)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtUsuario))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labAngulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAngulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAngulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butVolver)
                    .addComponent(butEditar)
                    .addComponent(butGuardarCambios))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVolverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu= new MenuPrincipal();

        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_butVolverActionPerformed

    private void butGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGuardarCambiosActionPerformed
        // TODO add your handling code here:
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        
        
        
        String nombre = txtNombre2.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String edad = txtEdad.getText();
        String usuario=txtUsuario.getText();
        String cont= new String(txtContraseña.getText());
        int id=datosUsuario.getCed();
        System.out.println(id);
        String sql = "UPDATE usuarios SET nombre=?, apellido=?, correo=?, edad=?, usuario=?, contraseña=? , WHERE id_usuario ='"+id+"'";

        Statement st;
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog (null, "Está seguro de que quiere cambiar los datos?","Warning",dialogButton); 
       
       if (dialogButton == JOptionPane.YES_OPTION) {
          
        try{ 
           
           st = conexion.createStatement();
           //ResultSet rs = st.executeQuery(sql);
           PreparedStatement rs = conexion.prepareStatement(sql);
           
           rs.setString(1, String.valueOf(id));
           rs.setString(2, nombre);
           rs.setString(3, apellido);
           rs.setString(4, correo);
           rs.setString(5, edad);
           rs.setString(6, usuario);
           
           desactivar(true);
           
           
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
        desactivar(false);
    }//GEN-LAST:event_butGuardarCambiosActionPerformed

    private void butEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEditarActionPerformed
        // TODO add your handling code here:
        desactivar(true);
        butEditar.setEnabled(false);
    }//GEN-LAST:event_butEditarActionPerformed

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
            java.util.logging.Logger.getLogger(AjustesCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjustesCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjustesCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjustesCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjustesCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butEditar;
    private javax.swing.JButton butGuardarCambios;
    private javax.swing.JButton butVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labAngulo13;
    private javax.swing.JLabel labAngulo14;
    private javax.swing.JLabel labAngulo2;
    private javax.swing.JLabel labAngulo4;
    private javax.swing.JLabel labAngulo5;
    private javax.swing.JLabel labAngulo7;
    private javax.swing.JLabel labAngulo8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
