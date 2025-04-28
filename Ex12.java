package Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] mas = new int[scan.nextInt()][scan.nextInt()];
            long seed = scan.nextLong();
            initArray(mas, seed);
            printArray(mas);
            System.out.println();
            printMaxIndex(mas);
        }

        // 1. Метод для инициализации двумерного массива случайными числами 0-10
        public static void initArray(int[][] array, long seed) {
            Random rand = new Random(seed);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = rand.nextInt(11); // 0-10 включительно
                }
            }
        }

        // 2. Метод для вывода массива с табуляцией после каждого элемента
        public static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }

        // 3. Метод для вывода индексов первых максимальных элементов в строках
        public static void printMaxIndex(int[][] array) {
            for (int[] row : array) {
                System.out.print(findMaxIndex(row) + " ");
            }
        }

        // Вспомогательный метод для поиска индекса первого максимума в строке
        private static int findMaxIndex(int[] row) {
            if (row.length == 0) return -1;
            int maxIndex = 0;
            for (int i = 1; i < row.length; i++) {
                if (row[i] > row[maxIndex]) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
    }
