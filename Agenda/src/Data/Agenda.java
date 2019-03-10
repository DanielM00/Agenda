package Data;

import java.io.Serializable;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Agenda implements Serializable {

    private static Contacto Contacticos[];
    public static HashMap<String, Contacto> contactos = new HashMap<>();

    public static Contacto[] getContacticos() {
        return Contacticos;
    }

    public static void setContacticos(Contacto[] Contacticos) {
        Agenda.Contacticos = Contacticos;
    }

    public static HashMap<String, Contacto> getContactos() {
        return contactos;
    }

    public static void setContactos(HashMap<String, Contacto> contactos) {
        Agenda.contactos = contactos;
    }

    public static void AñadirContacto(Contacto Contacto1) {

        Contacto put = Agenda.contactos.put(Contacto1.getNombre(), Contacto1);

    }

    public static void CargarMiAgenda() {
        FileInputStream Cargando;
        Contacto Contactoi;
        boolean leyendo=true;
        LimpiarAgendaActual();
        try {

            Cargando = new FileInputStream("MiAgenda");
            ObjectInputStream os = new ObjectInputStream(Cargando);
            
            do{
            try{Object Contactou = os.readObject();
            Contactoi = (Contacto) Contactou;
            AñadirContacto(Contactoi);}
            catch(IOException | ClassNotFoundException e){
                leyendo=!leyendo;
                System.out.println("No hay qué leer");
            }
            }while(leyendo);
            
            
            os.close();
        } catch (IOException a) {
            System.out.println("No se pudo cargar la agenda");
        }
        
        for (Contacto Contactoj : contactos.values()) {
            System.out.println("Nombre " + Contactoj.getNombre() + "\nNumero " + Contactoj.getNumero() + "\nCorreo " + Contactoj.getCorreo());
            System.out.println("\n");
        }
    }

    public static void GuardarMiAgenda() {

        FileOutputStream Guardando;

        try {
            Guardando = new FileOutputStream("MiAgenda");

            ObjectOutputStream os = new ObjectOutputStream(Guardando);
            for (Contacto Contactoi : contactos.values()) {
                os.writeObject(Contactoi);
            }
            os.close();

        } catch (Exception E) {
            System.out.println("No se pudo guardar la agenda");
        }
    }

    public static void LimpiarAgendaActual() {
         contactos.clear();
    }
}
