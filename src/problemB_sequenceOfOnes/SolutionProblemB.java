package problemB_sequenceOfOnes;

import java.util.Scanner;
import java.util.Stack;

public class SolutionProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Boolean> stackOfOnes = new Stack<>();

        int n = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("1")) {
                stackOfOnes.push(true);
                if (stackOfOnes.size() > counter) {
                    counter = stackOfOnes.size();
                }
            } else {
                if (!stackOfOnes.empty()) {
                    //stackOfOnes = new Stack<>();
                    stackOfOnes.removeAllElements();
                }
            }
        }
        sc.close();
        System.out.println(counter);
    }
}
