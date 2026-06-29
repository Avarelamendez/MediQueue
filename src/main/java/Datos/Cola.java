/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author Valeria
 */
public class Cola<T> {

    private Nodo<T> frente;  // lo que hace es apuntar al primer elemento de la cola
   
    private Nodo<T> fin;  //apunta al ultimo elemento de la cola

   
    public Cola() {   // el constructor crea una cola vacia
        this.frente = null;
        this.fin = null;
    }

   
    public Cola(Nodo<T> frente, Nodo<T> fin) {  // el constructor lo que hace es crear una cola a partir de un frente y un fin ya existentes
        this.frente = frente;
        this.fin = fin;
    }

    // Operación para insertar un elemento (Enqueue)
    // agrega un nuevo dato al final de la cola
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato); // Usa el constructor genérico
        if (fin != null) {
            // si ya hay un fin se conecta el nuevo nodo despues de el
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        if (frente == null) {
            // si la cola estaba vacia el nuevo nodo tambien es el frente
            frente = nuevo;
        }
    }

    // Operación para eliminar un elemento (Dequeue)
    // saca el dato del frente de la cola
    public T desencolar() throws Exception {
        if (frente == null) {
            throw new Exception("La cola está vacía");
        }
        // guarda el dato del frente antes de moverlo
        T dato = frente.getDato();
        // mueve el frente al siguiente elemento
        frente = frente.getSiguiente();
        if (frente == null) {
            // si ya no hay mas elementos el fin tambien queda null
            fin = null;
        }
        return dato;
    }

    // Operacion para ver el elemento al frente
    // muestra el dato del frente sin sacarlo
    public T frente() throws Exception {
        if (frente == null) {
            throw new Exception("La cola está vacía");
        }
        return frente.getDato();
    }

    // convierte la cola en una pila manteniendo el orden, sin vaciar la cola original
    public Pila colatoPila() {
        Pila<T> pilacopia = new Pila<>();
        Nodo<T> actual = frente;
        // recorre la cola desde el frente y apila cada dato
        while (actual != null) {
            T newdato = actual.getDato();
            pilacopia.push(newdato);
            actual = actual.getSiguiente();
        }
        return pilacopia;
    }

    // traslada todos los elementos de la cola a una pila, vaciando la cola original
    public Pila colatrasladaPila() {
        Pila<T> pilacopia = new Pila<>();
        // saca cada elemento de la cola y lo apila hasta que quede vacia
        do {
            try {
                T newdato = desencolar();
                pilacopia.push(newdato);
            } catch (Exception e) {
            }
        } while (!estaVacia());
        return pilacopia;
    }

    // verifica si la cola tiene elementos o no
    public boolean estaVacia() {
        return frente == null;
    }

    // muestra todos los elementos de la cola como texto
    @Override
    public String toString() {
        if (estaVacia()) {
            return "Cola vacía";
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = frente;
        // recorre todos los nodos desde el frente hasta el fin
        while (actual != null) {
            sb.append(actual.getDato());
            actual = actual.getSiguiente();
            if (actual != null) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

    // busca si un dato existe dentro de la cola
    public boolean encuentra(T newDato) {
        Nodo<T> actual = this.frente;
        // recorre la cola hasta encontrar el dato o llegar al final
        while (actual != null) {
            if (actual.getDato().equals(newDato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}