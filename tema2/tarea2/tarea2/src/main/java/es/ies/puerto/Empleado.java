package es.ies.puerto;

/**
 * Ejercicio 8
 * Crea una clase Empleado con los atributos nombre,
 *  puesto y salario. Usa getters y setters para cada
 *  atributo. El salario no puede ser negativo.
 *
 * Ejercicio 9
 * Modifica la clase Empleado para que el setter de
 * puesto no permita valores vacíos o nulos.
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Empleado {

    private String nombre;
    private String puesto;
    private float salario;

    /**
     * constructor vacío
     */
    public Empleado() {
    }

    /**
     * Constructor con el nombre del empleado
     * @param nombre del empleado
     */
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con el nombre y el puesto del empleado
     * @param nombre del empleado
     * @param puesto del empleado
     */
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        setPuesto(puesto);;
    }

    /**
     * Constructor con el nombre, el puesto y el salario del empleado
     * @param nombre del empleado
     * @param puesto del empleado
     * @param salario del empleado
     */
    public Empleado(String nombre, String puesto, float salario) {
        this.nombre = nombre;
        setPuesto(puesto);
        setSalario(salario);
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    //ejercicio9
    public void setPuesto(String puesto) {
        if (!puesto.equals(" "))
        {
            this.puesto = puesto;
        }else
        {
            puestoError();
        }
    }

    public float getSalario() {
        return this.salario;
    }

    //ejercicio8
    public void setSalario(float salario)
    {
        if (salario > 0.0f)
        {
            this.salario = salario;
        } else
        {
            salarioError();
        }
    }

    /**
     * Metodo que retorna texto e error
     * Ejercicio 8
     */
    public void salarioError()
    {
        System.out.println("El salario no puede ser negativo");
    }

    /**
     * Metodo que retorna texto de error
     * Ejercicio 9
     */
    public void puestoError()
    {
        System.out.println("El empleado debe tener un puesto");
    }

    /**
     * Metodo toStrig para imprimir los valores en pantalla
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", puesto='" + getPuesto() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }

    
}
