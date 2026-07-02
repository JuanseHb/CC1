package co.edu.udistrital.model;

/**
 * Implementación del algoritmo Shell Sort.
 *
 * Shell Sort es una mejora de Insertion Sort que permite
 * comparar y mover elementos que están separados por una
 * cierta distancia llamada gap.
 *
 * El algoritmo comienza con gaps grandes y los reduce
 * progresivamente hasta llegar a 1, momento en el cual
 * el algoritmo se comporta como un Insertion Sort.
 *
 * En esta implementación:
 * - El ordenamiento es descendente.
 * - La secuencia de gaps usada es:
 *   n/2, n/4, n/8, ..., 1
 *
 * Complejidad temporal:
 * - Mejor caso: O(n log n) aproximadamente
 * - Caso promedio: Depende de la secuencia de gaps
 * - Peor caso: Aproximadamente O(n²)
 *
 * Complejidad espacial:
 * - O(1)
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class ShellSort {

    /**
     * Ordena un arreglo utilizando Shell Sort.
     *
     * El algoritmo divide el arreglo en subgrupos
     * definidos por el gap actual y aplica una lógica
     * similar a Insertion Sort sobre cada grupo.
     *
     * A medida que el gap disminuye, el arreglo se va
     * acercando progresivamente al orden final.
     *
     * @param arr Arreglo de enteros a ordenar.
     */
    public void ordenar(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] < temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }
}