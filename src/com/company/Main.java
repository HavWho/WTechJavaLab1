package com.company;

import java.math.BigInteger;
import java.net.Socket;
import java.util.ArrayList;

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
    }
}
