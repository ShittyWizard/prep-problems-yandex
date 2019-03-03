package hacker_rank_problems.Arrays;

public class SolutionArraysLeftRotation {
    static int[] rotLeft(int[] a1, int d) {
        int [] a2 = new int[a1.length];
        for (int i = a1.length - 1; i >= 0; i--) {
            if ((i - d) >=0) {
                a2[i - d] = a1[i];
            } else {
                a2[a2.length + (i - d)]= a1[i];
            }
        }
        return a2;
    }
}
