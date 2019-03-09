/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Agenda implements Serializable {
    
    ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
    public void AñadirContacto (){
       // Contacto Contact= new Contacto();
    }
    
     public void EliminarContacto (){
    
    }
     
      public void CargarMiAgenda (){
    
    }
      
       public void GuardarMiAgenda (){
    
    }
}

