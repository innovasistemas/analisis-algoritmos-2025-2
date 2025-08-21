package com.packages.operations;

public class Operations 
{
    public Operations()
    {

    }

    public int sumNaturals(int n)
    {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
