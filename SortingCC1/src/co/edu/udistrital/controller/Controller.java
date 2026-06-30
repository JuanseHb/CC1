package co.edu.udistrital.controller;

import co.edu.udistrital.model.BubbleSort;
import co.edu.udistrital.model.QuickSort;
import co.edu.udistrital.model.RadixSort;
import co.edu.udistrital.model.ShellSort;
import co.edu.udistrital.view.View;

public class Controller {

    private BubbleSort bubble;
    private ShellSort shell;
    private QuickSort quick;
    private RadixSort radix;
    private View vista;

    public Controller() {
        bubble = new BubbleSort();
        shell = new ShellSort();
        quick = new QuickSort();
        radix = new RadixSort();
        vista = new View();
    }

   
    public int[] generarArreglo(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 1000000);
        }

        return arr;
    }

   
    public int[] casoPromedio(int n) {
        return generarArreglo(n);
    }

    public int[] mejorCaso(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }

    public int[] peorCaso(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public double medirBubble(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        bubble.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    public double medirShell(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        shell.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    public double medirQuick(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        quick.ordenar(copia, 0, copia.length - 1);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    public double medirRadix(int[] arr) {
        int[] copia = arr.clone();

        long inicio = System.nanoTime();
        radix.ordenar(copia);
        long fin = System.nanoTime();

        return (fin - inicio) / 1_000_000.0;
    }

    public void ejecutarPruebas(int n) {

        int[] mejor = mejorCaso(n);
        int[] peor = peorCaso(n);
        int[] promedio = casoPromedio(n);

        vista.mostrar("=====================================");
        vista.mostrar("PRUEBAS PARA N = " + n);
        vista.mostrar("=====================================");
        
        vista.mostrar("");
        
        vista.mostrar("BUBBLE SORT");
        vista.mostrar("Mejor: " + medirBubble(mejor) + "ms");
        vista.mostrar("Mejor: " + medirBubble(peor) + "ms");
        vista.mostrar("Mejor: " + medirBubble(promedio) + "ms");
        
        vista.mostrar("");
        
        vista.mostrar("SHELL SORT");
        vista.mostrar("Mejor: " + medirShell(mejor) + "ms");
        vista.mostrar("Mejor: " + medirShell(peor) + "ms");
        vista.mostrar("Mejor: " + medirShell(promedio) + "ms");
        
        vista.mostrar("");
        
        vista.mostrar("QUICK SORT");
        vista.mostrar("Mejor: " + medirQuick(mejor) + "ms");
        vista.mostrar("Mejor: " + medirQuick(peor) + "ms");
        vista.mostrar("Mejor: " + medirQuick(promedio) + "ms");
        
        vista.mostrar("");
        
        vista.mostrar("RADIX SORT");
        vista.mostrar("Mejor: " + medirRadix(mejor) + "ms");
        vista.mostrar("Mejor: " + medirRadix(peor) + "ms");
        vista.mostrar("Mejor: " + medirRadix(promedio) + "ms");
        
        
    }
}