package es.file.json.dos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TributoService {
    ObjectMapper objectMapper;
    String path = "src/main/resources/tributos.json";
    File file;
    List<Tributo> listTributos;

    /**
     * Constructor
     */
    public TributoService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        if (!file.exists()) {
            try {
                file = new File(path);
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        listTributos = loadAll();
    }

    /**
     * busca un tributo por su id
     * @param id del tributo buscado
     * @return Tributo
     */
    public Tributo findById(int id) {
        Tributo tributoBuscado = new Tributo(id);
        int posicion = listTributos.indexOf(tributoBuscado);
        if (posicion < 0) {
            return null;
        }
        return listTributos.get(posicion);
    }

    /**
     * Busca los tributos en un rango de fechas
     * @param startDate fecha inicio
     * @param endDate fecha final
     * @return List<Tributo>
     */
    public List<Tributo> findByDateRange(String startDate, String endDate) {
        if (startDate == null || startDate.isEmpty() || endDate == null ||
            endDate.isEmpty()) {
            return null;
        }
        List<Tributo> tributoList = new ArrayList<>();
        LocalDate inicio = LocalDate.parse(startDate);
        LocalDate fin = LocalDate.parse(endDate);
        for (Tributo tributo : listTributos) {
            LocalDate fechaTributo = LocalDate.parse(tributo.getFechaSeleccion());
            if (!fechaTributo.isAfter(fin) && !fechaTributo.isBefore(inicio)) {
                tributoList.add(tributo);
            }
        }
        return new ArrayList<>(tributoList);
    }

    /**
     * Saca la lista de tributos
     * @return List<Tributo>
     */
    public List<Tributo> getList() {
        return new ArrayList<>(listTributos);
    }
    
    /**
     * Lee el archivo json y guarda la informacion en una lista
     * @return List<Tributo>
     */
    public List<Tributo> loadAll() {
        List<Tributo> tributosList = new ArrayList<>();
        try {
            tributosList = objectMapper.readValue(file,
                new TypeReference<List<Tributo>>(){});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>(tributosList);
    }
    
    /**
     * Aniade un tributo al fichero
     * @param obj tributo a aniadir
     * @return true/false
     */
    public boolean add(Tributo obj) {
        if (obj == null) {
            return false;
        }
        if (listTributos.contains(obj)) {
            return false;
        }
        boolean insertar = listTributos.add(obj);
        if (insertar) {
            actualizarFile(listTributos);
        }
        return insertar;
    }

    /**
     * elimina a un tributo del fichero
     * @param obj tributo a eliminar
     * @return true/false
     */
    public boolean delete(Tributo obj) {
        if (obj == null) {
            return false;
        }
        if (!listTributos.contains(obj)) {
            return false;
        }
        boolean insertar = listTributos.remove(obj);
        if (insertar) {
            actualizarFile(listTributos);
        }
        return insertar;
    }
    
    /**
     * Escribe la informacion en el fichero
     * @param tributos
     */
    public void actualizarFile (List<Tributo> tributos){
        try {
            objectMapper.writeValue(file, tributos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
