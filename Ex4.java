package Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ex4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива и seed для Random
            int n = scanner.nextInt();
            long seed = scanner.nextLong();

            // Создание и заполнение массива случайными числами
            int[] a = new int[n];
            Random random = new Random(seed);
            for (int i = 0; i < n; i++) {
                a[i] = random.nextInt(-5, 16); // от -5 до 15 включительно
            }

            // Вывод исходного массива с пробелом после каждого элемента
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Поиск первого максимального элемента
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Поиск последнего отрицательного элемента
            int lastNegativeIndex = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] < 0) {
                    lastNegativeIndex = i;
                    break;
                }
            }

            // Если найден отрицательный элемент, меняем местами с максимальным
            if (lastNegativeIndex != -1) {
                int temp = a[maxIndex];
                a[maxIndex] = a[lastNegativeIndex];
                a[lastNegativeIndex] = temp;
            }

            // Вывод измененного массива с пробелом после каждого элемента
            for (int num : a) {
                System.out.print(num + " ");
            }
        }
    }
