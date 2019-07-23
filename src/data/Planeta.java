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
public class Planeta extends ObjetoCeleste{
    //atributos
    private double velocidadOrbital;
    private double DiaSideral;
    private double diaSolaraMedio;
    private double periodoSiderio;
    private double diametro;
    private ArrayList<Planeta> listaLunas;
    //constructor

    public Planeta(double velocidadOrbital, double DiaSideral, double diaSolaraMedio, double periodoSiderio, double diametro, ArrayList<Planeta> listaLunas) {
        this.velocidadOrbital = velocidadOrbital;
        this.DiaSideral = DiaSideral;
        this.diaSolaraMedio = diaSolaraMedio;
        this.periodoSiderio = periodoSiderio;
        this.diametro = diametro;
        this.listaLunas = listaLunas;
    }

    
     
     
    //encapsulamiento

    public double getVelocidadOrbital() {
        return velocidadOrbital;
    }

    public void setVelocidadOrbital(double velocidadOrbital) {
        this.velocidadOrbital = velocidadOrbital;
    }

    public double getDiaSideral() {
        return DiaSideral;
    }

    public void setDiaSideral(double DiaSideral) {
        this.DiaSideral = DiaSideral;
    }

    public double getDiaSolaraMedio() {
        return diaSolaraMedio;
    }

    public void setDiaSolaraMedio(double diaSolaraMedio) {
        this.diaSolaraMedio = diaSolaraMedio;
    }

    public double getPeriodoSiderio() {
        return periodoSiderio;
    }

    public void setPeriodoSiderio(double periodoSiderio) {
        this.periodoSiderio = periodoSiderio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public ArrayList<Planeta> getListaLunas() {
        return listaLunas;
    }

    public void setListaLunas(ArrayList<Planeta> listaLunas) {
        this.listaLunas = listaLunas;
    }
    
     
}
