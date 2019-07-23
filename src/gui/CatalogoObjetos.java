/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.ObjetoCeleste;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import logica.CellEditor;
import logica.LLenarTabla;
import logica.ReguladorCatalogo;
import logica.Render;

/**
 *
 * @author Gaia F. Braccia
 */
public class CatalogoObjetos extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    
    private LLenarTabla ll= new LLenarTabla();
    /**
     * Creates new form CatalogoObjetos
     */
    public CatalogoObjetos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
       ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon imgFondo= new ImageIcon(this.getClass().getResource("/img/milky.jpg"));
        imgFondo= new ImageIcon(imgFondo.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
        
        JLabel fondo= new JLabel();
        fondo.setIcon(imgFondo);
        
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0, imgFondo.getIconWidth(), imgFondo.getIconHeight());
        pintarTabla("");
        
        
    }
    
    public void pintarTabla(String valor) {
         
        
        String[] titulos = {"Nombre", "tipo", "distancia", "constelacion", "magnitud", "ver"}; //lo asigno directamente desde la base de datos
        
        modelo = new DefaultTableModel(null, titulos);
        tblObjetos.setModel(modelo);
        tblObjetos.getColumnModel().getColumn(5).setCellEditor(new  CellEditor());
        tblObjetos.getColumnModel().getColumn(5).setCellRenderer(new  Render());
        if (valor.equals("") || valor.equals(" ")) {
            //getConnection();
            ll.getConnection(tblObjetos, modelo);
        } else {

            for (ObjetoCeleste ob : ll.getListaObjetos()) {
                switch (valor) {

                    case "estrella":
                        comparar(ob, valor);
                
                    break;
                    
                    case "planeta":
                        comparar(ob, valor);
                    break;

                    case "luna":
                        comparar(ob, valor);
                        break;

                    case "galaxia":
                        comparar(ob, valor);
                        break;

                    case "nebulosa":
                        comparar(ob, valor);
                        break;
                       
                    case "cumulo":
                        comparar(ob, valor);
                        break;
                    
                       
                }

            }

        }
            tblObjetos.setModel(modelo);
            TableColumnModel columnModel = tblObjetos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(30);
    columnModel.getColumn(1).setPreferredWidth(30);
    columnModel.getColumn(2).setPreferredWidth(10);
    columnModel.getColumn(3).setPreferredWidth(10);
    columnModel.getColumn(3).setPreferredWidth(10);
    columnModel.getColumn(4).setPreferredWidth(20);
    columnModel.getColumn(5).setPreferredWidth(5);
    }

    public void comparar(ObjetoCeleste ob, String valor){
       Object[] registro = new Object[6];
    if (ob.getTipoDeObjeto().toLowerCase().contains(valor)) {
        registro[0] = ob.getNombre();
        registro[1] = ob.getTipoDeObjeto();
        registro[2] = ob.getDistancia();
        registro[3] = ob.getConstelacion();
        registro[4] = ob.getMagnitud();
        registro[5] = Boolean.FALSE;
        modelo.addRow(registro);
    }
    //tblObjetos.setModel(modelo);
}
    public void buscar( ArrayList<ObjetoCeleste> lista) {
        
        String[] titulos = {"Nombre", "tipo", "distancia", "constelacion", "magnitud", "ver"}; //lo asigno directamente desde la base de datos
        modelo = new DefaultTableModel(null, titulos);
        tblObjetos.setModel(modelo);
        tblObjetos.getColumnModel().getColumn(5).setCellEditor(new  CellEditor());
        tblObjetos.getColumnModel().getColumn(5).setCellRenderer(new  Render());
        Object[] registro = new Object[6];

         
        for(ObjetoCeleste ob: lista ){

        registro[0] = ob.getNombre();
        registro[1] = ob.getTipoDeObjeto();
        registro[2] = ob.getDistancia();
        registro[3] = ob.getConstelacion();
        registro[4] = ob.getMagnitud();
        registro[5] = Boolean.FALSE;
        modelo.addRow(registro);
        }
        tblObjetos.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        butBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        butCrear = new javax.swing.JButton();
        butVer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbxTipoObjeto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxOrganizar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblObjetos.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        tblObjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblObjetos.setGridColor(new java.awt.Color(0, 0, 0));
        tblObjetos.setSelectionForeground(new java.awt.Color(51, 0, 51));
        tblObjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObjetosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObjetos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 770, 270));

        butBuscar.setText("Buscar");
        butBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(butBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 80, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));

        butCrear.setText("Crear nuevo objeto");
        butCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCrearActionPerformed(evt);
            }
        });
        jPanel1.add(butCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, -1));

        butVer.setText("Ver");
        butVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVerActionPerformed(evt);
            }
        });
        jPanel1.add(butVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 790, 330));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setName("Filtrar"); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTipoObjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estrella", "Planeta", "Luna", "Galaxia", "Cumulo", "Nebulosa", " ", " " }));
        cbxTipoObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoObjetoActionPerformed(evt);
            }
        });
        jPanel2.add(cbxTipoObjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 124, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Organizar según:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        cbxOrganizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Magnitud", "Distancia" }));
        cbxOrganizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrganizarActionPerformed(evt);
            }
        });
        jPanel2.add(cbxOrganizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de objeto:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 270));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Catalogo de objetos celestes ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 680, -1));

        butVolver.setText("Volver");
        butVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVolverActionPerformed(evt);
            }
        });
        getContentPane().add(butVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void cbxOrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrganizarActionPerformed
        // TODO add your handling code here:
        String op= (String) cbxOrganizar.getSelectedItem();
        boolean flag=false;
        if(op.equals("Magnitud")) {flag=true;}
        ArrayList<ObjetoCeleste> lista=ReguladorCatalogo.organizar(ll.getListaObjetos(), flag);
        buscar(lista);
        
    }//GEN-LAST:event_cbxOrganizarActionPerformed

    private void butBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarActionPerformed
        String bus= txtBuscar.getText();
        buscar( ReguladorCatalogo.buscarObj(ll.getListaObjetos(), bus));
        txtBuscar.setText("");
    }//GEN-LAST:event_butBuscarActionPerformed

    private void cbxTipoObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoObjetoActionPerformed
        // TODO add your handling code here:
        String val= (String) cbxTipoObjeto.getSelectedItem();
        pintarTabla(val.toLowerCase());
    }//GEN-LAST:event_cbxTipoObjetoActionPerformed

    private void butVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVolverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu= new MenuPrincipal();
        
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_butVolverActionPerformed

    private void butCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCrearActionPerformed
        // TODO add your handling code here:
       CrearObjeto on= new CrearObjeto();

        on.setVisible(true);
        
    }//GEN-LAST:event_butCrearActionPerformed

    private void butVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVerActionPerformed
        // TODO add your handling code here:
        tblObjetos.getSelectedRow();
        //tblObjetos.get
        
    }//GEN-LAST:event_butVerActionPerformed

    private void tblObjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObjetosMouseClicked
        // TODO add your handling code here:
       int  rown = tblObjetos.rowAtPoint(evt.getPoint());
        
        int column= tblObjetos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tblObjetos.getRowHeight();
        
        if(row< tblObjetos.getRowCount() && row >=0 && column < tblObjetos.getColumnCount() && column >=0){
            Object value= tblObjetos.getValueAt(row, column);
//            if(value instanceof JButton){
//            ((JButton) value).doClick();
//            JButton boton= (JButton) value;
//        }
        
        }
        
    }//GEN-LAST:event_tblObjetosMouseClicked

    
    public static void main(String args[]) {
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatalogoObjetos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoObjetos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoObjetos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoObjetos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoObjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBuscar;
    private javax.swing.JButton butCrear;
    private javax.swing.JButton butVer;
    private javax.swing.JButton butVolver;
    private javax.swing.JComboBox<String> cbxOrganizar;
    private javax.swing.JComboBox<String> cbxTipoObjeto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblObjetos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
