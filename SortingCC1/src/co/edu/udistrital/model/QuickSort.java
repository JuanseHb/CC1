package co.edu.udistrital.model;

public class QuickSort {

    public void ordenar(int[] arr, int low, int high) {
        if (low < high) {
            int pi = particion(arr, low, high);

            ordenar(arr, low, pi);
            ordenar(arr, pi + 1, high);
        }
    }

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

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}