/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import data.Usuario;
import gui.MenuPrincipal;
import gui.VentanaRegistro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaia F. Braccia
 */
public class ReguladorUsuario {
    
    
    private static boolean esNumerico(String cadena ){
	try {
		Integer.parseInt(cadena);
		return true;
                
	} catch (NumberFormatException nfe){
		        System.out.println("Error, Asegurese de que sea un numero entero");
                return false;
	}
       
    }
    
    public static boolean validar(String usuario) {

        Conexion men1 = new Conexion();
        Conexion con = new Conexion();

        try {

            Statement comando = con.getConnection().createStatement();
            //comando.executeQuery("SELECT * FROM usuarios where usuario='"+usuario+"' and contraseña='"+cont+"'");
            //String a="SELECT * FROM usuarios where usuario='"+usuario+"' and contraseña='"+cont+"'";
            VentanaRegistro reg = new VentanaRegistro();
            ResultSet rs = comando.executeQuery("SELECT * FROM usuarios ");
            while (rs.next()) {
                if (usuario.equals(rs.getString(6))) {
                    JOptionPane.showMessageDialog(reg, "Usuaio ya existente", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "eror  " + ex);

        }
        return true;

    }
    
     public static boolean validarUsuario(String correo,HashMap<String,Usuario> usuarios ){
        boolean v=false;
        if(usuarios.containsKey(correo)){
            v= true; 
        }
        return v;
    }
    
     
     //validar si la contraseña existe  
    public static boolean validarContraseña(String contraseña, String correo, HashMap<String,Usuario> u ){
        boolean r=false;
        if(u.get(correo).getContraseña().equals(contraseña)){
             r= true;
        }
        return r;
    } 
    
    public static boolean esCorreo(String correo){
        boolean v=false;
        if (correo.endsWith(".com")&& correo.contains("@")){
            v=true;
        }
        return v;
    }
    
    public void eliminarUsuario(HashMap<String,Usuario> u, Usuario us){
        u.remove(us);
    }
    
    public void consultarCuenta(){
        
    }
}
