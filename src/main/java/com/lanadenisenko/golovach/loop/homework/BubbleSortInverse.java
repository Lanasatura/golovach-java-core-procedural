package com.lanadenisenko.golovach.loop.homework;

import java.util.Arrays;

/**
 * Created by Satura on 19.01.2019.
 */
public class BubbleSortInverse {
    public static void main(String[] args) {
        int[] data = {50,80,10,60,20,40};

        for (int barrier = 0; barrier <= data.length - 1; barrier++) {
            for (int index = data.length - 1; index > barrier; index--) {
                conditionalSwap(data, index);

                //System.out.print(index);
            }
            //System.out.println();
            //System.out.println(Arrays.toString(data));
        }
        System.out.println(Arrays.toString(data));
    }

    private static void conditionalSwap(int[] data, int index) {
        if (data[index - 1] > data[index]) {
            swap(data, index - 1, index);
        }
    }

    private static void swap(int[] data, int firstElement, int secondElement) {
        int tmpElement = data[firstElement];
        data[firstElement] = data[secondElement];
        data[secondElement] = tmpElement;
    }
}
