/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializacion;

import Datos.ColaPrioridad;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* Clase que serializa y deserializa la ColaPrioridad
 En este proyecto se usa para guardar y cargar:
 - ColaPrioridad de Tiquetes en tiquetes.json 
 - Al cerrar el sistema guarda los tiquetes pendientes
  -Al iniciar el sistema carga los tiquetes pendientes

/**
 *
 * @author Valeria
 */
public class Serializacion {
    private final Gson gson;

    
    public Serializacion() { // constructor se configura el gson con formato bonito
        this.gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }

 
    public <T extends Comparable<T>> void serializarCola(ColaPrioridad<T> cola, String archivo) {    // ColaPrioridad + nombre un archivo
        try (FileWriter writer = new FileWriter(archivo)) {
            // Lo que have es convierte la cola a texto JSON y lo escribe en el archivo
            gson.toJson(cola, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Cargar desde el JSON
    public <T extends Comparable<T>> ColaPrioridad<T> deserializarCola(String archivo, Class<T> clazz) {
        try (FileReader reader = new FileReader(archivo)) {
            Type tipoCola = TypeToken.getParameterized(ColaPrioridad.class, clazz).getType();       // TypeToken le dice a Gson que tipo de objeto hay adentro de la cola
           
            return gson.fromJson(reader, tipoCola);  // convierte el texto JSON de vuelta a la cola
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}