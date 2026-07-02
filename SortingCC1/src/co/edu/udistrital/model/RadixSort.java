package co.edu.udistrital.model;

/**
 * Implementación del algoritmo Radix Sort.
 *
 * Este algoritmo ordena arreglos de números enteros no negativos
 * procesando cada dígito desde el menos significativo hasta
 * el más significativo.
 *
 * Para cada posición decimal se utiliza Counting Sort como
 * algoritmo auxiliar de ordenamiento estable.
 *
 * En esta implementación el ordenamiento final es descendente.
 *
 * Complejidad temporal:
 * Mejor caso: O(d * (n + k))
 * Caso promedio: O(d * (n + k))
 * Peor caso: O(d * (n + k))
 *
 * Donde:
 * d = cantidad de dígitos del número máximo
 * n = cantidad de elementos
 * k = rango de dígitos (base 10)
 *
 * Complejidad espacial:
 * O(n + k)
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class RadixSort {

    /**
     * Ordena un arreglo utilizando Radix Sort.
     *
     * Primero obtiene el valor máximo del arreglo para determinar
     * cuántos dígitos deben procesarse. Luego aplica Counting Sort
     * para cada posición decimal (unidades, decenas, centenas, etc.).
     *
     * @param arr Arreglo de enteros a ordenar.
     */
    public void ordenar(int[] arr) {
        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    /**
     * Obtiene el valor máximo dentro del arreglo.
     *
     * Este valor se utiliza para determinar el número
     * de iteraciones necesarias en Radix Sort.
     *
     * @param arr Arreglo de enteros.
     * @return Valor máximo encontrado.
     */
    private int getMax(int[] arr) {
        int max = arr[0];

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

    /**
     * Aplica Counting Sort sobre una posición decimal específica.
     *
     * El parámetro exp define qué dígito se está procesando:
     * - exp = 1   -> unidades
     * - exp = 10  -> decenas
     * - exp = 100 -> centenas
     *
     * Este método mantiene estabilidad entre iteraciones,
     * propiedad necesaria para el correcto funcionamiento
     * de Radix Sort.
     *
     * La acumulación del arreglo count está adaptada
     * para producir orden descendente.
     *
     * @param arr Arreglo a ordenar.
     * @param exp Posición decimal actual.
     */
    private void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 8; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}