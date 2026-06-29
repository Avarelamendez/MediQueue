/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Datos.Cola;
import Modelos.Sede;
import Modelos.Sala;
import Modelos.Consultorio;
import Modelos.Usuario;
import Modelos.TipoSala;
import Modelos.TipoConsultorio;
import Serializacion.SerializacionO;
import javax.swing.JOptionPane;

/**
 *
 * @author gean3
 * El se encargan del seteo de los datos la primera vez que arranca el codigo
 */
public class MenuConfiguracion {

    public static void ejecutarConfiguracion(String archivoConfig) {
        JOptionPane.showMessageDialog(null, "Configuracion Inicial MediQueue \nBienvenidos\nRegistremos nuestra primera sede");

        String nombre = JOptionPane.showInputDialog("Nombre de la sede:");
        
        int salasMedicas = 0;
        while (salasMedicas <= 1) { // Ciclo while para aregurarnos de que la primera sede registrada tenga al menos 2 salas ya que siempre tiene que tener como minimo una sala preferencial y una sala de emergencias criticas
            String input = JOptionPane.showInputDialog("Cantidad de Salas:");
            try {// Try catch valida si el numero es menor a 2 o contiene algun caracter no valido como una letra
                salasMedicas = Integer.parseInt(input);
                if (salasMedicas <= 1) {
                    JOptionPane.showMessageDialog(null, "Debe ser mayor a 1 para asegurar la Sala Preferencial");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }

        int consultorios = 0;
        while (consultorios <= 0) {// Ciclo while para aregurarnos de que el primer consultorio registrado tenga al menos un único consultorio preferencial
            String input = JOptionPane.showInputDialog("Cantidad de Consultorios:");
            try {// Try catch valida si el numero es menor a 2 o contiene algun caracter no valido como una letra
                consultorios = Integer.parseInt(input);
                if (consultorios <= 0) {
                    JOptionPane.showMessageDialog(null, "Debe ser mayor a 0 para asegurar el consultorio preferencial");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido.");
            }
        }

        int salasEmergencia = 1;

        Sede nuevaSede = new Sede(nombre, salasMedicas, consultorios, salasEmergencia);

        nuevaSede.agregarSala(new Sala(1, TipoSala.PREFERENCIAL, 10)); // Setea la primera sala como preferencial
        
        if (salasMedicas >= 2) {
            nuevaSede.agregarSala(new Sala(2, TipoSala.EMERGENCIA_CRITICA, 5)); // Setea la segunda  sala como de emergencia
        }
        
        for (int i = 3; i <= salasMedicas; i++) {
            nuevaSede.agregarSala(new Sala(i, TipoSala.NORMAL, 15)); //Setea las demas salas como comunes
        }

        nuevaSede.agregarConsultorio(new Consultorio(1, TipoConsultorio.PREFERENCIAL, 1, "Preferencial")); //Setea el primer consultorio como preferencial
        for (int i = 2; i <= consultorios; i++) {
            nuevaSede.agregarConsultorio(new Consultorio(i, TipoConsultorio.NORMAL, 1, "General")); //Setea el resto de consultorios como general
        }

        nuevaSede.agregarUsuario(new Usuario("valeria", "valeria123")); //Crea los usuario y contrasenia de los miebros del grupo
        nuevaSede.agregarUsuario(new Usuario("brandon", "brandon123"));
        nuevaSede.agregarUsuario(new Usuario("geanca", "geanca123"));
        nuevaSede.agregarUsuario(new Usuario("adrian", "adrian123"));

        SerializacionO serializador = new SerializacionO(); //Prepara los datos para serializar y enviar a guardar a los Json
        serializador.serializarObjeto(nuevaSede, archivoConfig);

        JOptionPane.showMessageDialog(null, "Configuracion guardada exitosamente");
    }
}
