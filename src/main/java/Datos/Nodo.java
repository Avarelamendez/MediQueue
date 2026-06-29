/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
Clase nodo generica es la pieza base de todas las estructuras de datos
- En el proyecto cada tiquete de paciente se guarda dentro de un nodo para poder conectarse con el siguiente

/**
 *
 * @author Valeria
 */

public class Nodo<T> {

    //Dato que guarda el nodo y puede ser cualquier tipo de objeto
    private T dato;
    private Nodo<T> siguiente;  //referencia al siguiente nodo en la cadena


    public Nodo(T dato) { //E constructor y crea un nodo con un dato
        this.dato = dato;
        this.siguiente = null;  //El siguiente queda null porque aun no tiene conexion
    }

    // Lo que hace es retorna el dato que tiene el nodo adentro
    public T getDato() {
        return dato;
    }

    
    public void setDato(T dato) { //Cambia el dato que tiene el nodo adentro
        this.dato = dato;
    }

    //Retorna el siguiente nodo en la cadena
    public Nodo<T> getSiguiente() {
        return siguiente;
    }


    public void setSiguiente(Nodo<T> siguiente) {     //Conecta este nodo con el siguiente
        this.siguiente = siguiente;
    }
    // muestra el dato del nodo como texto
    @Override
    public String toString() {
        return dato.toString();
    }
}