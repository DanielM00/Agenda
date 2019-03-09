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
    public static String nombre;
    public static String numero;
    public static String correo;

  
    

    public static String getNombre() {
        return nombre;
    }

    public static String getNumero() {
        return numero;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setNombre(String nombre) {
        Contacto.nombre = nombre;
    }

    public static void setNumero(String numero) {
        Contacto.numero = numero;
    }

    public static void setCorreo(String correo) {
        Contacto.correo = correo;
    }

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero= numero;
    }
  
    
    
}






