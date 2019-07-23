/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;



import data.Usuario;
import gui.VentanaInicioSesion;

import java.util.HashMap;

/**
 *
 * @author Gaia F. Braccia
 */
public class Univerzoom {

    
    private static HashMap<String, Usuario> mapUsuarios= new HashMap<>();
   

    public static HashMap getMapUsuarios() {
        return mapUsuarios;
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
