package com.packages.linked_list;

public class DoubleLinkedList 
{
    public NodeLDL head;
    public NodeLDL last;
    
    public DoubleLinkedList()
    {
        head = null;
        last = null;
    }

    public void createEndLDL(int datum)
    {
        NodeLDL m = new NodeLDL();
        m.info = datum;
        m.ll = last;
        m.rl = null;
        if (head == null) {
            head = m;
        }
        if (last != null) {
            last.rl = m;
        }
        last = m;
    }

    public void showLDL()
    {
        NodeLDL p = head;
        while (p != null) {
            System.out.println("Información nodo: " + p.info);
            p = p.rl;
        }
    }

    public NodeLDL searchNodeLDL(int datum)
    {
        boolean sw = false;
        NodeLDL p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.rl;
            }
        }
        return p;
    }

    public void deleteNodeLDL(NodeLDL p)
    {
        if (p != head) {
            (p.ll).rl = p.rl;
            if (p.rl != null) {
                (p.rl).ll = p.ll;
            }
        } else {
            head = head.rl;
        }
    }

    public void insertNodeAfterRef(NodeLDL p, int datum)
    {
        NodeLDL m = new NodeLDL();
        m.info = datum;
        p.rl = m;
        if (p != last) {
            m.rl = p.rl.ll;
        }
        m.ll = p;
        p.rl.ll = m; 
    }
}
