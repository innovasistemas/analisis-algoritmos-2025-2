package com.packages.linked_list;

public class SimpleLinkedList 
{
    
    public void showLSL()
    {
        Node p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.link;
        }
    }
}
