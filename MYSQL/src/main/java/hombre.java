/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bladimir
 */
public class hombre extends persona{
    
    private int fuerza;
    public hombre(String cui, String nombre, int edad) {
        super(cui, nombre, edad);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
     
}
