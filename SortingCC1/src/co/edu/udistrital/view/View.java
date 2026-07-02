package co.edu.udistrital.view;

import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 * a través de la consola.
 *
 * Pertenece a la capa View dentro del patrón MVC
 * (Modelo - Vista - Controlador).
 *
 * Sus responsabilidades principales son:
 * - Mostrar mensajes al usuario
 * - Solicitar datos de entrada
 * - Retornar la información ingresada al Controller
 *
 * La lógica de negocio no debe implementarse aquí,
 * únicamente la interacción visual.
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class View {
    
    /**
     * Objeto Scanner utilizado para capturar
     * entradas desde la consola.
     */
    private Scanner sc = new Scanner(System.in);

    /**
     * Muestra un mensaje en consola.
     *
     * Este método centraliza la salida por consola
     * permitiendo que el Controller delegue en la
     * vista toda interacción visual con el usuario.
     *
     * @param mensaje Texto a mostrar en consola.
     */
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Solicita al usuario una lista de valores N
     * separados por comas.
     *
     * Ejemplo de entrada:
     * 4000, 40000, 4000000
     *
     * Estos valores representan tamaños de arreglos
     * que posteriormente serán usados en las pruebas
     * de rendimiento de los algoritmos.
     *
     * @return Cadena ingresada por el usuario.
     */
    public String leerValoresN() {
        System.out.println("Ingrese valores de N separados por comas:");
        return sc.nextLine();
    }
}