package reverse_linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SolutionReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(Arrays.toString(list.toArray()));

        int temp;

        for (int i = 0; i < list.size() / 2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.get(list.size() - i - 1), temp);
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
