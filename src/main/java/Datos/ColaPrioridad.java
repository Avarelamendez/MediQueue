/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 * Cola de prioridad generica
 * el elemento con mayor prioridad sale primero
 * T debe implementar Comparable para poder ordenarse
 * @author Valeria
 */
public class ColaPrioridad<T extends Comparable<T>> {
    
    private Nodo<T> frente;// apunta al elemento de mayor prioridad

    // constructor, crea una cola de prioridad vacia
    public ColaPrioridad() {
        this.frente = null;
    }

    // Operación para insertar un elemento ordenado por prioridad
    // el de menor valor en compareTo va primero
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia() || dato.compareTo(frente.getDato()) < 0) {
            // si esta vacia o el nuevo tiene mayor prioridad que el frente
            // el nuevo nodo va al frente
            nuevo.setSiguiente(frente);
            frente = nuevo;
        } else {
            // busca la posicion correcta recorriendo la cola
            Nodo<T> actual = frente;
            while (actual.getSiguiente() != null
                    && dato.compareTo(actual.getSiguiente().getDato()) >= 0) {
                actual = actual.getSiguiente();
            }
            // inserta el nuevo nodo en la posicion encontrada
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
    }

    // Operación para eliminar el elemento de mayor prioridad
    // saca el elemento que esta en el frente
    public T desencolar() throws Exception {
        if (frente == null) {
            throw new Exception("La cola de prioridad está vacía");
        }
        // guarda el dato del frente antes de moverlo
        T dato = frente.getDato();
        // mueve el frente al siguiente elemento
        frente = frente.getSiguiente();
        return dato;
    }

    // Operación para ver el elemento de mayor prioridad
    // muestra el dato del frente sin sacarlo
    public T frente() throws Exception {
        if (frente == null) {
            throw new Exception("La cola de prioridad está vacía");
        }
        return frente.getDato();
    }

    // lo que hace es que convierte la cola de prioridad en una pila, sin vaciar la cola original
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

    // traslada todos los elementos a una pila, vaciando la cola original
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

    // muestra todos los elementos en orden de prioridad como texto
    @Override
    public String toString() {
        if (estaVacia()) {
            return "Cola de prioridad vacía";
        }
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = frente;
        // recorre todos los nodos desde el de mayor prioridad
        while (actual != null) {
            sb.append(actual.getDato());
            actual = actual.getSiguiente();
            if (actual != null) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

    // busca si un dato existe dentro de la cola de prioridad
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