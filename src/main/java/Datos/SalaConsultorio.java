/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author gean3
 * 
 * De momento guarda la informacion y clasificacion de salas y consultorios
 */
public class SalaConsultorio {
    private String tipo; 
    private boolean Preferencial;
    private int Identificador;

    public SalaConsultorio(String tipo, boolean Preferencial, int Identificador) {
        this.tipo = tipo;
        this.Preferencial = Preferencial;
        this.Identificador = Identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isPreferencial() {
        return Preferencial;
    }

    public int getIdentificador() {
        return Identificador;
    }
}