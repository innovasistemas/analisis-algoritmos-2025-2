package com.packages.stacks_queues;

public class Queues 
{
    private static final int MAX = 50; 
    private int queue[] = new int[MAX];
    public int TOP;

    public Queues()
    {
        TOP = 0;
    }

    public void push(int datum)
    {
        queue[TOP] = datum;
        TOP++;
    }

    public int pop()
    {
        return deleteQueue(0);
    }

    public int deleteQueue(int pos)
    {
        int d = queue[0];
        for (int i = pos; i < TOP - 1; i++) {
            queue[i] = queue[i + 1];
        }
        TOP--;
        return d;
    }

    public void showQueue()
    {
        for (int i = 0; i < TOP; i++) {
            System.out.print(queue[i] + " | ");
        }
    }
}