package com.lanadenisenko.golovach.loop.lecture;

import java.util.Arrays;

/**
 * Created by Satura on 26.01.2019.
 */
public class App04ArrayMerge {
    public static void main(String[] args) {
        int[] firstArray = {10, 20, 30, 40, 50};

        int[] secondArray = {10, 20, 30, 40, 50};

        System.arraycopy(secondArray, 1, firstArray, 2, 2);
        System.out.println(Arrays.toString(secondArray));

        System.out.println(Arrays.toString(firstArray));
    }
}
