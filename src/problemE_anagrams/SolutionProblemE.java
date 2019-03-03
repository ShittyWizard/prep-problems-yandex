package problemE_anagrams;

import java.io.PrintWriter;
import java.util.Scanner;

public class SolutionProblemE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s1 = sc.next();
        String s2 = sc.next();
        boolean isAnagram = true;
        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            int[] letters = new int[256];

            for (char c : s1.toCharArray()) {
                letters[c]++;
            }

            for (char c : s2.toCharArray()) {
                if (--letters[c] < 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            pw.println(1);
        } else {
            pw.println(0);
        }
        sc.close();
        pw.flush();
    }
}
