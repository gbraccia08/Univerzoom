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
public class ObjetoCeleste {
    //atributos 
    private String tamaño;
    private String nombre;
    private String magnitud;
    private String constelacion;
    private String distancia;
    
    private String tipoDeObjeto;
    private String coordenadaEcuatorial;
    private String coordenadaEcliptica;

    //constructor

    public ObjetoCeleste(String nombre,String tipoDeObjeto, String distancia , String constelacion,String magnitud) {
       
        this.nombre=nombre;
        this.magnitud = magnitud;
        this.constelacion = constelacion;
        this.distancia = distancia;
        
        this.tipoDeObjeto = tipoDeObjeto;
        
    }
     public ObjetoCeleste() {
       
        this.nombre=" ";
        this.magnitud = " ";
        this.constelacion = " ";
        this.distancia = " ";
        
        this.tipoDeObjeto = " ";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    
    //encapsulamiento

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getConstelacion() {
        return constelacion;
    }

    public void setConstelacion(String constelacion) {
        this.constelacion = constelacion;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

   
    public String getTipoDeObjeto() {
        return tipoDeObjeto;
    }

    public void setTipoDeObjeto(String tipoDeObjeto) {
        this.tipoDeObjeto = tipoDeObjeto;
    }

    public String getCoordenadaEcuatorial() {
        return coordenadaEcuatorial;
    }

    public void setCoordenadaEcuatorial(String coordenadaEcuatorial) {
        this.coordenadaEcuatorial = coordenadaEcuatorial;
    }

    public String getCoordenadaEcliptica() {
        return coordenadaEcliptica;
    }

    public void setCoordenadaEcliptica(String coordenadaEcliptica) {
        this.coordenadaEcliptica = coordenadaEcliptica;
    }
    
    
   public void crearNuevoObjeto(ArrayList<ObjetoCeleste> catalogo,String tamaño,
     String magnitud, String constelacion, String distancia, String salida,
     String puesta,  String tipoDeObjeto,String coordenadaEcuatorial,String coordenadaEcliptica){
      
        ObjetoCeleste nuevo = new ObjetoCeleste(tipoDeObjeto, constelacion, magnitud,  distancia, tamaño);
        catalogo.add(nuevo);
    }
    
    public void eliminarObjeto(ObjetoCeleste objeto, ArrayList<ObjetoCeleste> catalogo){
        catalogo.remove(objeto);
    }
    
    public void verDatosObjeto(ObjetoCeleste objeto){
        objeto.toString();
        
    }
    public void editarDatosObjeto(ObjetoCeleste objeto,String tamaño,
   String magnitud, String constelacion, String distancia, String salida,
     String puesta,  String tipoDeObjeto,String coordenadaEcuatorial,String coordenadaEcliptica){
        
        objeto.setTamaño(tamaño);
        
        objeto.setMagnitud(magnitud);
        objeto.setConstelacion(constelacion);
        objeto.setDistancia(distancia);
        
        objeto.setTipoDeObjeto(tipoDeObjeto);
        objeto.setCoordenadaEcuatorial(coordenadaEcuatorial);
        objeto.setCoordenadaEcliptica(coordenadaEcliptica);
        
    }
    
    @Override
    public String toString(){
        return tipoDeObjeto+"\t"+tamaño+"\t"+magnitud+"\t"+constelacion+"\t"+distancia+"\t"+coordenadaEcuatorial+"\t"+coordenadaEcliptica;    
    }
}
