package com.packages.stacks_queues;

public class Stacks 
{
    private static final int MAX = 50; 
    private int stack[] = new int[MAX];
    public int TOP;

    public Stacks()
    {
        TOP = 0;
    }

    public void stacking(int datum)
    {
        stack[TOP] = datum;
        TOP++;
    }

    public int unStacking()
    {
        TOP--;
        return stack[TOP];
    }

    public void showStack()
    {
        for (int i = TOP - 1; i >= 0; i--) {
            System.out.println("-----");
            System.out.println(stack[i]);
        }
    }

    public int searchStack(int datum)
    {
        int pos = -1; //Supuesto: dato no está
        int i = 0;
        while (i < TOP && pos == -1) {
            if (stack[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
}
