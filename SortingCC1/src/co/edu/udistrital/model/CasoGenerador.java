package co.edu.udistrital.model;

/**
 * Clase encargada de generar los arreglos de prueba
 * utilizados para medir el rendimiento de los algoritmos
 * de ordenamiento del sistema.
 *
 * Esta clase permite generar:
 * <ul>
 *   <li>Casos promedio (arreglos aleatorios)</li>
 *   <li>Mejores casos para cada algoritmo</li>
 *   <li>Peores casos para cada algoritmo</li>
 * </ul>
 *
 * Cada algoritmo posee características particulares, por lo que
 * sus mejores y peores casos pueden diferir dependiendo de la
 * implementación utilizada.
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class CasoGenerador {

    /**
     * Genera un arreglo aleatorio de tamaño n.
     *
     * Este arreglo representa el caso promedio para los
     * algoritmos de ordenamiento, ya que no presenta
     * una estructura específica favorable o desfavorable.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo con valores aleatorios entre 0 y 999999.
     */
    public static int[] generarAleatorio(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        return arr;
    }

    // ---------- BUBBLE ----------

    /**
     * Genera el mejor caso para Bubble Sort.
     *
     * Como Bubble Sort ordena en forma descendente y usa
     * optimización por bandera de intercambio, el mejor caso
     * ocurre cuando el arreglo ya está ordenado en el orden deseado.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo en orden descendente.
     */
    public static int[] mejorBubble(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }

    /**
     * Genera el peor caso para Bubble Sort.
     *
     * Ocurre cuando el arreglo está en el orden opuesto
     * al requerido, obligando al máximo número de comparaciones
     * e intercambios.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo en orden ascendente.
     */
    public static int[] peorBubble(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    // ---------- SHELL ----------

    /**
     * Genera el mejor caso para Shell Sort.
     *
     * Un arreglo previamente ordenado en el orden requerido
     * minimiza desplazamientos durante las inserciones por gap.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo en orden descendente.
     */
    public static int[] mejorShell(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }

    /**
     * Genera un caso desfavorable para Shell Sort.
     *
     * Debido a que el peor caso depende de la secuencia de gaps,
     * se utiliza un arreglo aleatorio como aproximación práctica.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo aleatorio.
     */
    public static int[] peorShell(int n) {
        return generarAleatorio(n);
    }

    // ---------- QUICK ----------

    /**
     * Genera el mejor caso para Quick Sort.
     *
     * En esta implementación con pivote central, un arreglo
     * ascendente tiende a generar particiones balanceadas,
     * mejorando el rendimiento.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo en orden ascendente.
     */
    public static int[] mejorQuick(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    /**
     * Genera un peor caso aproximado para Quick Sort.
     *
     * Utiliza una estrategia anti-QuickSort para intentar
     * desbalancear las particiones recursivas.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo desfavorable para Quick Sort.
     */
    public static int[] peorQuick(int n) {
        int[] arr = new int[n];
        llenarAntiQuick(arr, 0, n - 1, new int[]{n});
        return arr;
    }

    // ---------- RADIX ----------

    /**
     * Genera un caso favorable para Radix Sort.
     *
     * Debido a que Radix Sort depende principalmente del número
     * de dígitos y no del orden inicial del arreglo, se utiliza
     * un arreglo aleatorio.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo aleatorio.
     */
    public static int[] mejorRadix(int n) {
        return generarAleatorio(n);
    }

    /**
     * Genera un caso desfavorable para Radix Sort.
     *
     * En Radix Sort no existe una diferencia significativa entre
     * mejor y peor caso respecto al orden inicial, por lo que
     * también se usa un arreglo aleatorio.
     *
     * @param n Tamaño del arreglo.
     * @return Arreglo aleatorio.
     */
    public static int[] peorRadix(int n) {
        return generarAleatorio(n);
    }

    /**
     * Método recursivo auxiliar para construir un arreglo
     * anti-QuickSort.
     *
     * Coloca valores decrecientes en posiciones centrales
     * para intentar provocar particiones desbalanceadas.
     *
     * @param arr Arreglo en construcción.
     * @param low Índice inferior.
     * @param high Índice superior.
     * @param valor Contenedor mutable del valor actual.
     */
    private static void llenarAntiQuick(int[] arr, int low, int high, int[] valor) {
        if (low > high) {
            return;
        }

        int mid = (low + high) / 2;

        arr[mid] = valor[0]--;

        llenarAntiQuick(arr, low, mid - 1, valor);
        llenarAntiQuick(arr, mid + 1, high, valor);
    }
}