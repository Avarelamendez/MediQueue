/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * Representa un consultorio de la sede
 * @author Brandon
 */
public class Consultorio {

    private int numero;              // identificador del consultorio dentro de la sede
    private TipoConsultorio tipo;    // preferencial o normal
    private int capacidad;           // cantidad de personas que puede atender
    private String especialidad;     // valoracion, pediatria, geriatria, neumologia, etc.

    // constructor vacio que se necesita para reconstruir el objeto
    public Consultorio() {
    }

    // crea un consultorio con su numero, tipo, capacidad y especialidad
    public Consultorio(int numero, TipoConsultorio tipo, int capacidad, String especialidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.especialidad = especialidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoConsultorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsultorio tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Consultorio:{numero:" + numero + ", tipo:" + tipo
                + ", capacidad:" + capacidad + ", especialidad:" + especialidad + "}";
    }
}
