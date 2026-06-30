package co.edu.udistrital.controller;

/**
 * Clase principal de la aplicación.
 * 
 * Esta clase representa el punto de entrada del sistema y se encarga
 * de inicializar el controlador principal para arrancar la ejecución
 * del programa.
 * 
 * El controlador administra la interacción entre la vista y los modelos
 * de ordenamiento, permitiendo ejecutar pruebas de rendimiento sobre
 * diferentes algoritmos.
 * 
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class ApiMain {
    
    /**
     * Método principal del programa.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.iniciar();
    }
}