/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Gaia F. Braccia
 */
public class Usuario {
    //atributos 
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String contraseña;
    private ArrayList<ObjetoCeleste> catalogoDeObjetosCelestes;
    private int ced;

    //constructor
    public Usuario(String id, String nombre,String apellido, int edad, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.catalogoDeObjetosCelestes=catalogoDeObjetosCelestes;
    }
    
    public Usuario() {
        this.id = " ";
        this.nombre = "";
        this.apellido="";
        this.edad = 0;
        this.correo = "";
        this.contraseña = "";
        
    }
    
    public Usuario(String id, String nombre,String apellido, int edad, String correo, String contraseña, int ced) {
        this.id = id;
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.ced=ced;
        
    }
    
    
    public String getApellido() {
        return apellido;
    }

    //encapsulamiento
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<ObjetoCeleste> getCatalogoDeObjetosCelestes() {
        return catalogoDeObjetosCelestes;
    }

    public void setCatalogoDeObjetosCelestes(ArrayList<ObjetoCeleste> catalogoDeObjetosCelestes) {
        this.catalogoDeObjetosCelestes = catalogoDeObjetosCelestes;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }
    
    public void cambiarDatos(String id,int ced, String nombre,String apellido, int edad, String correo, String contraseña){
       this.setCed(ced);
        this.setId(id);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCorreo(correo);
        this.setContraseña(contraseña);
        
    
    }
    
    
}


