package com.lanadenisenko.golovach.loop.lecture;

import java.util.Arrays;

/**
 * Created by Satura on 23.01.2019.
 */
public class App03ArrayInverter {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        for (int index = 0; index < data.length / 2; index++) {
            swap(data, index, data.length - 1 - index);
        }

        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] data, int firstElement, int secondElement) {
        int tmpElement = data[firstElement];
        data[firstElement] = data[secondElement];
        data[secondElement] = tmpElement;
    }
}
