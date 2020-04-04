/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class Membresia {
    private boolean pagada;
    private Fecha fechaInicio;
    private boolean activa;

    public boolean esPagada() {
        return pagada;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public boolean esActiva() {
        return activa;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
    
    
}
