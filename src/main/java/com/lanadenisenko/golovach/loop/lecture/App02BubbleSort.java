package com.lanadenisenko.golovach.loop.lecture;

import java.util.Arrays;

/**
 * Created by Satura on 19.10.2018.
 */
public class App02BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 50, 30, 20};

        for (int barrier = numbers.length - 1; barrier >= 1; barrier--) {
            for (int index = 0; index < barrier; index++) {
                conditionalSwap(numbers, index);

                System.out.print(index);
            }
            System.out.println();
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void conditionalSwap(int[] data, int index) {
        if (data[index] > data[index + 1]) {
            swapTwoElementsOfArray(data, index, index + 1);
        }
    }

    private static void swapTwoElementsOfArray(int[] numbers, int firstElement, int secondElement) {
        int tempElement = numbers[firstElement];
        numbers[firstElement] = numbers[secondElement];
        numbers[secondElement] = tempElement;
    }
}
