package es.ies.puerto.model;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class XmlToJava {
    static List<Empleado> empleados = new ArrayList();

    /**
     * Metodo para leer el XML como un Csv
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File archivo = new File("src/main/resources/empleados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);

        NodeList lista = doc.getElementsByTagName("empleado");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String fecha = elemento.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
                String puesto = elemento.getElementsByTagName("puesto").item(0).getTextContent();
                Empleado empleado = new Empleado(id, nombre, fecha, puesto);
                empleados.add(empleado);
            }
        }
        // System.out.println(empleados);
        // escribirXML();
        //System.out.println(buscarXML("1"));
        //volcarFichero(empleados);
        Empleado empleado = new Empleado("1", "Pepe", "0/0/0000", "Dios");
        modificar(empleado, empleados);
    }

    /**
     * Lee el xml como xml
     * 
     * @param args
     * @throws Exception
     */
    public static void leerXML() throws Exception {
        File archivo = new File("empleados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);

        NodeList lista = doc.getElementsByTagName("empleado");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                System.out.println("ID: " + elemento.getElementsByTagName("id").item(0).getTextContent());
                System.out.println("Nombre: " + elemento.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Fecha de Nacimiento: "
                        + elemento.getElementsByTagName("fechaNacimiento").item(0).getTextContent());
                System.out.println("Puesto: " + elemento.getElementsByTagName("puesto").item(0).getTextContent());
                System.out.println("---------------------");
            }
        }
    }

    /**
     * Metodo para escribir el XML
     * 
     * @throws Exception
     */
    public static void escribirXML() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("empleados");
        doc.appendChild(root);

        Element empleado = doc.createElement("empleado");
        root.appendChild(empleado);

        Element id = doc.createElement("id");
        id.appendChild(doc.createTextNode("1"));
        empleado.appendChild(id);

        Element nombre = doc.createElement("nombre");
        nombre.appendChild(doc.createTextNode("Alejandro Salazar"));
        empleado.appendChild(nombre);

        Element fechaNacimiento = doc.createElement("fechaNacimiento");
        fechaNacimiento.appendChild(doc.createTextNode("1993-05-12"));
        empleado.appendChild(fechaNacimiento);

        Element puesto = doc.createElement("puesto");
        puesto.appendChild(doc.createTextNode("Desarrollador"));
        empleado.appendChild(puesto);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/empleados2.xml"));
        transformer.transform(source, result);
    }

    /**
     * Busca a un empleado en el documento por su id
     * 
     * @param idBuscar del empleado buscado
     * @return Empleado
     * @throws Exception
     */
    public static Empleado buscarXML(String idBuscar) throws Exception {
        if (idBuscar == null || idBuscar.isEmpty()) {
            return null;
        }
        File archivo = new File("src/main/resources/empleados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);

        NodeList lista = doc.getElementsByTagName("empleado");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            Element elemento = (Element) nodo;
            String id = elemento.getElementsByTagName("id").item(0).getTextContent();
            if (id.equals(idBuscar)) {
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String fecha = elemento.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
                String puesto = elemento.getElementsByTagName("puesto").item(0).getTextContent();
                return new Empleado(id, nombre, fecha, puesto);
            }
        }
        return null;
    }

    /**
     * Busca a un empleado en una lista por su id
     * 
     * @param idBuscar  id del empleado buscado
     * @param empleados lista de empleados
     * @return Empleado
     */
    public static Empleado buscar(String idBuscar, Set<Empleado> empleados) {
        if (idBuscar == null || idBuscar.isEmpty() || empleados == null || empleados.isEmpty()) {
            return null;
        }
        Empleado empleadoBuscar = new Empleado(idBuscar);
        for (Empleado empleado : empleados) {
            if (empleado.equals(empleadoBuscar)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Actualiza la informacion del fichero
     * @param empleados del fichero
     * @throws Exception
     */
    public static void volcarFichero(List<Empleado> empleados) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("empleados");
        doc.appendChild(root);
        for (Empleado empleado : empleados) {
            Element empleadoXml = doc.createElement("empleado");
            root.appendChild(empleadoXml);
            
            Element idXml = doc.createElement("id");
            idXml.appendChild(doc.createTextNode(empleado.getId()));
            empleadoXml.appendChild(idXml);

            Element nombreXml = doc.createElement("nombre");
            nombreXml.appendChild(doc.createTextNode(empleado.getNombre()));
            empleadoXml.appendChild(nombreXml);

            Element fechaNacimientoXml = doc.createElement("fechaNacimiento");
            fechaNacimientoXml.appendChild(doc.createTextNode(empleado.getFecha()));
            empleadoXml.appendChild(fechaNacimientoXml);

            Element puestoXml = doc.createElement("puesto");
            puestoXml.appendChild(doc.createTextNode(empleado.getPuesto()));
            empleadoXml.appendChild(puestoXml);
            
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/empleados2.xml"));
        transformer.transform(source, result);
    }

    /**
     * Modifica a un empleado del archivo
     * @param empleado modificados
     * @param empleados en el fichero
     * @return true/false
     * @throws Exception
     */
    public static boolean modificar(Empleado empleado, List<Empleado> empleados) throws Exception{
        if (empleado == null) {
            return false;
        }
        int posicion = empleados.indexOf(empleado);
        if (posicion < 0) {
            return false;
        }
        empleados.set(posicion, empleado);
        volcarFichero(empleados);
        return true;
    }

    /**
     * Elimina un empleado del archivo
     * @param empleado a eliminar
     * @param empleados en el archivo
     * @return true/false
     * @throws Exception
     */
    public static boolean eliminar(Empleado empleado, List<Empleado> empleados) throws Exception{
        if (empleado == null || empleados.isEmpty() || empleados == null) {
            return false;
        }
        boolean eliminado = empleados.remove(empleado);
        if (eliminado) {
            
            volcarFichero(empleados);
        }
        return eliminado;
    }
}
