package es.ies.puerto;

/**
 * Ejercicio 15
 * Crea una clase Producto con los atributos nombre,
 *  precio y stock. El precio no puede ser negativo
 * y el stock debe ser al menos 0.
 *
 * Ejercicio 16
 * Añade a la clase Producto un método para vender
 *  productos, que disminuya el stock y retorne el
 *  total de la venta.
 *
 * @author alejandrosalazargonzalez
 * @version 1.1.0
 */
public class Producto {
    
    private String nombre;
    private float preciof;
    private int stock;

    /**
     * Constructor vacio
     */
    public Producto() {
    }

    /**
     * Constructor con el nombre
     * @param nombre del producto
     */
    public Producto( String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Constructor con el nombre y el precio
     * @param nombre del producto
     * @param preciof del producto
     */
    public Producto(String nombre, float preciof)
    {
        this.nombre = nombre;
        setPreciof(preciof);
    }
    
    /**
     * Constructor con el nombre, el precio y el stock
     * @param nombre del producto
     * @param preciof del producto
     * @param stock del producto
     */
    public Producto(String nombre, float preciof, int stock) {
        this.nombre = nombre;
        setPreciof(preciof);
        setStock(stock);
    }

    //Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPreciof() {
        return this.preciof;
    }

    public void setPreciof(float preciof) {
        if (preciof > 0)
        {
            this.preciof = preciof;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else
        {
            sinStock();
        }
    }

    /**
     * Metodo venta que retorna el valor de la ventea y
     *  resta las unidades vendidas al stock
     * @param unidades
     * @return precio de la venta
     */
    public float venta(int unidades)
    {
        setStock(getStock() - unidades);

        return getPreciof() * unidades;
    }

    public void sinStock()
    {
        System.out.println("No hay stock");
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", preciof='" + getPreciof() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }

}
