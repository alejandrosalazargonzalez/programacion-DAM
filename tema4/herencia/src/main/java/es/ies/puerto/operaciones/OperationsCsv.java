package es.ies.puerto.operaciones;

import java.io.File;
import java.util.Set;

import es.ies.puerto.Empleado;

public class OperationsCsv implements OperationsInterface{

    String path;
    File fichero;
    
    public OperationsCsv(){
        fichero = new File(path);
        if (!fichero.isFile()) {
            throw new IllegalArgumentException("El path: "+path+", no es un fichero");
        }
    }
    @Override
    public boolean create(Empleado empleado) {
        return create(empleado.toString(), fichero);
    }

    @Override
    public boolean create(File file, Set<Empleado> empleados) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Set<Empleado> read(File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public boolean delete(String dataToDelete, File file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }}