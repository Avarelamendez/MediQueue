/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author gean3
 * 
 * Almacena los arreglos de usuarios y contrasenias
 */
public class Credenciales {
    private String[] listaUsers;
    private String[] listaPasswords;

    public Credenciales(String[] listaUsers, String[] listaPasswords) {
        this.listaUsers = listaUsers;
        this.listaPasswords = listaPasswords;
    }

    public String[] getListaUsers() {
        return listaUsers;
    }

    public String[] getListaPasswords() {
        return listaPasswords;
    }
}
