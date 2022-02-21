package com.lanadenisenko.golovach.loop.lecture;

import java.util.Arrays;

/**
 * Created by Satura on 19.10.2018.
 */
public class App02BubbleSort {
    public static void main(String[] args) {
        int[] data = {40, 10, 50, 30, 20};

        for (int barrier = data.length - 1; barrier >= 1; barrier--) {
            for (int index = 0; index < barrier; index++) {
                conditionalSwap(data, index);

                System.out.print(index);
            }
            System.out.println();
            System.out.println(Arrays.toString(data));
        }
        System.out.println(Arrays.toString(data));
    }

    private static void conditionalSwap(int[] data, int index) {
        if (data[index] > data[index + 1]) {
            swap(data, index, index + 1);
        }
    }

    private static void swap(int[] data, int firstElement, int secondElement) {
        int tmpElement = data[firstElement];
        data[firstElement] = data[secondElement];
        data[secondElement] = tmpElement;
    }
}
