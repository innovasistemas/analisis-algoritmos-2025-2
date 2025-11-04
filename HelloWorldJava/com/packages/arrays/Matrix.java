package com.packages.arrays;

public class Matrix 
{
    private final int MAX_ROWS = 20;
    private final int MAX_COLS = 20;
    private int mat[][] = new int[MAX_ROWS][MAX_COLS];
    private int m, n;

    public Matrix()
    {
        m = 0;
        n = 0;
    }

    public int getMAX_ROWS() 
    {
        return MAX_ROWS;
    }

    public int getMAX_COLS() 
    {
        return MAX_COLS;
    }

    public int[][] getMat() 
    {
        return mat;
    }

    public int getMat(int row, int col) 
    {
        return mat[row][col];
    }

    public void setMat(int[][] mat) 
    {
        this.mat = mat;
    }
    
    public void setMat(int row, int col, int datum)
    {
        mat[row][col] = datum;
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

    public void mainDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + "\t");
        }
    }

    public void secondaryDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - i - 1] + "\t");
        }
    }

    public void lowerTriangular()
    {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
  
}