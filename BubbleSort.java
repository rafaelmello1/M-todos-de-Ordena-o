
/**
 * Bubble Sort
 * Complexidade de Tempo:
 * - Melhor caso: O(n) (quando o array já está ordenado)
 * - Pior caso: O(n^2)
 * - Caso médio: O(n^2)
 * Complexidade de Espaço:
 * - O(1) (in-place, não utiliza memória adicional significativa)
 */

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
