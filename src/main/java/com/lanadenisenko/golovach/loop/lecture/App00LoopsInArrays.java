package com.lanadenisenko.golovach.loop.lecture;

/**
 * Created by Satura on 19.10.2018.
 */
public class App00LoopsInArrays {
    public static void main(String[] args) {
        printIntNumbersFromZeroToTen();

        printElementsOfArray();
    }

    private static void printIntNumbersFromZeroToTen() {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(counter);
        }

        System.out.println();
    }

    private static void printElementsOfArray() {
        int[] array = {10, 20, 30, 40, 50};

        for (int i : array) {
            System.out.println(i);
        }

        for (int counter = 0; counter < array.length; counter += 10) {
            System.out.println(counter);
        }
    }
}
