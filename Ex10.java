import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(-10, 11);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        // Поиск первых отрицательных элементов в строках
        for (int i = 0; i < array.length; i++) {
            int foundIndex = -1;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    foundIndex = j;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.println(foundIndex);
            } else {
                System.out.println("NO");
            }
        }
        }
    }
