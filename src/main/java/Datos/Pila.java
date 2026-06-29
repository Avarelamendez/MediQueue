/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Valeria
 */
public class Pila<T> {

    private Nodo<T> cima; //Apunta al elemento de la cima de la pila

    
    public Pila() { //constructor pero se creauna pila vacia
        this.cima = null;
    }

    public boolean esVacia() { //verifica si la pila tiene elementos o no
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }
    // agrega un elemento encima de la pila
    public void push(T newDato) {
       
        Nodo<T> nuevoNodo = new Nodo<>(newDato);  //Se crea el nuevo nodo con el dato
        
        nuevoNodo.setSiguiente(cima); //el nuevo nodo apunta a la cima actual

        this.cima = nuevoNodo; //El nuevo nodo pasa a ser la cima
    }

    //saca el elemento de la cima de la pila
   
    public T pop() {
    if (esVacia()) {
        System.out.println("Vacio");
        return null;
    } else {
        T datoCima = cima.getDato();  //guarda el dato de la cima antes de moverla
        cima = cima.getSiguiente();//mueve la cima al siguiente elemento
        return datoCima;
    }}

    //enseña el elemento de la cima sin sacarlo
    public T verCima() {
        if (esVacia()) {
            return null;
        }
        return cima.getDato();
    }

    // enseña todos los elementos de la pila
    public void mostrar() {
        if (esVacia()) {
            System.out.println("Vacio");
        } else {
            // recorre todos los nodos desde la cima hacia abajo
            Nodo<T> actual = this.cima;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }
}

