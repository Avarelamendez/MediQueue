/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import Modelos.Sede;
import Menus.MenuConfiguracion;
import Menus.MenuLogin;
import Menus.MenuPrincipal;
import Serializacion.SerializacionO;

/**
 *
 * @author Valeria
 */
public class MediQueue {

    public static void main(String[] args) {
        String rutaConfig = "config.json"; // Ruta del archivo Json
        SerializacionO serializador = new SerializacionO();

        if (!serializador.existeArchivo(rutaConfig)) { // Verificamos si el archivo existe, sino se llama a la clase de menu configuracion para el seteo inicial
            MenuConfiguracion.ejecutarConfiguracion(rutaConfig);
        }

        Sede sedeSistema = serializador.deserializarObjeto(rutaConfig, Sede.class); // Deserealizamos el archivo Json

        if (sedeSistema != null) {
            boolean loginExitoso = MenuLogin.ejecutarLogin(sedeSistema); // Llamamos a la clase del menu de login y en caso de recibir TRUE abriria el menu principal
            if (loginExitoso) {
                MenuPrincipal.mostrar(sedeSistema);
            }
        } else { // Muestra en mensaje en caso de haber habido algun error con el archivo Json existente
            System.out.println("El archivo config.json esta danado o vacio");
        }
    }
}
