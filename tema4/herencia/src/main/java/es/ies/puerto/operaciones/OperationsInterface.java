package es.ies.puerto.operaciones;

import java.io.File;
import java.util.Set;

import es.ies.puerto.Empleado;

public interface OperationsInterface {
    public boolean create(Empleado empleado);
    public boolean create(File file, Set<Empleado> empleados);
    public Set<Empleado> read(File file);
    public boolean delete(String dataToDelete,File file);

}
