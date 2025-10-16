package com.packages.linked_list;

public class SimpleLinkedList 
{
    public Node head;

    public SimpleLinkedList()
    {
        head = null;
    }

    public void createBeginLSL(int datum)
    {
        Node m = new Node();
        m.info = datum;
        m.link = head;
        head = m;
    }
    
    public void showLSL()
    {
        Node p = head;
        while (p != null) {
            System.out.println("Información nodo: " + p.info);
            System.out.println("Dirección nodo: " + p);
            System.out.println("Liga nodo: " + p.link);
            System.out.println("----------------------------------");
            p = p.link;
        }
    }

    public boolean searchNodeLSL(int datum)
    {
        boolean sw = false;
        Node p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.link;
            }
        }
        return sw;
    }

    public Node searchNodeLSL(long datum)
    {
        boolean sw = false;
        Node p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.link;
            }
        }
        return p;
    }

    public void insertNodeBeforeRef(int datumRef, int datum)
    {
        Node m;
        if (head.info == datumRef) {
            m = new Node();
            m.info = datum;
            m.link = head;
            head = m;
        } else {
            boolean sw = false;
            Node q = head;
            Node p = q.link;
            while (p != null && !sw) {
                if (p.info == datumRef) {
                    sw = true;
                } else {
                    q = p;
                    p = p.link;
                }
            }
            if (sw) {
                m = new Node();
                m.info = datum;
                q.link = m;
                m.link = p;
                System.out.println("Dato insertado");
            } else {
                System.out.println("Dato no insertado (referencia no existe)");
            }
        }
    }

    public void deleteNodeLSL(int datum)
    {
        boolean sw = false;
        Node q = head;
        Node p = q.link;
        if (head.info == datum) {
            head = head.link;
            System.out.println("Dato eliminado");
        } else {
            while (p != null && !sw) {
                if (p.info == datum) {
                    sw = true;
                } else {
                    q = q.link;
                    p = p.link;
                }
            }
            if (sw) {
                q.link = p.link;
                System.out.println("Dato eliminado");
            } else {
                System.out.println("Dato no eliminado (no existe)");
            }
        }
    }

    public int sumSquare(Node h)
    {
        if (h == null) {
            return 0;
        } else {
            return (int) Math.pow(h.info, 2) + sumSquare(h.link);
        }
    }

    public void showLSLRecursive(Node h)
    {
        if (h != null) {
            System.out.println(h.info);
            showLSLRecursive(h.link);
        } 
    }
}
