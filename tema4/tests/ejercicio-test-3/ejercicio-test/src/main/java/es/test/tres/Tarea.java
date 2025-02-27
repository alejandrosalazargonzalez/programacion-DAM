package es.test.tres;

public class Tarea {

    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id) {
        if (id < 0 ) {
            throw new IllegalArgumentException("Detalles de la tarea inválidos");
        }
        this.id = id;
    }

    public Tarea(int id, String descripcion) {
        if (id < 0 || descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("Detalles de la tarea inválidos");
        }
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Tarea)) {
            return false;
        }
        Tarea tarea = (Tarea) o;
        return id == tarea.id;
    }
}
