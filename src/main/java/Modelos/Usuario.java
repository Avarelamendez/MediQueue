/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * Usuario del sistema para el login
 * Se almacena en config.json, no queda quemado en el codigo.
 *
 * @author Brandon
 */
public class Usuario {

    private String nombre;       // nombre de usuario para iniciar sesion
    private String contrasena;   // contrasena del usuario (sin cifrar, como simulacion de BD)

    // constructor vacio que necesita Gson para reconstruir el objeto
    public Usuario() {
    }

    // crea un usuario con su nombre y contrasena
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // no se muestra la contrasena por seguridad
    @Override
    public String toString() {
        return "Usuario:{nombre:" + nombre + "}";
    }
}
