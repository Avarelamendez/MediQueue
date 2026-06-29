/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * @author Brandon
 */
public class Sala {

    private int numero;        // identificador de la sala dentro de la sede
    private TipoSala tipo;     // preferencial, emergencia critica o normal
    private int capacidad;     // cantidad de personas que puede atender

    // constructor vacio que se necesita para reconstruir el objeto
    public Sala() {
    }

    // crea una sala con su numero, tipo y capacidad
    public Sala(int numero, TipoSala tipo, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoSala getTipo() {
        return tipo;
    }

    public void setTipo(TipoSala tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Sala:{numero:" + numero + ", tipo:" + tipo + ", capacidad:" + capacidad + "}";
    }
}
