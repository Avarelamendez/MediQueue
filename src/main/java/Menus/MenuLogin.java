/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Datos.Cola;
import Datos.Nodo;
import Modelos.Sede;
import Modelos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author gean3
 */

public class MenuLogin {

    public static boolean ejecutarLogin(Sede sedeActual) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de gestion de MediQueue");

        int intentos = 0;
        while (intentos < 3) { //Se le da tres intentos de lograr un login exitoso antes de que se le cierre el programa
            String userIn = JOptionPane.showInputDialog("Usuario:"); //Pide usuario y contrasenia
            String passIn = JOptionPane.showInputDialog("Contrasena:");

            if (userIn == null || passIn == null) return false; // Verifica que ni el usuario ni la contrasenia vengan vacios

            Cola<Usuario> colaUsuarios = sedeActual.getUsuarios(); //Obtiene los usuarios registrados
            boolean credencialesValidas = false; // Si el codigo mas adelante encuentra los credenciales correctos cambiaria a TRUE
            Datos.Pila<Usuario> copiaPila = colaUsuarios.colatoPila(); // Utilizamos colatoPila para revisar los usuarios con una copia que podamos recorrer
            
            while (!copiaPila.esVacia()) { //Ejecuta mientras la pila no este vacia
                Usuario u = copiaPila.pop();
                if (u.getNombre().equalsIgnoreCase(userIn) && u.getContrasena().equals(passIn)) {//Validacion de usuario y contrasenia
                    credencialesValidas = true;//Habilita el pase para el login
                    break;
                }
            }

            if (credencialesValidas) {
                return true;
            }

            intentos++; //Incrementa intentos para llegar a la condicion de 3 fallidos 
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas \nIntentos restantes: " + (3 - intentos));
        }
        return false;
    }
}
