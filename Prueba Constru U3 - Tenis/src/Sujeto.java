/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class Sujeto {
    private boolean socio;
    private float multa;
    private Reserva reserva;
    private Membresia membresia;

    public Sujeto(boolean socio, float multa, Reserva reserva, Membresia membresia) {
        this.socio = socio;
        this.multa = multa;
        this.reserva = reserva;
        this.membresia = membresia;
    }
    
    public void multar (float multa) {
        
    }
    
    public void actualizarInteresMensual(){
        
    }

    public float getMulta() {
        return multa;
    }
    
    public boolean esSocio() {
        return socio;
    }
    
    
    
    
}
