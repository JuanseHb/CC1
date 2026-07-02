package co.edu.udistrital.model;

/**
 * Implementación del algoritmo Quick Sort.
 *
 * Este algoritmo ordena un arreglo de enteros en orden
 * descendente utilizando la estrategia divide y vencerás.
 *
 * La implementación utiliza:
 * - Esquema de partición de Hoare
 * - Pivote central
 *
 * Funcionamiento general:
 * 1. Selecciona un pivote (elemento central).
 * 2. Reorganiza el arreglo colocando:
 *    - Elementos mayores a la izquierda
 *    - Elementos menores a la derecha
 * 3. Aplica recursión sobre ambas particiones.
 *
 * Complejidad temporal:
 * - Mejor caso: O(n log n)
 * - Caso promedio: O(n log n)
 * - Peor caso: O(n²)
 *
 * Complejidad espacial:
 * - O(log n) por recursión
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class QuickSort {

    /**
     * Ordena recursivamente un arreglo usando Quick Sort.
     *
     * Divide el arreglo en dos particiones usando el pivote
     * y luego ordena cada partición recursivamente.
     *
     * @param arr Arreglo a ordenar.
     * @param low Índice inicial del subarreglo.
     * @param high Índice final del subarreglo.
     */
    public void ordenar(int[] arr, int low, int high) {
        if (low < high) {
            int pi = particion(arr, low, high);

            ordenar(arr, low, pi);
            ordenar(arr, pi + 1, high);
        }
    }

    /**
     * Realiza la partición del arreglo usando
     * el esquema de Hoare.
     *
     * Selecciona el elemento central como pivote y mueve
     * los elementos mayores hacia la izquierda y los
     * menores hacia la derecha, ya que el ordenamiento
     * es descendente.
     *
     * @param arr Arreglo en proceso de ordenamiento.
     * @param low Índice inicial.
     * @param high Índice final.
     * @return Índice de partición.
     */
    private int particion(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];

        int i = low - 1;
        int j = high + 1;

        while (true) {

            do {
                i++;
            } while (arr[i] > pivot); // descendente

            do {
                j--;
            } while (arr[j] < pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }

    /**
     * Intercambia dos posiciones dentro del arreglo.
     *
     * @param arr Arreglo donde se realizará el intercambio.
     * @param a Primer índice.
     * @param b Segundo índice.
     */
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}