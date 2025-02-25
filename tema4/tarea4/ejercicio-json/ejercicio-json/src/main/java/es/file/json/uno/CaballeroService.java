package es.file.json.uno;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CaballeroService {

    ObjectMapper objectMapper;
    String path = "src/main/resources/caballeros.json";
    File file;
    List<Caballero> listCaballero;

    /**
     * Se inicializa lo declarado anteriormente
     * el objectMapper
     * el file
     * y el listCaballero
     */
    public CaballeroService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        listCaballero = loadAll();
    }

    /**
     * Encuentra un caballero por el id
     * @param id del caballero buscado
     * @return Caballero
     */
    public Caballero findById(int id) {
        if (id < 0) {
            return null;
        }
        Caballero caballeroBuscado = new Caballero(id);
        int posicion = listCaballero.indexOf(caballeroBuscado);
        if (posicion < 0) {
            return null;
        }
        return listCaballero.get(posicion);
    }

    /**
     * Encuentra a los caballeros en un rango de edad
     * @param startDate fecha de inicio
     * @param endDate fecha final
     * @return List<Caballero>
     */
    public List<Caballero> findByDateRange(String startDate, String endDate) {
        if (startDate == null || startDate.isEmpty() || endDate == null ||  
            endDate.isEmpty()) {
            return null;
        }
        List<Caballero> caballeroList = new ArrayList<>();
        LocalDate inico = LocalDate.parse(startDate);
        LocalDate fin = LocalDate.parse(endDate);
        for (Caballero caballero : listCaballero) {
            LocalDate fechaCaballero = LocalDate.parse(caballero.getFechaIngreso());
            if((fechaCaballero.isBefore(fin) || fechaCaballero.equals(fin))
            && (fechaCaballero.isAfter(inico) || fechaCaballero.equals(inico))){
                caballeroList.add(caballero);
            }
        }
        return new ArrayList<>(caballeroList);
    }

    /**
     * Retorna la lisa de caballeros
     * @return List<Caballero> 
     */
    public List<Caballero> getList() {
        return new ArrayList<>(listCaballero);
    }
    
    /**
     * Lee el archivo json y crea una lista con sus caballeros
     * @return List<Caballero>
     */
    public List<Caballero> loadAll() {
        List<Caballero> caballeroList = new ArrayList<>();
        try {
            caballeroList = objectMapper.readValue(file,
                new TypeReference<List<Caballero>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>(caballeroList);
    }
    
    /**
     * Aniade un caballero al archivo
     * @param obj caballero a aniadir
     * @return true/false
     */
    public boolean add(Caballero obj) {
        if (obj == null) {
            return false;
        }
        if (listCaballero.contains(obj)) {
            return false;
        }
        boolean insertar = listCaballero.add(obj);
        if (insertar) {
            saveFile(listCaballero);
        }
        return insertar;
    }

    /**
     * Escribe informacion en el fichero json
     * @param caballeros 
     */
    public void saveFile(List<Caballero> caballeros) {
        try {
            objectMapper.writeValue(file, caballeros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Elimina un caballero del archivo json
     * @param obj caballero a eliminar
     * @return true/false
     */
    public boolean delete(Caballero obj) {
        if (obj == null) {
            return false;
        }
        if (!listCaballero.contains(obj)) {
            return false;
        }
        boolean borrar = listCaballero.remove(obj);
        if (borrar) {
            saveFile(listCaballero);
        }
        return borrar;
    }
}
