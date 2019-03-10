/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author danny
 */



public class Contacto implements Serializable {
    private String nombre;
    private String numero;
    private String correo;
    private int Posición;

    public int getPosición() {
        return Posición;
    }

    public void setPosición(int Posición) {
        this.Posición = Posición;
    }
    

  
    

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public Contacto(String nombre, String numero, String correo) {
        this.nombre = nombre;
        this.numero= numero;
        this.correo= correo;
    }
  
    
    
}






