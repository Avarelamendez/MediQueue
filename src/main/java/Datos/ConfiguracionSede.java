/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author gean3
 * 
 * De momento se utiliza para almacenar en un objeto los datos de la cede al momento en el que arranca el programa por primera vez
 * 
 */
public class ConfiguracionSede {
    private String nombreSede;
    private int totalSalas;
    private int totalConsultorios;

    public ConfiguracionSede(String nombreSede, int totalSalasMedicas, int totalConsultorios) {
        this.nombreSede = nombreSede;
        this.totalSalas = totalSalasMedicas;
        this.totalConsultorios = totalConsultorios;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public int getTotalSalas() {
        return totalSalas;
    }

    public int getTotalConsultorios() {
        return totalConsultorios;
    }
}
