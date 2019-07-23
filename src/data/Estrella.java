/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.Icon;

/**
 *
 * @author Gaia F. Braccia
 */
public class Estrella extends ObjetoCeleste {
     //atributos
    
    private double luminosidad;
    private String tipoEstrella;
    private String color;
    private double diametro;
    private double temperatura;
    private Icon img;
    //constructor

    public Estrella(  String tipoEstrella,double luminosidad, String color, double diametro, double temperatura, Icon img) {
        
        this.luminosidad = luminosidad;
        this.tipoEstrella = tipoEstrella;
        this.color = color;
        this.diametro = diametro;
        this.temperatura = temperatura;
        this.img=img;
    }

    
    
    
    //encapsulamiento


    public Icon getImg() {
        return img;
    }

    public double getLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(double luminosidad) {
        this.luminosidad = luminosidad;
    }

    public String getTipoEstrella() {
        return tipoEstrella;
    }

    public void setTipoEstrella(String tipoEstrella) {
        this.tipoEstrella = tipoEstrella;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
}
