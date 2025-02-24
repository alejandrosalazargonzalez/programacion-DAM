package es.file.json;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.file.json.dos.*;

class TributoServiceTest {
   
    TributoService tributoService;
    Tributo tributo;

    @BeforeEach 
    void beforeEach() {
        tributoService = new TributoService();
        tributo = new Tributo(5, "Dios" , 12, false, "2025-02-28");
        tributoService.add(tributo);
    }

    @AfterEach
    void afterEach() {
        tributoService.delete(tributo);
        Assertions.assertEquals(4, tributoService.loadAll().size());
    } 

    @Test
    void tributoNoEqualsTest() {
        String example = "example";
        Assertions.assertNotEquals(tributo,example);
    }

    @Test
    void addTributoTest() {
        Assertions.assertEquals(5, tributoService.loadAll().size());
    }

    @Test
    void addTributoNullTest() {
        boolean addTributo = tributoService.add(null);
        Assertions.assertFalse(addTributo);
    }

    @Test
    void addTributoExistTest() {
        boolean addTributo = tributoService.add(tributo);
        Assertions.assertFalse(addTributo);
    }

    @Test
    void searchTributoByIdTest() {
        Tributo tributoSearch = tributoService.findById(tributo.getId());
        Assertions.assertEquals(tributo,tributoSearch);
        Assertions.assertEquals(tributo.getVoluntario(),tributoSearch.getVoluntario());
        Assertions.assertEquals(tributo.isVoluntario(),tributoSearch.isVoluntario());
    }

    @Test
    void searchTributoByIdNotExistTest() {
        Tributo tributoSearch = tributoService.findById(999);
        Assertions.assertNull(tributoSearch); 
    }

    @Test
    void searchTributoByIdNegativoTest() {
        Tributo tributoSearch = tributoService.findById(-1);
        Assertions.assertNull(tributoSearch); 
    }

    @Test
    void searchTributoDeleteNotExistTest() {
        Tributo tributoNotExist = new Tributo(999);
        boolean delete = tributoService.delete(tributoNotExist);
        Assertions.assertFalse(delete); 
    }

    @Test
    void searchListTributosRangeExistTest() {
        List<Tributo> tributos = tributoService.findByDateRange("1970-04-15", "2000-04-15");
        Assertions.assertEquals(2, tributos.size());

    }
}
