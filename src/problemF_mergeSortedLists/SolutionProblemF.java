package problemF_mergeSortedLists;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionProblemF {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("src/problemF_mergeSortedLists/input.txt"));
//        PrintWriter pw = new PrintWriter(System.out);

        short k = sc.nextShort();
        byte elem;


        byte[] array1 = new byte[sc.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextByte();
        }

        for (int i = 0; i < k - 1; i++) {
            int anotherLength = sc.nextInt();
            for (int j = 0; j < anotherLength; j++) {
                elem = sc.nextByte();
                array1 = Arrays.copyOf(array1, array1.length + 1);
                insertionSort(array1, elem);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void insertionSort(byte[] array, byte elem) {
        int j = Math.abs(Arrays.binarySearch(array, elem) + 1);
        if (j != array.length) {
            System.arraycopy(array, j, array, j + 1, array.length - 1 - j);
            array[j] = elem;
        } else {
            array[j - 1] = elem;
        }
    }
}