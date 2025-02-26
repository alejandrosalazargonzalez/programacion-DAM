package es.file.json.caballeros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        listCaballero = loadJson();
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
    public List<Caballero> loadJson() {
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
     * Escribe informacion en el fichero json
     * @param caballeros 
     */
    public void saveFileJson(List<Caballero> caballeros) {
        try {
            objectMapper.writeValue(file, caballeros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Escribe informacion en el fichero csv
     * @param caballero
     */
    public void saveFileCsv(Caballero caballero) {
        List<Caballero> caballeros = loadJson();
        if (!caballeros.contains(caballero)) {
            saveFileCsv(caballero.toString());
        }
    }

    /**
     * Escribe informacion en el fichero csv
     * @param caballeros 
     */
    public void saveFileCsv(String caballero) {
        File fileCsv = new File("src\\main\\resources\\caballeros.json");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileCsv, true))) {
            writer.write(caballero);
            writer.newLine();
            System.out.println("Registro agregado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Actualiza la informacion de un caballero en el fichero
     * @param caballero
     * @return
     */
    public boolean update(Caballero caballero) {
        if (caballero == null || caballero.getId() < 0 ) {
            return false;
        }
        List<Caballero> caballeros = loadCsv(file);
        if (!caballeros.contains(caballero)) {
            return false;
        }
        for (Caballero caballeroBuscada : caballeros) {
            if (caballeroBuscada.equals(caballero)) {
                caballeros.remove(caballeroBuscada);
                caballeros.add(caballero);
                return updateFile(caballeros, file);
            }
        }
        System.out.println(caballeros);
        return true;
    }

    /**
     * Actualiza el fichero indicado con la informacion de la lista
     * @param caballeros
     * @param file
     * @return
     */
    private boolean updateFile(List<Caballero> caballeros, File file){
        try {
            file.delete();
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }
        for(Caballero caballero : caballeros) {
            saveFileCsv(caballero);
        }
        return true;
    }

    /**
     * Carga el fichero csv en una lista
     * @param file
     * @return
     */
    public List<Caballero> loadCsv(File file) {
        List<Caballero> caballeros = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Caballero caballero = new Caballero(Integer.valueOf(arrayLine[0]),arrayLine[1],arrayLine[2],Integer.valueOf(arrayLine[3]),arrayLine[4]);
                caballeros.add(caballero);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caballeros;
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
            saveFileJson(listCaballero);
        }
        return insertar;
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
            saveFileJson(listCaballero);
        }
        return borrar;
    }
}
