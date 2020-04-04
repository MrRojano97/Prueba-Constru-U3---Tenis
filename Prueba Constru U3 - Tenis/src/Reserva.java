/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class Reserva {
    
    private int cancha;
    private Fecha fecha;
    private float coste;
    private Sujeto sujeto;

    public int getCancha() {
        return cancha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public float getCoste() {
        return coste;
    }

    public void setCancha(int cancha) {
        this.cancha = cancha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public void setSujeto(Sujeto sujeto) {
        this.sujeto = sujeto;
    }
    
    
    
    
}
