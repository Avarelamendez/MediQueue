/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDateTime;

/**
 *
 * @author Adrian Varela
 */
public class Tiquete extends Paciente {
    
    //Variables
    private int tiquete;
    private LocalDateTime  fechaIngreso;
private LocalDateTime  fechaAtencion;
private String prioridad;
private String tipoAtencion;
private String atencion;

    /**Constructor
     *
     */
    public Tiquete() {
    }
    
    /**Constructor sobrecargado
     *
     */
    
    public Tiquete(int tiquete, LocalDateTime fechaIngreso, LocalDateTime fechaAtencion, String prioridad, String tipoAtencion, String atencion) {
        this.tiquete = tiquete;
        this.fechaIngreso = fechaIngreso;
        this.fechaAtencion = fechaAtencion;
        this.prioridad = prioridad;
        this.tipoAtencion = tipoAtencion;
        this.atencion = atencion;
    }

    //Getters & Setters
    /**
     *
     * @return
     */
    public int getTiquete() {
        return tiquete;
    }

    /**
     *
     * @param tiquete
     */
    public void setTiquete(int tiquete) {
        this.tiquete = tiquete;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     *
     * @param fechaIngreso
     */
    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    /**
     *
     * @param fechaAtencion
     */
    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    /**
     *
     * @return
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     *
     * @param prioridad
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     *
     * @return
     */
    public String getTipoAtencion() {
        return tipoAtencion;
    }

    /**
     *
     * @param tipoAtencion
     */
    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    /**
     *
     * @return
     */
    public String getAtencion() {
        return atencion;
    }

    /**
     *
     * @param atencion
     */
    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    /**
     *
     * @param tiquete
     * @param fechaIngreso
     * @param fechaAtencion
     * @param prioridad
     * @param tipoAtencion
     * @param atencion
     * @param id
     * @param nombre
     * @param identificacion
     * @param edad
     * @param tipoSeguro
     */
    public Tiquete(int tiquete, LocalDateTime fechaIngreso, LocalDateTime fechaAtencion, String prioridad, String tipoAtencion, String atencion, int id, String nombre, int identificacion, int edad, int tipoSeguro) {
        super(id, nombre, identificacion, edad, tipoSeguro);
        this.tiquete = tiquete;
        this.fechaIngreso = fechaIngreso;
        this.fechaAtencion = fechaAtencion;
        this.prioridad = prioridad;
        this.tipoAtencion = tipoAtencion;
        this.atencion = atencion;
    }




    

//7. Fecha/Hora de atención (por defecto es -1 hasta que sea atendido)
//8. Prioridad médica (Critico, Urgente, Regular, Control)
//9. Tipo atención (C: Consulta Externa, S: Salón, E: Emergencias)
//10. Atención (P: Preferencial, N: Normal) importante solo puede tener un
//tipo

    /**@author Adrian Varela
     * 
     * To String de la clase tiquete
     *
     * @return devuelve una cadena de texto con la infomación del tiquete y el paciente
     */


    
        @Override
    public String toString() {
        return "Tiquete:{"+ tiquete + "nombre: " + nombre + ", identificacion: " + identificacion + ", edad: "+ edad + 
                ",tipo de seguro: " + tipoSeguro +", Fecha de Ingreso:" + fechaIngreso + ", Fecha de Atención:" + fechaAtencion + ",Prioridad:"+prioridad 
                +",Tipo de atención:"+tipoAtencion+", Atención:"+atencion 
                + "}";
    }

}
