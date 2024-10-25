package es.ies.puerto.nueve;

public class Empleado {
    private String nombre; 
    private String puesto; 
    private double salario;

    /**
     * Constructor por defecto
     */
    public Empleado() {}

    /**
     * Constructor del empleado
     * @param nombre del empleado 
     * @param puesto del empleado
     * @param salario del empleado
     */
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Metodo para aumentar el salario en un porcentaje
     * @param porcentaje
     */
    public void aumentarSalario(float porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                 // Si son el mismo objeto, son iguales
        if (obj == null || getClass() != obj.getClass()) return false; // Si no es Empleado, no es igual
        
        Empleado otroEmpleado = (Empleado) obj;        // Convertimos el objeto a Empleado
        return nombre.equals(otroEmpleado.nombre) && puesto.equals(otroEmpleado.puesto);
    }

    /**
     * toString() para mostrar la información del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Salario=" + salario +
                '}';
    }

  
}
