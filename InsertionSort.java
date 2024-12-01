
/**
 * Insertion Sort
 * Complexidade de Tempo:
 * - Melhor caso: O(n) (quando o array já está ordenado)
 * - Pior caso: O(n^2) (quando o array está em ordem inversa)
 * - Caso médio: O(n^2)
 * Complexidade de Espaço:
 * - O(1) (in-place, não utiliza memória adicional significativa)
 */

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
