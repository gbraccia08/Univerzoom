/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author nicom
 */
public class Evento {
    private String fecha;
    private String hora;
    private String evento;
    private int nUsuario;
    private String index;

    public Evento(String fecha, String hora, String evento,int nUsuario) {
        this.fecha = fecha;
        this.hora = hora;
        this.evento = evento;
        this.nUsuario = nUsuario;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Evento(String fecha, String evento) {
        this.fecha = fecha;
        this.evento = evento;
    }
    
    public Evento(String fecha, String hora, String evento) {
        this.fecha = fecha;
        this.hora = hora;
        this.evento = evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(int nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return fecha+","+hora+","+evento+","+nUsuario+"\n";
    }
    
    
}
