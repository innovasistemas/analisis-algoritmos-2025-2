package com.packages.operations;

public class Operations 
{
    private static final int T = 1000000; 
    private int vec[] = new int[T];
    private int n;

    public Operations()
    {
        this.n = 0;
    }  

    public static int getT() 
    {
        return T;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int sumNaturals()
    {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public int productVector()
    {
        int p = 1;
        for (int i = 0; i < n; i++) {
            p *= this.vec[i];
        }
        return p;
    }

    public void createVector()
    {
        for (int i = 0; i < n; i++) {
            vec[i] = (int)(Math.random() * 100);
        }
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(this.vec[i] + " | ");
        }
    }

    public int searchSecuencialVector(int datum)
    {
        int pos = -1; //Supuesto: dato no está
        int i = 0;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public int binarySearchVector(int datum) 
    {
        int lowerLimit, upperLimit, pos, centralPos;
        pos = -1;
        lowerLimit = 0;
        upperLimit = n;
        while (lowerLimit <= upperLimit && pos == -1) {
            centralPos = (lowerLimit + upperLimit) / 2;
            if (vec[centralPos] == datum) {
                pos = centralPos;
            } else {
                if (datum > vec[centralPos]) {
                    lowerLimit = centralPos + 1;
                } else {
                    upperLimit = centralPos - 1;
                }
            }
        }
        return pos;
    }

    public void updateVector(int pos, int datum)
    {
        vec[pos] = datum;
    }

    public void bubbleSortVector()
    {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
}
