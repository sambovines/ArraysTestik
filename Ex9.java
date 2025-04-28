package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {
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
        System.out.println();
        for (int j=0; j<array[0].length; j++){ //цикл по столбцам
            int sum=0;
            for (int i=0; i<array.length; i++){ //цикл по строкам
                if (array[i][j]>0){
                    sum+=array[i][j];
                }
            }
            System.out.print(sum+" ");//печать после всего столбца
        }
    }
}
