package arrays.task01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size, N =");
        n = in.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("Input any number, K =");
        int k = in.nextInt();
        int sum = 0;
        for (int i : a) {
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
