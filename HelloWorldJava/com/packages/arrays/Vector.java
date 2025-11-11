package com.packages.arrays;

public class Vector 
{
    private static final int T = 10000000; 
    private int vec[] = new int[T];
    private int n;

    public Vector()
    {
        this.n = 0;
    }  

    public int getT() 
    {
        return T;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public int getVec(int pos) 
    {
        return vec[pos];
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void setVec(int datum) 
    {
        this.vec[n] = datum;
        n++;
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
            s += vec[i];
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
            vec[i] = (int)(Math.random() * 10000);
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

    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
// Para hacer uso de la ordenación por fusión:
// objVec.sort(objVec.getVec(), 0 , objVec.getN() - 1);

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

    public void sortInsertionVector()
    {
        int i, j, aux;
        for (i = 1; i < this.n; i++) {
            j = i - 1;
            aux = this.vec[i];
            while (j >= 0 && aux < this.vec[j]) {
                this.vec[j + 1] = this.vec[j];
                j--;
            }
            this.vec[j + 1] = aux;
        }
    }


    public void deleteVector(int pos)
    {
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    public void insertVector(int datum, int pos)
    {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }  
}
