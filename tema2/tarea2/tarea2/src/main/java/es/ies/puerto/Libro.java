package es.ies.puerto;

/**
 * Crea una clase Libro con los atributos titulo, autor y paginas.
 *  Usa getters y setters para cada atributo, y asegura que el
 *  número de páginas sea un entero positivo.
 *
 * @author alejandrosalazargonzalez
 * @version 1.0.0
 */
public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    /**
     * constructor vacio
     */
    public Libro() {
    }

    /**
     * Constructor con el titulo del libro
     * @param titulo del libro
     */
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Constructor con el titulo y el autor del libro
     * @param titulo del libro
     * @param autor del libro
     */
    public Libro(String titulo, String autor ){
        this.titulo = titulo;
        this.autor = autor;
    }
    /**
     * Constructor con titulo, autor y paginas del libro
     * @param titulo del libro
     * @param autor del libro
     * @param paginas del libro
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
        if (paginas > 0) {
            this.paginas = paginas;
        } else
        {
            paginasError();
        }
    }

    /**
     * Metodo que imprime mensaje de error
     */
    public void paginasError()
    {
        System.out.println("Este número de paginas no es valido");
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", paginas='" + getPaginas() + "'" +
            "}";
    }


}
