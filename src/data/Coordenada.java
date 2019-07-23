/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Gaia F. Braccia
 */
public class Coordenada {
    //atributos
    private String tipo;
    private double angulo1;
    private double angulo2;
    
    //constructor

    public Coordenada(String tipo, double angulo1, double angulo2) {
        this.tipo = tipo;
        this.angulo1 = Math.toRadians(angulo1);
        this.angulo2 = Math.toRadians(angulo2);
    }
    public Coordenada( double angulo1, double angulo2) {
        
        this.angulo1 = Math.toRadians(angulo1);
        this.angulo2 = Math.toRadians(angulo2);
    }
    
    //encapsulamiento

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }
    
}
