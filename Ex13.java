package Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] ar = new int[scan.nextInt()];
            long seed = scan.nextLong();
            init(ar, seed);
            print(ar);
            int[] b = reduceAfterMax(ar);
            print(b);
        }

        // 1. Инициализация массива случайными числами от -3 до 5
        public static void init(int[] mas, long seed) {
            Random rand = new Random(seed);
            for (int i = 0; i < mas.length; i++) {
                mas[i] = rand.nextInt(9) - 3; // диапазон -3..5
            }
        }

        // 2. Вывод массива в строку через пробелы
        public static void print(int[] mas) {
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            System.out.println();
        }

        // 3. Поиск индекса первого максимального элемента
        public static int findMax(int[] mas) {
            if (mas.length == 0) return -1;
            int maxIndex = 0;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] > mas[maxIndex]) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        }

        // 4. Создание нового массива без элементов после первого максимума
        public static int[] reduceAfterMax(int[] mas) {
            int maxIndex = findMax(mas);
            if (maxIndex == -1) return new int[0]; // если массив пустой

            int[] result = new int[maxIndex + 1];
            System.arraycopy(mas, 0, result, 0, maxIndex + 1);
            return result;
        }
    }
