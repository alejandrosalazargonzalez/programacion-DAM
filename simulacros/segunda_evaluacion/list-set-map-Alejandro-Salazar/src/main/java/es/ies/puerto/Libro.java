package es.ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn; 

    /**
     * Constructor por defecto
     */
    public Libro() {
    }

    /**
     * Constructor con todos los atributos
     * @param titulo del libro
     * @param autor del libro
     * @param isbn del libro
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    /**
     * Constructor con solo el ISBN
     * @param isbn del libro
     */
    public Libro(String isbn) {
        this.isbn = isbn;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
