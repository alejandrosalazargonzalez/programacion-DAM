package es.file.json;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.file.json.dos.Tributo;
import es.file.json.uno.*;

class CaballeroServiceTest {
   
    CaballeroService caballeroService;
    Caballero caballero;

    @BeforeEach 
    void beforeEach() {
        caballeroService = new CaballeroService();
        caballero =  new Caballero(7, "Seila","Pegaso", 10, "2025-02-28");
        caballeroService.add(caballero);
    }

    @AfterEach
    void afterEach() {
        caballeroService.delete(caballero);
        Assertions.assertEquals(4, caballeroService.loadAll().size());
    } 

    @Test
    void caballeroNoEqualsTest() {
        String example = "example";
        Assertions.assertNotEquals(caballero,example);
    }

    @Test
    void addTributoTest() {
        Assertions.assertEquals(5, caballeroService.loadAll().size());
    }

    @Test
    void addTributoNullTest() {
        boolean addTributo = caballeroService.add(null);
        Assertions.assertFalse(addTributo);
    }

    @Test
    void addTributoExistTest() {
        boolean addTributo = caballeroService.add(caballero);
        Assertions.assertFalse(addTributo);
    }

    @Test
    void searchCaballeroByIdTest() {
        Caballero caballeroSearch = caballeroService.findById(caballero.getId());
        Assertions.assertEquals(caballero,caballeroSearch);
    }

    @Test
    void searchTributoByIdNotExistTest() {
        Caballero caballeroSearch = caballeroService.findById(999);
        Assertions.assertNull(caballeroSearch); 
    }

    @Test
    void searchTributoByIdNegativoTest() {
        Caballero caballeroSearch = caballeroService.findById(-1);
        Assertions.assertNull(caballeroSearch); 
    }

    @Test
    void searchTributoDeleteNotExistTest() {
        Caballero caballeroNotExist = new Caballero(999);
        boolean delete = caballeroService.delete(caballeroNotExist);
        Assertions.assertFalse(delete); 
    }

    @Test
    void searchListCaballerosRangeExistTest() {
        List<Caballero> caballeros = caballeroService.findByDateRange("1986-10-11", "1986-10-13");
        Assertions.assertEquals(3, caballeros.size());

    }
}
