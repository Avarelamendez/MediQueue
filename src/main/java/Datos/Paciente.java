/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDateTime;

/**
 *
 * @author Adrián Varela
 */
public class Paciente {
    
    /**
     *Variables
     */
    public int id;
    public String nombre;
    public int identificacion;
    public int edad;
    public int tipoSeguro;

    /** @Author Adrian Varela
     *Constructor
     */
    public Paciente() {
    }

    /**@author Adrian Varela
     *Constructor sobre cargado
     * @param id
     * @param nombre
     * @param identificacion
     * @param edad
     * @param tipoSeguro
     */
    public Paciente(int id, String nombre, int identificacion, int edad, int tipoSeguro) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.tipoSeguro = tipoSeguro;
    }

    //Getters & Setters
    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.id = Id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     *
     * @param identificacion
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public int getTipoSeguro() {
        return tipoSeguro;
    }

    /**
     *
     * @param tipoSeguro
     */
    public void setTipoSeguro(int tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
    
    /**@author Adrian Varela
     *
     * To string de la clase
     * @return devuelve una cadena de texto con la información del paciente
     */
    @Override
    public String toString() {
        return "Paciente:{" + "nombre: " + nombre + ", identificacion: " + identificacion + ", edad: "+ edad + ",tipo de seguro: " + tipoSeguro +"}";
    }

}


