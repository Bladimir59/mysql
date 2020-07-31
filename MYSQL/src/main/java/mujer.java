/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bladimir
 */
public class mujer extends persona{
    
    private int bellesa;
    
    public mujer(String cui, String nombre, int edad,int bellesa) {
        super(cui, nombre, edad);
    }
   
    public int getBellesa() {
        return bellesa;
    }

    public void setBellesa(int bellesa) {
        this.bellesa = bellesa;
    }
    
}
