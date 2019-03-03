package hacker_rank_problems.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolutionArraysDS {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/hacker_rank_problems/Arrays/input-arraysds.txt"));

        int[][] array = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                array[i][j] = arrItem;
            }
        }

        int result = hourglassSum(array);
        System.out.println(result);
    }

    static int hourglassSum(int[][] array) {
        int result = -9 * 7 - 1;
        int temp = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                // Sum of elements in "hourglass"
                temp = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
