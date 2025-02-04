package es.ies.puerto.primera_explicacion;


import es.ies.puerto.primera_explicacion.model.Persona;
import es.ies.puerto.primera_explicacion.model.fichero.OperacionesFichero;



public class EjemploFile {
    
    public static void main(String[] args) {
        OperacionesFichero operaciones = new OperacionesFichero();
        Persona persona = new Persona("00000000H", "dios", 10000);
        //System.out.println(persona);
        boolean insertar = operaciones.create(persona);
        if (insertar) {
            System.out.println("Se ha insertado correctamente");
        }  else{
            System.out.println("No se ha insertado el elemento");
        }
        Persona personaBuscar = new Persona("00000000H");
        personaBuscar = operaciones.search(personaBuscar);
        System.out.println("Persona encontrada: " + personaBuscar);
        Persona personaBuscar2 = new Persona("00000000H","Dios2",200000);
        operaciones.update(personaBuscar2);
        

    }    
}