
import java.util.Random;

public class MergeSortTest {
    public static void main(String[] args) {
        // Tamanhos de array a serem testados
        int[] sizes = {100, 1000, 10000, 50000, 100000};

        for (int size : sizes) {
            // Gerar array aleatório
            int[] randomArray = generateRandomArray(size);

            // Copiar o array para garantir que todos os testes usem os mesmos dados
            int[] arrayToSort = randomArray.clone();

            // Medir o tempo de execução do MergeSort
            long startTime = System.nanoTime();
            MergeSort.sort(arrayToSort);
            long endTime = System.nanoTime();

            // Calcular e imprimir o tempo gasto
            long duration = endTime - startTime;
            System.out.printf("Tamanho do array: %d | Tempo de execução: %.3f ms%n", size, duration / 1_000_000.0);

            // Verificar se o array está ordenado
            if (!isSorted(arrayToSort)) {
                System.out.println("Erro: O array não está ordenado corretamente.");
            }
        }
    }

    // Gera um array aleatório com elementos entre 0 e 1.000.000
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1_000_000);
        }
        return arr;
    }

    // Verifica se o array está ordenado
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
