package Arrays;
import java.util.Scanner;
public class Ex3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива
            int n = scanner.nextInt();

            // Ввод элементов массива
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Находим последний минимальный элемент
            int min = a[0];
            int lastMinIndex = 0;

            for (int i = 1; i < n; i++) {
                if (a[i] <= min) {  // "<=" для нахождения последнего минимального
                    min = a[i];
                    lastMinIndex = i;
                }
            }

            // Заменяем его на -1
            a[lastMinIndex] = -1;

            // Выводим массив через пробелы
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i < n - 1 ? " " : ""));
            }
        }
    }