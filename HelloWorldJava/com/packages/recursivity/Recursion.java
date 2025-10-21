package com.packages.recursivity;

public class Recursion 
{
    
    public static int factorialRecursive(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int sumNaturalsRecursive(int n)
    {
        System.out.println(n);
        if (n == 1) {
            return n;
        } else {
            return n + sumNaturalsRecursive(n - 1);
        }
    }

    public static int fibonacciRecursive(int n)
    {
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static double capital(double m, double x, int n)
    {
        if (n == 0) {
            return m;
        } else {
            return (1 + x) * capital(m, x, n - 1);
        }
    }

    public static int mcd(int a, int b)
    {
        int m = a > b ? a : b;
        while (a % m != 0 || b % m != 0) {
            m--;
        }
        return m;
    }

    public static int mcdEuclidesRecursive(int a, int b)
    {
        if (b == 0) {
            return a;
        } else {
            return mcdEuclidesRecursive(b, a % b);
        }
    }
}
