/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Datos.Cola;

/**
 * Representa una sede hospitalaria
 * Las colecciones usan la Cola del proyecto
 * @author Brandon
 */
public class Sede {

    private String nombre;                  // nombre de la sede hospitalaria
    private int cantidadSalas;              // cantidad total de salas medicas
    private int cantidadConsultorios;       // cantidad total de consultorios
    private int cantidadSalasEmergencia;    // cantidad de salas de emergencia

    // colecciones dinamicas de la sede (estructura Cola del proyecto)
    private Cola<Sala> salas;
    private Cola<Consultorio> consultorios;
    private Cola<Usuario> usuarios;

    // constructor vacio: inicializa las colas. Tambien lo usa Gson al reconstruir
    public Sede() {
        this.salas = new Cola<>();
        this.consultorios = new Cola<>();
        this.usuarios = new Cola<>();
    }

    // crea la sede con su nombre y las cantidades configuradas
    public Sede(String nombre, int cantidadSalas, int cantidadConsultorios, int cantidadSalasEmergencia) {
        this();  // inicializa las colas vacias
        this.nombre = nombre;
        this.cantidadSalas = cantidadSalas;
        this.cantidadConsultorios = cantidadConsultorios;
        this.cantidadSalasEmergencia = cantidadSalasEmergencia;
    }

    // agrega una sala a la coleccion de la sede
    public void agregarSala(Sala sala) {
        salas.encolar(sala);
    }

    // agrega un consultorio a la coleccion de la sede
    public void agregarConsultorio(Consultorio consultorio) {
        consultorios.encolar(consultorio);
    }

    // agrega un usuario a la coleccion de la sede
    public void agregarUsuario(Usuario usuario) {
        usuarios.encolar(usuario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public int getCantidadConsultorios() {
        return cantidadConsultorios;
    }

    public void setCantidadConsultorios(int cantidadConsultorios) {
        this.cantidadConsultorios = cantidadConsultorios;
    }

    public int getCantidadSalasEmergencia() {
        return cantidadSalasEmergencia;
    }

    public void setCantidadSalasEmergencia(int cantidadSalasEmergencia) {
        this.cantidadSalasEmergencia = cantidadSalasEmergencia;
    }

    public Cola<Sala> getSalas() {
        return salas;
    }

    public void setSalas(Cola<Sala> salas) {
        this.salas = salas;
    }

    public Cola<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(Cola<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }

    public Cola<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Cola<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sede: ").append(nombre).append("\n");
        sb.append("Cantidad de salas: ").append(cantidadSalas).append("\n");
        sb.append("Cantidad de consultorios: ").append(cantidadConsultorios).append("\n");
        sb.append("Cantidad de salas de emergencia: ").append(cantidadSalasEmergencia).append("\n");
        sb.append("Salas: ").append(salas).append("\n");
        sb.append("Consultorios: ").append(consultorios).append("\n");
        sb.append("Usuarios: ").append(usuarios);
        return sb.toString();
    }
}
