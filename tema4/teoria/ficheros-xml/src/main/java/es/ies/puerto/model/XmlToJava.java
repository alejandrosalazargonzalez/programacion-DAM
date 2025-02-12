package es.ies.puerto.model;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XmlToJava {
    static List<Empleado> empleados = new ArrayList<>();

    /**
     * Metodo para leer el XML como un Csv
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File archivo = new File(
                "/home/bae2/programacion-DAM/tema4/teoria/ficheros-xml/src/main/resources/empleados.xml");
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
        System.out.println(empleados);
        // escribirXML();
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
        StreamResult result = new StreamResult(
                new File("/home/bae2/programacion-DAM/tema4/teoria/ficheros-xml/src/main/resources/empleados2.xml"));
        transformer.transform(source, result);
    }
}
