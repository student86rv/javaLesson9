package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int L = 100;

    public static void main(String[] args) {
        int[] arr = initArr(L);
        System.out.println(Arrays.toString(arr));

        System.out.println("Введите число N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printArr(transArr(arr, n));
    }

    private static int[] initArr(int arrSize) {
        int[] arr = new int[arrSize];
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static int[][] transArr(int[] arr, int n) {
        int newArrSize = L; //дополняем длину исходного массива
        while(newArrSize % n != 0) { // до числа, кратного N
            newArrSize++;
        }
        int[][] newArr = new int[n][newArrSize / n];
        int times = 0; //смещение след. строки
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if(j+times < arr.length) {
                    newArr[i][j] = arr[j + times];
                }
            }
            times+= newArr[i].length;
        }
        return newArr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
