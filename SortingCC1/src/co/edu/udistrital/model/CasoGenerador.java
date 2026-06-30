package co.edu.udistrital.model;

public class CasoGenerador {

    // ---------- CASO PROMEDIO ----------
    public static int[] generarAleatorio(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        return arr;
    }

    // ---------- BUBBLE ----------
    public static int[] mejorBubble(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }

    public static int[] peorBubble(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    // ---------- SHELL ----------
    public static int[] mejorShell(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }

    public static int[] peorShell(int n) {
        return generarAleatorio(n);
    }

    // ---------- QUICK ----------
    public static int[] mejorQuick(int n) {
		int[] arr = new int[n];
		        
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static int[] peorQuick(int n) {
        int[] arr = new int[n];
        llenarAntiQuick(arr, 0, n - 1, new int[]{n});
        return arr;
    }

    // ---------- RADIX ----------
    public static int[] mejorRadix(int n) {
        return generarAleatorio(n);
    }

    public static int[] peorRadix(int n) {
        return generarAleatorio(n);
    }
    
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