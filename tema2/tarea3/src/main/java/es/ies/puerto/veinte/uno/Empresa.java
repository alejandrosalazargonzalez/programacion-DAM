package es.ies.puerto.veinte.uno;

import es.ies.puerto.nueve.Empleado;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;

    /**
     * Constructor por defecto
     */
    public Empresa() {}

    /**
     * Constructor de la clase
     * @param nombre
     * @param capacidad
     */
    public Empresa(String nombre, int capacidad) {
        this.nombre = nombre;
        this.empleados = new Empleado[capacidad]; 
        this.numEmpleados = 0;
    }

    /**
     * Funcion para agregar un empleado
     * @param empleado a agregar a la lista
     * @return true/false si es agregado o no
     */
    public boolean agregarEmpleado(Empleado empleado) {
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados++] = empleado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Funcion para eliminar un empleado por nombre y puesto
     * @param nombre
     * @param puesto
     * @return
     */
    @Deprecated()
    public boolean eliminarEmpleado(String nombre, String puesto) {
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getNombre().equals(nombre) && empleados[i].getPuesto().equals(puesto)) {
                empleados[i] = empleados[numEmpleados - 1]; // 
                empleados[numEmpleados - 1] = null;
                numEmpleados--;
                return true;
            }
        }

        return false;
    }


    /**
     * Muestra los detalles de la empresa
     */ 
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + empleados.length +
                ", empleadosRegistrados=" + numEmpleados +
                '}';
    }
    
}
