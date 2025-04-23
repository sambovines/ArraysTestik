package Arrays;
import java.util.Locale;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long seed = scan.nextLong();
        double[] a = new double[n];
        Random rand = new Random(seed);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextDouble(0, 5);
            System.out.printf("%.2f ", a[i]);
        }
        System.out.println();
        double sum = 0;
        for (int x = 0; x< a.length; x++) {
            sum +=a[x];
        }
        sum/=n;
        System.out.printf("%.2f", sum);
        System.out.println();
        for (int b=0; b<a.length; b++) {
            if (a[b]>sum) {
                a[b]=sum;
            }
            System.out.printf("%.2f ", a[b]);
        }
    }
}