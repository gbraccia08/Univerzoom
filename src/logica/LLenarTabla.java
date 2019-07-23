/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import data.ObjetoCeleste;
import data.Usuario;
import gui.CatalogoObjetos;
import gui.VentanaInicioSesion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gaia F. Braccia
 */
public class LLenarTabla {
    private ArrayList<ObjetoCeleste> listaObjetos = new ArrayList<ObjetoCeleste>();

    public ArrayList<ObjetoCeleste> getListaObjetos() {
        return listaObjetos;
    }
    
    public void getConnection(JTable tblObjetos, DefaultTableModel modelo) {
        
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        Usuario datosUsuario = VentanaInicioSesion.getU();
        int id = datosUsuario.getCed();
        String sql = "SELECT * FROM catalogoDefinitivo";
        Statement st;

//       Class[] types= new Class[]{
//           java.lang.Object.class , java.lang.Object.class , java.lang.Object.class , java.lang.Object.class , java.lang.Object.class , java.lang.Boolean.class , 
//       };
       
        
        Object[] registro = new Object[6];
//        ArrayList<Object> obj= new ArrayList<> ();
//          obj.add(0);  
//          obj.add(0);  
//          obj.add(0);  
//          obj.add(0);  
//          obj.add(0);  
//          obj.add(0);  
        try {
            st = conexion.createStatement();
            ResultSet result = st.executeQuery(sql);

            while (result.next()) {
               if (result.getString(6).equals("0") || Integer.parseInt(result.getString(6)) == id) { for(int i=0; i<6;i++){
                    if(i==5){
                        registro[5]=Boolean.FALSE;
                    }else{
                        registro[i]=result.getString(i+1);
                    }
                }
                
                modelo.addRow(registro);
//                    obj.set(0,result.getString(3));
//                    obj.set(1,result.getString(4));
//                    obj.set(2,result.getString(5));
//                    obj.set(3,result.getString(6));
//                    obj.set(4,result.getString(7));
//                    obj.set(5,);
                    
//                    registro[0] = result.getString(3);
//                    registro[1] = result.getString(4);
//                    registro[2] = result.getString(5);
//                    registro[3] = result.getString(6);
//                    registro[4] = result.getString(7);
//                    registro[5] = Boolean.FALSE;
                 
                    
                    //ObjetoCeleste ob = new ObjetoCeleste(String.valueOf(registro[0]), registro[1], registro[2], registro[3], registro[4]);
                    ObjetoCeleste ob = new ObjetoCeleste(String.valueOf(registro[0]), 
                            String.valueOf(registro[1]), String.valueOf(registro[2]), String.valueOf(registro[3]), String.valueOf(registro[4]));
                    listaObjetos.add(ob);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(CatalogoObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }

        tblObjetos.setModel(modelo);
    }
}
