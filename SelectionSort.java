
/**
 * Selection Sort
 * Complexidade de Tempo:
 * - Melhor caso: O(n^2) (não depende da entrada, sempre realiza todas as comparações)
 * - Pior caso: O(n^2)
 * - Caso médio: O(n^2)
 * Complexidade de Espaço:
 * - O(1) (in-place, não utiliza memória adicional significativa)
 */

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
