import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ex5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива и seed для Random
            int n = scanner.nextInt();
            long seed = scanner.nextLong();

            // Ввод контрольного элемента
            int controlElement = scanner.nextInt();

            // Создание и заполнение массива случайными числами
            int[] array = new int[n];
            Random random = new Random(seed);
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(2, 16); // от 2 до 15 включительно
            }

            // Сортировка массива
            Arrays.sort(array);

            // Вывод отсортированного массива
            System.out.println(Arrays.toString(array));

            // Поиск контрольного элемента
            int index = Arrays.binarySearch(array, controlElement);

            if (index < 0) {
                // Элемент не найден
                System.out.println("ERROR");
            } else {
                // Создаем новый массив с элементами до контрольного включительно
                int[] newArray = new int[index + 1];
                System.arraycopy(array, 0, newArray, 0, index + 1);

                // Вывод нового массива
                System.out.println(Arrays.toString(newArray));
            }
        }
    }
