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
public class Mes {
    private Dia [][] mes;
    private String nombre;
    private int num;

    public Mes(Dia[][] mes, String nombre, int num) {
        this.mes = new Dia[4][7] ;
        this.nombre = nombre;
        this.num = num;
    }

    public Dia[][] getMes() {
        return mes;
    }

    public void setMes(Dia[][] mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
}
