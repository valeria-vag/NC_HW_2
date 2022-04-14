package com.netcracker.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex13 {


    public void combination() {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[6];
        for (int i = 1; i <= 49; i++) {
            list.add(i);
        }

        System.out.println("List: " + "\n" + list);

        Random random = new Random();
        System.out.println("Unsorted combination:");
        for (int i = 0; i < 6; i++) {
            int j = random.nextInt(49 - i);
            array[i] = list.get(j);
            list.remove(j);
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        System.out.println("New list:" + "\n" + list);

        System.out.println("Sorted combination:");

        Arrays.sort(array);
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
