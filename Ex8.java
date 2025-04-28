package Arrays;

import java.util.Random;
import java.util.Scanner;

/*Задача: Пользователь вводит количество строк и столбцов двумерного массива,
а затем начальное значение генератора случайных чисел.
Создать целочисленный массив указанной размерности и инициализировать
его случайными числами от -5 до 4 (включительно). Массив вывести на
консоль в виде таблицы, элементы которой отделяются знаками табуляции.
Знак табуляции должен быть и  в конце каждой строки.
Найти максимальный элемент и подсчитать, сколько раз он встречается в
массиве. Вывести максимальный элемент и найденное количество с  новой
строки через пробел.

 */

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(-5, 5);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int kol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    kol++;
                }
            }
        }
        System.out.printf("%d %d", max, kol);
    }
}
