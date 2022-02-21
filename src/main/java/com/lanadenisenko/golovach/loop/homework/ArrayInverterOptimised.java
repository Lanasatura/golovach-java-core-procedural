package com.lanadenisenko.golovach.loop.homework;

/**
 * Created by Satura on 26.01.2019.
 */
public class ArrayInverterOptimised {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        for (int index = data.length / 2; index >= 0; index--) {
            swap(data, index, data.length - 1 - index);
        }
    }

    private static void swap(int[] data, int firstElement, int secondElement) {
        int tempElement = data[firstElement];
        data[firstElement] = data[secondElement];
        data[secondElement] = tempElement;
    }
}
