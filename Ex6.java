import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        long seed = scan.nextLong();

        double[] a = new double[n];
        Random rand = new Random(seed);

        for (int i = 0; i< a.length; i++) {
            a[i]= rand.nextDouble(0,2);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(a[0]+a[a.length-1]);
    }
}
