package es.file.json;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.file.json.tres.*;

class HechizoServiceTest {
   
    HechizoService hechizoService;
    Hechizo hechizo;

    @BeforeEach 
    void beforeEach() {
        hechizoService = new HechizoService();
        hechizo = new Hechizo(10, "Expelliarmus", "Defensivo", false, "1899-06-15");

        hechizoService.add(hechizo);
    }

    @AfterEach
    void afterEach() {
        hechizoService.delete(hechizo);
        Assertions.assertEquals(4, hechizoService.loadAll().size());
    } 

    @Test
    void HechizoNoEqualsTest() {
        String example = "example";
        Assertions.assertNotEquals(hechizo,example);
    }

    @Test
    void addHechizoTest() {
        Assertions.assertEquals(5, hechizoService.loadAll().size());
    }

    @Test
    void addHechizoNullTest() {
        boolean addHechizo = hechizoService.add(null);
        Assertions.assertFalse(addHechizo);
    }

    @Test
    void addHechizoExistTest() {
        boolean addHechizo = hechizoService.add(hechizo);
        Assertions.assertFalse(addHechizo);
    }

    @Test
    void searchHechizoByIdTest() {
        Hechizo hechizoSearch = hechizoService.findById(hechizo.getId());
        Assertions.assertEquals(hechizo,hechizoSearch);
        Assertions.assertEquals(hechizo.getEsOscuro(),hechizoSearch.getEsOscuro());
        Assertions.assertEquals(hechizo.getTipo(),hechizoSearch.getTipo());
        Assertions.assertEquals(hechizo.getNombre(),hechizoSearch.getNombre());
        Assertions.assertEquals(hechizo.isEsOscuro(),hechizoSearch.isEsOscuro());

    }

    @Test
    void searchHechizoByIdNotExistTest() {
        Hechizo hechizoSearch = hechizoService.findById(999);
        Assertions.assertNull(hechizoSearch); 
    }

    @Test
    void searchHechizoByIdNegativoTest() {
        Hechizo hechizoSearch = hechizoService.findById(-1);
        Assertions.assertNull(hechizoSearch); 
    }

    @Test
    void searchHechizoDeleteNotExistTest() {
        Hechizo hechizoSearch = new Hechizo(999);
        boolean delete = hechizoService.delete(hechizoSearch);
        Assertions.assertFalse(delete); 
    }

    @Test
    void searchListHechizosRangeExistTest() {
        List<Hechizo> hechizos = hechizoService.findByDateRange("1500-06-11", "1500-06-13");
        Assertions.assertEquals(1, hechizos.size());

    }
}
