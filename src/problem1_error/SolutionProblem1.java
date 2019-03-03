package problem1_error;

import java.io.PrintWriter;
import java.util.Scanner;

public class SolutionProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        byte n = sc.nextByte();
        int[] ab = new int[n];

        double[] p = new double[n];

        int a;
        int b;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            ab[i] = a * b;
            sum += ab[i];
        }

        for (int i = 0; i < n; i++) {
            p[i] = ab[i] / sum;
            System.out.println(p[i]);
        }

        sc.close();
        out.flush();
    }
}
