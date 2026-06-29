/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Datos.Cola;
import Datos.ConfiguracionSede;
import Datos.Credenciales;
import Datos.SalaConsultorio;
import Datos.Tiquete;
import Modelos.Sede;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author gean3
 */
public class MenuPrincipal {

    public static void mostrar(Sede sedeActual) {
        /*Cola<SalaConsultorio> SalasMedicas = new Cola<>(); // Codigo temporar para pruebas definir Sala Preferencial, sala Critica, sala Normal, Consultorio Preferencial y Consultorio Normal
        Cola<SalaConsultorio> Consultorios = new Cola<>();

        if (config.getTotalSalasMedicas() >= 1) {
            SalasMedicas.entrar(new SalaConsultorio("Sala Preferencial", true, 1));
        }
        if (config.getTotalSalasMedicas() >= 2) {
            SalasMedicas.entrar(new SalaConsultorio("Sala Critica", false, 2));
        }
        for (int i = 3; i <= config.getTotalSalasMedicas(); i++) {
            SalasMedicas.entrar(new SalaConsultorio("Sala Normal", false, i));
        }

        if (config.getTotalConsultorios() >= 1) {
            Consultorios.entrar(new SalaConsultorio("Consultorio Preferencial", true, 1));
        }
        for (int i = 2; i <= config.getTotalConsultorios(); i++) {
            Consultorios.entrar(new SalaConsultorio("Consultorio Normal", false, i));
        }*/

        boolean continuar = true;
        while (continuar) { //Construccion del menu principal / Ciclo while para volver al menu principal hasta salir
            String menu = "Menu Principal\n"
                    + "1) Sedes\n"
                    + "2) Usuarios\n"
                    + "3) Gestion Pacientes\n\n"
                    + "4) Salir\n\n"
                    + "Seleccione una opción:";

            String res = JOptionPane.showInputDialog(null, menu);

            if (res == null) {
                res = "3";
            }

            switch (res) { // Dependinedo de la opcion elegida por el usuario es la opcion a ejecutar
                case "1":
                    JOptionPane.showMessageDialog(null, "Sedes\n" + sedeActual.toString() + "\nPendinete a programar");
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Usuarios\n" + sedeActual.getUsuarios().toString() + "\nPendinete a programar");
                    break;

                case "3":
                    MenuGestionPaciente.mostrar();
                    break;
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

}
