package com.lanadenisenko.golovach.loop.homework;

import java.util.Arrays;

/**
 * Created by Satura on 27.01.2019.
 */
public class SortedArraysMerger {
    public static void main(String[] args) {
        int[] firstArray = {1, 1, 7, 9};
        int[] secondArray = {2, 3, 4, 4};

        int[] resultArray = new int[firstArray.length + secondArray.length];

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }
}
