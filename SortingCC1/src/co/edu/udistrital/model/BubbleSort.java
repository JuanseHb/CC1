package co.edu.udistrital.model;

/**
 * Implementación del algoritmo Bubble Sort.
 *
 * Este algoritmo ordena un arreglo de números enteros
 * en orden descendente utilizando comparaciones e intercambios
 * entre elementos adyacentes.
 *
 * La implementación incluye una optimización mediante
 * una bandera de intercambio (swapped), que permite detener
 * el algoritmo anticipadamente si el arreglo ya está ordenado.
 *
 * Complejidad temporal:
 * <ul>
 *   <li>Mejor caso: O(n)</li>
 *   <li>Caso promedio: O(n²)</li>
 *   <li>Peor caso: O(n²)</li>
 * </ul>
 *
 * Complejidad espacial:
 * <ul>
 *   <li>O(1)</li>
 * </ul>
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 **/
public class BubbleSort {

    /**
     * Ordena un arreglo de enteros en orden descendente
     * usando el algoritmo Bubble Sort.
     *
     * Durante cada iteración, los elementos mayores se desplazan
     * hacia el inicio del arreglo mediante intercambios sucesivos.
     *
     * Si durante una pasada no ocurre ningún intercambio,
     * el algoritmo termina anticipadamente porque el arreglo
     * ya se encuentra ordenado.
     *
     * @param arr Arreglo de enteros que será ordenado.
     **/
    public void ordenar(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // descendente
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}