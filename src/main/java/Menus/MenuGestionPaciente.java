/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Datos.Cola;
import Datos.ColaPrioridad;
import Datos.ConfiguracionSede;
import Datos.Credenciales;
import Datos.Tiquete;
import Modelos.Sede;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Varela
 */
public class MenuGestionPaciente {

    private static Cola<Tiquete> colaTiquete = new Cola<>();

    /**@author Adrian Varela
     *
     * Este metodo muestra el menu de gestion de pacientes
     */
    public static void mostrar() {

        boolean continuar = true;
        while (continuar==true) { //Construccion del menu principal / Ciclo while para volver al menu principal hasta salir
            String menu = "Menu De Gestión de Pacientes\n"
                    + "1) Ingresar Paciente\n"
                    + "2) Atender Paciente\n"
                    + "3) Mostrar Pacientes en espera\n"
                    + "4) Salir\n\n"
                    + "Seleccione una opción:";

            String res = JOptionPane.showInputDialog(null, menu);

            if (res == null) {
                res = "4";
            }

            switch (res) { // Switch para opciones del menu / Res guarda la respuesta del usuario
                
                //El primer caso el cual ingresa un paciente (en esta misma clase se encuentra el metodo ingresar tiquete donde se amplia la creación del paciente - tiquete)
                case "1":
                    ingresarTiquete();
                    break;
                //El segundo caso hace un dequeue del paciente en cola y muestra un string del paciente que se atendió, al estar dentro de un try catch en la clase cola por eso se coloca
                    //en un try catch
                case "2":
                    try {
                        Tiquete tiqueteAtendido = colaTiquete.desencolar();
                        JOptionPane.showMessageDialog(null, "Paciente atendido: " + tiqueteAtendido.toString());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() );
                    }
                    break;
                //El tercer caso muestra la cola de pacientes en espera
                case "3":
                    JOptionPane.showMessageDialog(null, colaTiquete.toString());
                    break;
                 //Por ultimo el cuarto caso devuelve al usuario al menu principal
                case "4":
                    continuar = false; // Condicion de salida
                    JOptionPane.showMessageDialog(null, "Saliendo ...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }
    }

    /**@author Adrian Varela
     *
     * Este metodo genera el paciente y le asigna un numero de tiquete con la información que se va a registrar en la cola
     * 
     */
    
    private static void ingresarTiquete() {

        //Ingreso de información del cliente por medio de JOptionPane
        try {
            JOptionPane.showMessageDialog(null, "Se creará un tiquete nuevo, favor ingrese la información del paciente acontinuación: ");
            String nombre = JOptionPane.showInputDialog("Nombre del paciente:");
            int id = Integer.parseInt(JOptionPane.showInputDialog("ID del paciente:"));
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));

            int tiquete = Integer.parseInt(JOptionPane.showInputDialog("Tiquete:"));
            String prioridad = JOptionPane.showInputDialog("Prioridad (Critico, Urgente, Regular, Control):");
            String tipoAtencion = JOptionPane.showInputDialog("Tipo (C | Consulta Externa, S | Salon, E | Emergencias):");
            String atencion = JOptionPane.showInputDialog("Atencion (P | Preferencial, N | Normal):");

            // Crear el objeto tiquete y lo almacena en la colaTiquete instanciada al principio de la clase
            Tiquete nuevoTiquete = new Tiquete(tiquete, LocalDateTime.now(), null,
                    prioridad, tipoAtencion, atencion,
                    id, nombre, id, edad, 1);
            colaTiquete.encolar(nuevoTiquete);
            
            JOptionPane.showMessageDialog(null, "Tiquete ingresado con éxito.");

         //Manejo de excepciones
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en los datos: " + e.getMessage());
        }
    }
}
