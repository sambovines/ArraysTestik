import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ex7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива и seed для генератора случайных чисел
            int size = scanner.nextInt();
            long seed = scanner.nextLong();

            // Создание и заполнение массива случайными числами от 10 до 20
            int[] array = new int[size];
            Random random = new Random(seed);
            for (int i = 0; i < size; i++) {
                array[i] = 10 + random.nextInt(11); // 10-20 включительно
            }

            // Вывод исходного массива
            System.out.println(Arrays.toString(array));

            // Ввод индексов
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();

            // Определяем границы для сортировки (от меньшего индекса к большему)
            int start = Math.min(index1, index2);
            int end = Math.max(index1, index2);

            // Сортируем часть массива между индексами (включительно)
            Arrays.sort(array, start, end + 1);

            // Вывод преобразованного массива
            System.out.println(Arrays.toString(array));
        }
    }
