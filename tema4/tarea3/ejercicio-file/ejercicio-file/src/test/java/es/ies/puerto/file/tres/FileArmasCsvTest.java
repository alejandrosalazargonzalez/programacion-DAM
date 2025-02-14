package es.ies.puerto.file.tres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

class FileArmasCsvTest {


    FileArmasCsv persistencia;

    List<Arma> armas;

    @BeforeEach
    void beforeEach() {
        persistencia = new FileArmasCsv();
        armas = persistencia.obtenerArmas();
    }

    @Test
    void obtenerArmasTest() {
        Assertions.assertFalse(armas.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5, armas.size(),
                MESSAGE_ERROR);
    }

    @Test
    void obtenerArmaTest() {
        String idBuscar = "ID_ACTUALIZAR";
        Arma ArmaBuscar = new Arma(idBuscar);
        ArmaBuscar = persistencia.obtenerArma(ArmaBuscar);
        Assertions.assertEquals(ArmaBuscar.getId(),"ID_BUSCAR",
                MESSAGE_ERROR);
        Assertions.assertNotNull(ArmaBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (ArmaBuscar.getOrigen().equals("VALOR_COMPARAR"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(ArmaBuscar.getOrigen().equals("VALOR_COMPARAR"),
                MESSAGE_ERROR);
    }

    @Test
    void addDeleteArmaTest() {

        int numArmasInicial = armas.size();
        Arma ArmaInsertar = new Arma();

        persistencia.addArma(ArmaInsertar);
        armas = persistencia.obtenerArmas();
        int numArmasInsertar = armas.size();
        Assertions.assertTrue(armas.contains(ArmaInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numArmasInicial +1 ,
                numArmasInsertar, MESSAGE_ERROR);
        persistencia.deleteArma(ArmaInsertar);
        armas = persistencia.obtenerArmas();
        int numArmasBorrado = armas.size();
        Assertions.assertEquals(numArmasInicial ,
                numArmasBorrado,
                MESSAGE_ERROR);
    }

    @Test
    void actualizarArma() {
        String idActualizar = "ID_ACTUALIZAR";
        Arma ArmaBuscar = new Arma(idActualizar);
        Arma ArmaActualizar = persistencia.obtenerArma(ArmaBuscar);
        Arma ArmaBackup = persistencia.obtenerArma(ArmaBuscar);
        ArmaActualizar.setNombre("nombreActualizar");
        ArmaActualizar.setDescripcion("descripcionActualizar");
        persistencia.updateArma(ArmaActualizar);

        ArmaBuscar = persistencia.obtenerArma(ArmaBuscar);
        Assertions.assertEquals(ArmaBuscar.toString(), ArmaActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updateArma(ArmaBackup);

    }


}
