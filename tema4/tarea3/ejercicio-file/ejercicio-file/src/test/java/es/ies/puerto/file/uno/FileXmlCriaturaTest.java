package es.ies.puerto.file.uno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

class FileXmlCriaturaTest {
    Criatura criatura;
    FileXmlCriatura persistencia;

    List<Criatura> criaturas;

    @BeforeEach
void beforeEach() throws ParserConfigurationException, SAXException, IOException {
        persistencia = new FileXmlCriatura();
        criaturas = persistencia.obtenerCriaturas();
        criatura = new Criatura();
    }

    @Test
void obtenerCriaturasTest() {
        Assertions.assertFalse(criaturas.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5,criaturas.size(),
                MESSAGE_ERROR);
    }

    @Test
void obtenerCriaturaTest() throws SAXException, IOException, ParserConfigurationException {
        String idBuscar = "GF003";
        Criatura critaturaBuscar = new Criatura(idBuscar);
        critaturaBuscar = persistencia.obtener(critaturaBuscar);
        Assertions.assertEquals(critaturaBuscar.getId(),idBuscar,
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (critaturaBuscar.getCategoria().equals("Grifos"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getDescripcion().equals("Un poderoso grifo con cuerpo de león y alas de águila."),
                MESSAGE_ERROR);
    }

    @Test
void addDeleteCriaturaTest() throws Exception {

        int numCriaturasInicial = criaturas.size();
        Criatura criaturaInsertar = new Criatura("123","Hidra","Dragon de 7 cabezas que crea otras 2 cuando se le corta una","dragon");

        persistencia.addCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCriaturasInsertar = criaturas.size();
        Assertions.assertTrue(criaturas.contains(criaturaInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numCriaturasInicial+1 ,
                numCriaturasInsertar, MESSAGE_ERROR);
        persistencia.deleteCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCritaturasBorrado = criaturas.size();
        Assertions.assertEquals(numCriaturasInicial ,
                numCritaturasBorrado,
                MESSAGE_ERROR);
    }

    @Test
void actualizarCriatura() throws SAXException, IOException, ParserConfigurationException {
        String idActualizar = "FN005";
        Criatura criaturaBuscar = new Criatura(idActualizar);
        Criatura criaturaActualizar = persistencia.obtener(criaturaBuscar);
        Criatura criaturaBackup = persistencia.obtener(criaturaBuscar);
        criaturaActualizar.setNombre("Fénix Resplandeciente");
        criaturaActualizar.setDescripcion("Un fénix que renace de sus cenizas con un resplandor dorado.");
        criaturaActualizar.setCategoria("Otras Criaturas");
        persistencia.updateCriatura(criaturaActualizar);

        criaturaBuscar = persistencia.obtener(criaturaBuscar);
        Assertions.assertEquals(criaturaBuscar.toString(), criaturaActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updateCriatura(criaturaBackup);

    }



}
