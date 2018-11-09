package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int H = 4;
    private static final int L = 5;

    public static void main(String[] args) {

        int[][] arr1 = initArr(H, L);
        printArr(arr1);

        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printArr(multArr(arr1, n));
    }
    
    private static int[][] initArr(int h, int l) {
        int[][] arr = new int[h][l];
        Random random = new Random();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] multArr(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = arr[i][j] * n;
            }
        }
        return arr;
    }
}
