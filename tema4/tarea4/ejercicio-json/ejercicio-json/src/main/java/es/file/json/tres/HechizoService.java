package es.file.json.tres;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HechizoService   {
    ObjectMapper objectMapper;
    String path = "src/main/resources/hechizos.json";
    File file;
    List<Hechizo> listHechizos;
    
    /**
     * Constructor
     */
    public HechizoService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        listHechizos = loadAll();
    }

    /**
     * Busca un hechizo por su id
     * @param id del hechizo
     * @return Hechizo/null
     */
    public Hechizo findById(int id) {
        if (id < 0) {
            return null;
        }
        Hechizo hechizoBuscado = new Hechizo(id);
        int posicion = listHechizos.indexOf(hechizoBuscado);
        if (posicion < 0) {
            return null;
        }
        return listHechizos.get(posicion);
    }

    /**
     * Lista los hechizos por su fecha
     * @param startDate fecha inicia
     * @param endDate fecha fin
     * @return List<Hechizo>
     */
    public List<Hechizo> findByDateRange(String startDate, String endDate) {
        if (startDate == null || startDate.isEmpty() || endDate == null ||  
            endDate.isEmpty()) {
            return null;
        }
        List<Hechizo> hechizosList = new ArrayList<>();
        LocalDate inico = LocalDate.parse(startDate);
        LocalDate fin = LocalDate.parse(endDate);
        for (Hechizo hechizo : listHechizos) {
            LocalDate fechaHechizo = LocalDate.parse(hechizo.getFechaCreacion());
            if(!fechaHechizo.isBefore(inico)&& !fechaHechizo.isAfter(fin)){
                hechizosList.add(hechizo);
            }
        }
        return new ArrayList<>(hechizosList);
    }

    /**
     * retorna una lista de hechizos
     * @return List<Hechizo>
     */
    public List<Hechizo> getList() {
        return new ArrayList<>(listHechizos);
    }
    
    /**
     * lee el fichero
     * @return List<Hechizo>
     */
    public List<Hechizo> loadAll() {
        List<Hechizo> hechizosList = new ArrayList<>();
        try {
            hechizosList = objectMapper.readValue(file,
                new TypeReference<List<Hechizo>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>(hechizosList);
    }
    
    /**
     * aniade un hechizp al fichero
     * @param obj hechizo a aniadir
     * @return true/false
     */
    public boolean add(Hechizo obj) {
        if (obj == null) {
            return false;
        }
        if (listHechizos.contains(obj)) {
            return false;
        }
        boolean insertar = listHechizos.add(obj);
        if (insertar) {
            guardarFile(listHechizos);
        }
        return insertar;
    }

    /**
     * elimina un hechizo de la lista
     * @param obj hechizo a borrar
     * @return true/false
     */
    public boolean delete(Hechizo obj) {
        if (obj == null) {
            return false;
        }
        if (!listHechizos.contains(obj)) {
            return false;
        }
        boolean insertar = listHechizos.remove(obj);
        if (insertar) {
            guardarFile(listHechizos);
        }
        return insertar;    
    }
    
    /**
     * Escribe informacion en el fichero json
     * @param hechizos 
     */
    public void guardarFile(List<Hechizo> hechizos) {
        try {
            objectMapper.writeValue(file, hechizos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
