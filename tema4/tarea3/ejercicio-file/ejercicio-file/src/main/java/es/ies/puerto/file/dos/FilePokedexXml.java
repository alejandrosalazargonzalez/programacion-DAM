package es.ies.puerto.file.dos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;

import es.ies.puerto.file.uno.Criatura;

public class FilePokedexXml {

    /**
     * Saca todos los pockemons
     * 
     * @return List<Pokemon>
     * @throws ParserConfigurationException
     */
    public List<Pokemon> obtenerPokemons() throws Exception {
        File archivo = new File("src\\main\\resources\\dos.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);
        List<Pokemon> listaPokemons = new ArrayList<>();
        NodeList lista = doc.getElementsByTagName("pokemon");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                List<String> tipos = new ArrayList<>();
                NodeList listaTipos = doc.getElementsByTagName("tipos");
                for (int f = 0; f < listaTipos.getLength(); f++) {
                    Node nodoTipos = listaTipos.item(i);
                    if (nodoTipos.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoTipo = (Element) nodoTipos;
                        String tipo = elementoTipo.getElementsByTagName("tipo").item(0).getTextContent();
                        tipos.add(tipo);
                    }
                }
                String descripcion = elemento.getElementsByTagName("descripcion").item(0).getTextContent();
                listaPokemons.add(new Pokemon(id, nombre, tipos, descripcion));
            }
        }
        return listaPokemons;
    }

    /**
     * Busca a un pokemon
     * 
     * @param pokemon
     * @return
     * @throws Exception
     */
    public Pokemon obtenerPokemon(Pokemon pokemon) throws Exception {
        if (pokemon == null) {
            return null;
        }
        List<Pokemon> pokemons = obtenerPokemons();
        if (!pokemons.contains(pokemon)) {
            return null;
        }
        for (Pokemon pokemon2 : pokemons) {
            if (pokemon2.equals(pokemon)) {
                return pokemon2;
            }
        }
        return null;
    }

    public void addPokemon(Pokemon pokemon) {

    }

    public void deletePokemon(Pokemon pokemon) {

    }

    public void updatePokemon(Pokemon pokemon) {

    }

}
