package es.ies.puerto.segunda_explicacion.model;

public class Empleado extends Persona {
    private double salarioBase;
    private String puesto;

    /**
     * Constructor que llama al constructor con identificador de la clase padre
     * @param identificador
     */
    public Empleado(String identificador) {
        super(identificador);
    }

    /**
     * Constructor de esta clase y la de la clase padre
     * @param identificador
     * @param nombre
     * @param salarioBase
     * @param puesto
     */
    public Empleado(String identificador,String nombre,double salarioBase, String puesto) {
        super(identificador, nombre);
        this.salarioBase = salarioBase;
        this.puesto = puesto;
    }

}
