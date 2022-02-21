package com.lanadenisenko.golovach.loop.lecture;

import java.util.Arrays;

/**
 * Created by Satura on 19.10.2018.
 */
public class App01SwapElements {
    public static void main(String[] args) {
        int[] array = {20, 40, 10, 50, 40, 50, 14};

        for (int counter = 0; counter < array.length - 1; counter++) {
            if (currentElementIsMoreThanNext(array, counter)) {
                swapTwoElementsOfArray(array, counter, counter + 1);
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void swapTwoElementsOfArray(int[] array, int firstElement, int secondElement) {
        int tempElement = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = tempElement;
    }

    private static boolean currentElementIsMoreThanNext(int[] array, int counter) {
        return array[counter] > array[counter + 1];
    }
}
