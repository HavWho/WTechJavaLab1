package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static double firstTask(double x, double y) {
        return ((1 + Math.pow(Math.sin(x + y), 2)) / 2 + Math.abs(x - (2 * x / 1 + x * x * y * y))) + x;
    }

    public static boolean secondTask(double x, double y) {
        return ((y <= 0 && y >= -3) && (x >= -6 && x <= 6)) || ((y > 0 && y <= 5) && (x >= -4 && x <= 4));
    }

    public static void thirdTask(double x, double a, double b, double h) {
        if (x < a || x >= b) {
            System.out.println("Your x is below a or above b");
            return;
        }

        while (x <= b) {
            System.out.println( x + " -- " + Math.tan(x));
            x += h;
        }
    }

    public static void fourthTask(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(numArray[i]);

            if(bigInteger.isProbablePrime((int) Math.log(numArray[i]))) {
                System.out.print(i + "  ");
            }
        }
        System.out.println(" ");
    }

    public static void fifthTask(int[] numArray){
        int[] arr = numArray;

        int j;
        int i = 0;
        int k = 0;

        do {
            for (j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] = 0;
                }
            }
            i++;
        } while (i < arr.length);

        for (i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            if (arr[i] == 0)
                k++;
        }
        System.out.printf("\nk = %d", k);
    }

    public static void sixthTask(){
        int[] arr = {1, 2, 3, 4, 5};
        int[][] resArray = new int[5][5];
        int n = 5;

        int j = 0;
        int t = n;
        int valup = 0;
        int valdown = 0;

        for (int i = 0; i < n; i++) {
            
            while (j < t) {
                resArray[i][j] = arr[j+valup];
                System.out.printf("%d ", resArray[i][j]);
                j++;
                if (j == t) {
                    while (j<n) {
                        resArray[i][j] = arr[valdown];
                        System.out.printf("%d ", resArray[i][j]);
                        valdown++;
                        j++;
                    }
                    valdown = 0;
                }
            }
            
            valup++;
            t--;
            j = 0;
            System.out.println();
        }
    }

    public static void seventhTask(int[] numArray){
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= numArray.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < numArray.length; outer++) {
                temp = numArray[outer];
                inner = outer;
                while (inner > h - 1 && numArray[inner - h] >= temp) {
                    numArray[inner] = numArray[inner - h];
                    inner -= h;
                }
                numArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public static void eighthTask(){
        int n = 5;
        int[] arr1 = { 0, 1, 2, 6, 9 };
        int[] arr2 = { 5, 7, 78, 88, 89 };
        int[] resArr = new int[10];

        int i;
        int j = 0;
        int t = 0;
        boolean chDouble = false;

        i=0;

        while (i<n*2) {

            if (t==n)
                t--;
            if ((arr1[j] < arr2[t])&&(j < n)) {
                resArr[i] = arr1[j];
                j++;
                chDouble = true;
            }

            if (j==n)
                j--;
            if ((arr1[j] >= arr2[t])&&(t < n)) {
                if (chDouble)
                {
                    i++;
                    chDouble = false;
                }
                resArr[i] = arr2[t];
                t++;
            }

            i++;
        }

        i = n * 2 - (n - j);

        if (t != n) {
            i = n * 2 - (n - t);
        }

        while (i < n * 2) {
            if (j != n) {
                resArr[i] = arr1[j];
                j++;
            }

            if (t != n) {
                resArr[i] = arr2[t];
                t++;
            }

            i++;
        }

        for (i = 0; i < n * 2; i++) {
            System.out.printf("%d ", resArr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(firstTask(1, 2));

        System.out.println(" ");

        System.out.println(secondTask(3, 0));
        System.out.println(secondTask(5, 1));
        System.out.println(secondTask(0, -7));

        System.out.println(" ");

        thirdTask(0, 0, 10, 0.5);
        thirdTask(0, 1, 10, 0.5);

        System.out.println(" ");

        fourthTask(new int[]{2, 3, 4, 5, 6, 7});

        System.out.println(" ");

        fifthTask(new int[] {2, 3, 2, 3, 4, 3, 5, 3, 6, 10, 11});

        System.out.println(" ");
        System.out.println(" ");

        sixthTask();

        System.out.println(" ");

        int[] testArray = new int[]{124124, 1241421, 1, 0, 0, 1241241, 123456789, 49, 5, 44, 3, 2, 998};
        seventhTask(testArray);
        System.out.println(Arrays.toString(testArray));

        System.out.println(" ");

        eighthTask();

        System.out.println(" ");
        System.out.println(" ");

        Ball[] balls = new Ball[] {new Ball(true, 1.5), new Ball(false, 2), new Ball(true, 5)};
        Basket basket = new Basket(balls);

        System.out.println(Arrays.toString(balls));

        System.out.println(basket.getBlueBalls());
        System.out.println(basket.getBallWeight());
    }
}
