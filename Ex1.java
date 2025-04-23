package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long seed = scan.nextLong();
        int[] a = new int[n];
        Random rand = new Random(seed);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-5, 6);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sum = 0;
        double sum2 = 1.;
        for (int x = 0; x< a.length; x++) {
           if (a[x]>=0) {
               sum +=a[x];
           } else {
               sum2 *=a[x];
           }
        }
        System.out.print(sum+" "+sum2);
    }
}
