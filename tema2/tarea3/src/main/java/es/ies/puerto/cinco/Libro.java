package es.ies.puerto.cinco;

/**
 * Define una clase Libro con atributos titulo,
 *  autor y paginas. Crea varios constructores
 *  para inicializar diferentes combinaciones
 *  de estos atributos. Implementa toString()
 *  para devolver una descripción del libro.
 * 
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Constructor vacio
     */
    public Libro() {
    }

    /**
     * Constructor solo con el titulo
     * @param titulo
     */
    public Libro(String titulo)
    {
        this.titulo = titulo;
    }

    /**
     * Constructor con el titulo y el autor
     * @param titulo
     * @param autor
     */
    public Libro(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Constructor con titulo y paginas
     * @param titulo
     * @param paginas
     */
    public Libro(String titulo, int paginas)
    {
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    /**
     * Constructor completo
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Metodo toString que muestra la descripcion del libro
     */
    @Override
    public String toString() {
        return "El libro"  + getTitulo() +
            " escrito por" + getAutor() +
            " tiene" + getPaginas() + " páginas";
    }

}
