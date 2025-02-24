package es.file.json.uno;

import java.io.File;
import java.io.IOException;
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
        listCaballero = loadAll();
    }

    /**
     * Encuentra un caballero por el id
     * @param id del caballero buscado
     * @return Caballero
     */
    public Caballero findById(int id) {
        return null;
    }

    /**
     * Encuentra a los caballeros en un rango de edad
     * @param startDate fecha de inicio
     * @param endDate fecha final
     * @return List<Caballero>
     */
    public List<Caballero> findByDateRange(String startDate, String endDate) {
        return null;
    }

    public List<Caballero> getList() {
        return null;
    }
    
    public List<Caballero> loadAll() {
        List<Caballero> caballeroList = new ArrayList<>();
        try {
            listCaballero = objectMapper.readValue(file, new TypeReference<List<Caballero>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>(caballeroList);
    }
    
    public boolean add(Caballero obj) {
        return false;
    }

    public boolean delete(Caballero obj) {
        return false;
    }
        
    
}
