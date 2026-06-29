/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Clase que serializa y deserializa objetos simples
  En este proyecto se usa para guardar y cargar:
 -sede con sus salas y consultorios en config.json (Modulo 1.0)
 -Usuario con nombre y contrasena en config.json (Modulo 1.0)

/**
 *
 * @author Valeria
 */

public class SerializacionO {
    private final Gson gson;  // gson es el que convierte objetos a JSON y viceversa

    public SerializacionO() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    /*recibe cualquier objeto y el nombre del archivo
    lo convierte a texto JSON y lo guarda en el archivo
    P2 lo usa para guardar la Sede en config.json */
    
    public void serializarObjeto(Object objeto, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            // convierte el objeto a texto JSON y lo escribe en el archivo
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* recibe el nombre del archivo y el tipo de objeto que espera
    lee el archivo y lo convierte de vuelta al objeto
    P3 lo usa para cargar la Sede desde config.json al iniciar */
    public <T> T deserializarObjeto(String archivo, Class<T> clase) {
        try (FileReader reader = new FileReader(archivo)) {
            // convierte el texto JSON de vuelta al objeto
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* verifica si un archivo existe en el disco
    P3 lo usa para saber si existe config.json al arrancar
   si no existe le pide la configuracion al usuario de nuevo */
    
    public boolean existeArchivo(String archivo) {
        File f = new File(archivo);
        return f.exists();
    }
}