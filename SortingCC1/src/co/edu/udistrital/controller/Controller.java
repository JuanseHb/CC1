package co.edu.udistrital.controller;

import co.edu.udistrital.model.BubbleSort;
import co.edu.udistrital.model.CasoGenerador;
import co.edu.udistrital.model.QuickSort;
import co.edu.udistrital.model.RadixSort;
import co.edu.udistrital.model.ShellSort;
import co.edu.udistrital.view.View;

/**
 * Controlador principal de la aplicación.
 *
 * Esta clase implementa la lógica de control del patrón MVC,
 * actuando como intermediario entre la vista y los modelos
 * de ordenamiento.
 *
 * Sus responsabilidades incluyen:
 * <ul>
 *   <li>Recibir la entrada del usuario desde la vista.</li>
 *   <li>Procesar los tamaños de prueba ingresados.</li>
 *   <li>Ejecutar pruebas de rendimiento sobre distintos algoritmos.</li>
 *   <li>Medir y reportar tiempos de ejecución.</li>
 * </ul>
 *
 * Los algoritmos evaluados son:
 * <ul>
 *   <li>Bubble Sort</li>
 *   <li>Shell Sort</li>
 *   <li>Quick Sort</li>
 *   <li>Radix Sort</li>
 * </ul>
 *
 * @author Juan Sebastian Henriquez Berrios
 * @author Andres David Orlando Maldonado
 * @version 1.0
 * @since 2026
 */
public class Controller {

    /** Instancia del algoritmo Bubble Sort. */
    private BubbleSort bubble;

    /** Instancia del algoritmo Shell Sort. */
    private ShellSort shell;

    /** Instancia del algoritmo Quick Sort. */
    private QuickSort quick;

    /** Instancia del algoritmo Radix Sort. */
    private RadixSort radix;

    /** Vista encargada de la interacción con el usuario. */
    private View vista;

    /**
     * Constructor del controlador.
     *
     * Inicializa la vista y todos los algoritmos
     * de ordenamiento disponibles en el sistema.
     */
    public Controller() {
        bubble = new BubbleSort();
        shell = new ShellSort();
        quick = new QuickSort();
        radix = new RadixSort();
        vista = new View();
    }

    /**
     * Inicia la ejecución del sistema.
     *
     * Solicita al usuario los tamaños de entrada,
     * los convierte a enteros y ejecuta las pruebas
     * correspondientes para cada valor.
     */
    public void iniciar() {
        String entrada = vista.leerValoresN();
        int[] valores = parsearEntrada(entrada);

        for (int n : valores) {
            ejecutarPruebas(n);
        }
    }

    /**
     * Convierte una cadena de texto con números separados por comas
     * en un arreglo de enteros.
     *
     * Ejemplo de entrada:
     * <pre>
     * 1000,5000,10000
     * </pre>
     *
     * @param entrada Cadena ingresada por el usuario.
     * @return Arreglo de enteros con los tamaños de prueba.
     */
    private int[] parsearEntrada(String entrada) {
        String[] partes = entrada.split(",");
        int[] valores = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Integer.parseInt(partes[i].trim());
        }

        return valores;
    }

    /**
     * Mide el tiempo de ejecución de Bubble Sort.
     *
     * @param arr Arreglo a ordenar.
     * @return Tiempo de ejecución en milisegundos.
     */
    public double medirBubble(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        bubble.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    /**
     * Mide el tiempo de ejecución de Shell Sort.
     *
     * @param arr Arreglo a ordenar.
     * @return Tiempo de ejecución en milisegundos.
     */
    public double medirShell(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        shell.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    /**
     * Mide el tiempo de ejecución de Quick Sort.
     *
     * @param arr Arreglo a ordenar.
     * @return Tiempo de ejecución en milisegundos.
     */
    public double medirQuick(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        quick.ordenar(copia, 0, copia.length - 1);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    /**
     * Mide el tiempo de ejecución de Radix Sort.
     *
     * @param arr Arreglo a ordenar.
     * @return Tiempo de ejecución en milisegundos.
     */
    public double medirRadix(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        radix.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    /**
 * Calcula el tiempo promedio de ejecución de un algoritmo
 * de ordenamiento sobre el mismo arreglo.
 *
 * El algoritmo seleccionado se ejecuta tres veces utilizando
 * exactamente el mismo arreglo de entrada. Cada ejecución es
 * medida en milisegundos y al final se calcula el promedio
 * aritmético de los tres tiempos obtenidos.
 *
 * Este método se utiliza para obtener una medición más estable
 * del caso promedio, reduciendo variaciones causadas por
 * procesos internos del sistema operativo o de la JVM.
 *
 *
 * @param arr Arreglo de enteros sobre el cual se realizarán
 *            las tres mediciones.
 * @param algoritmo Nombre del algoritmo a ejecutar.
 * @return Tiempo promedio de ejecución en milisegundos.
 */
private double calcularPromedio(int[] arr, String algoritmo) {
    double suma = 0;

    for (int i = 0; i < 3; i++) {
        switch (algoritmo) {

            case "bubble":
                suma += medirBubble(arr);
                break;

            case "shell":
                suma += medirShell(arr);
                break;

            case "quick":
                suma += medirQuick(arr);
                break;

            case "radix":
                suma += medirRadix(arr);
                break;
        }
    }

    return suma / 3.0;
}

    /**
     * Ejecuta las pruebas de rendimiento para un tamaño dado.
     *
     * Para cada algoritmo se evalúan:
     * <ul>
     *   <li>Mejor caso</li>
     *   <li>Peor caso</li>
     *   <li>Caso promedio</li>
     * </ul>
     *
     * Los resultados se muestran en consola en milisegundos.
     *
     * @param n Tamaño del arreglo de prueba.
     */
    public void ejecutarPruebas(int n) {

        int[] promedio = CasoGenerador.generarAleatorio(n);

        vista.mostrar("=====================================");
        vista.mostrar("PRUEBAS PARA N = " + n);
        vista.mostrar("=====================================");
        vista.mostrar("");

        vista.mostrar("BUBBLE SORT");
        vista.mostrar("Mejor: " + medirBubble(CasoGenerador.mejorBubble(n)) + " ms");
        vista.mostrar("Peor: " + medirBubble(CasoGenerador.peorBubble(n)) + " ms");
        vista.mostrar("Promedio: " + calcularPromedio(promedio, "bubble") + " ms");
        vista.mostrar("");

        vista.mostrar("SHELL SORT");
        vista.mostrar("Mejor: " + medirShell(CasoGenerador.mejorShell(n)) + " ms");
        vista.mostrar("Peor: " + medirShell(CasoGenerador.peorShell(n)) + " ms");
        vista.mostrar("Promedio: " + calcularPromedio(promedio, "shell") + " ms");
        vista.mostrar("");

        vista.mostrar("QUICK SORT");
        vista.mostrar("Mejor: " + medirQuick(CasoGenerador.mejorQuick(n)) + " ms");
        vista.mostrar("Peor: " + medirQuick(CasoGenerador.peorQuick(n)) + " ms");
        vista.mostrar("Promedio: " + calcularPromedio(promedio, "quick") + " ms");
        vista.mostrar("");

        vista.mostrar("RADIX SORT");
        vista.mostrar("Mejor: " + medirRadix(CasoGenerador.mejorRadix(n)) + " ms");
        vista.mostrar("Peor: " + medirRadix(CasoGenerador.peorRadix(n)) + " ms");
        vista.mostrar("Promedio: " + calcularPromedio(promedio, "radix") + " ms");
    }
}