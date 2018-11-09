package com.company;

import java.util.Random;
import java.util.Scanner;

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
        //В этой программе выполнены задания 2...4
        printArr(arr);
        System.out.println("Задание 2. Сумма: "+sumArr(arr));
        System.out.println("Задание 3. Введите число");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Число встречается "+numArr(arr, n)+" раз");
        System.out.println("Задание 4. Строка с макс.суммой: "+maxStr(arr));
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int sumArr(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum+= arr[i][j];
            }
        }
        return sum;
    }

    private static int numArr(int[][] arr, int n) {
        int countN = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] == n) {
                    countN++;
                }
            }
        }
        return countN;
    }

    private static int maxStr(int[][] arr) {
        int[] sumStr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sumStr[i]+= arr[i][j];
            }
        }
        int max = sumStr[0];
        int maxIndex = 0;
        for (int i = 0; i < sumStr.length; i++) {
            if(sumStr[i] > max) {
                max = sumStr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
