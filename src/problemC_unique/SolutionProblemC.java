package problemC_unique;

import java.io.PrintWriter;
import java.util.Scanner;

public class SolutionProblemC {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(System.out);
            int n = sc.nextInt();

            int elem;
            int check;

            if (n == 1) {
                pw.println(sc.nextInt());
            } else {
                elem = sc.nextInt();
                pw.println(elem);
                check = elem;
                for (int i = 1; i < n; i++) {
                    elem = sc.nextInt();
                    if (elem != check) {
                        pw.println(elem);
                        check = elem;
                    }
                }
            }
            sc.close();
            pw.flush();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
