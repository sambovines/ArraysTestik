package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long r = scan.nextLong();
        int[] a = new int[n];
        init(a,r);
        print(a);
        System.out.println(findMax(a));
    }

    public static void init(int[] mas, long r) {
        Random rand = new Random(r);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-3, 6);
        }
    }

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] mas) {
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[max]) {
                max = i;
            }
        }
        return max;
    }
}
