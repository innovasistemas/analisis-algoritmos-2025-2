package com.packages.arrays;

public class Matrix 
{
    int mat[][] = new int[20][20];
    int m, n;

    public Matrix()
    {
        m = 0;
        n = 0;
    }

    public int[][] getMat() 
    {
        return mat;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    public int getM() 
    {
        return m;
    }

    public void setM(int m) 
    {
        this.m = m;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void fillMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }

    public void showMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

     
}