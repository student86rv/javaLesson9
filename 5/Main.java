package com.company;

import java.util.Random;

public class Main {

    private static int[][] arr = new int[5][6];

    static {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    public static void main(String[] args) {

        printArr(arr);
        System.out.println("-----------------");
        printArr(transArr(arr));
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transArr(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[arr.length - 1 - i][j];
            }
        }
        return newArr;
    }
}
