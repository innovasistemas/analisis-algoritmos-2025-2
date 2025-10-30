package com.packages.binary_trees;

import java.util.Scanner;

public class Tree 
{
    public Scanner input = new Scanner(System.in);
    public NodeTree root;

    public Tree()
    {
        root = null;        
    }

    public void loadNode(NodeTree node) 
    {
        NodeTree p;
        String resp;
        System.out.print("Dato para el árbol: ");
        node.info = input.nextInt();
        input.nextLine();
        System.out.println("¿Agregar nodos por la izquierda de "+ node.info + "? [s/?]");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
            p = new NodeTree();
            node.lb = p;
            loadNode(node.lb);
        } else {
            node.lb = null;
        }
        System.out.println("¿Agregar nodos por la derecha de "+ node.info + "? [s/?]");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
            p = new NodeTree();
            node.rb = p;
            loadNode(node.rb);
        } else {
            node.rb = null;
        }
    }

    public void preorder(NodeTree node)
    {
        if (node != null) {
            System.out.println(node.info);
            preorder(node.lb);
            preorder(node.rb);
        }
    }

    public void inorder(NodeTree node)
    {
        if (node != null) {
            inorder(node.lb);
            System.out.println(node.info);
            inorder(node.rb);
        }
    }

    public void postorder(NodeTree node)
    {
        if (node != null) {
            postorder(node.lb);
            postorder(node.rb);
            System.out.println(node.info);
        }
    }

    public int countNodes(NodeTree node)
    {
        if (node != null) {
            return 1 + countNodes(node.lb) + countNodes(node.rb);
        } else {
            return 0;
        }
    }

    public int sumNodes(NodeTree node)
    {
        if (node != null) {
            return node.info + sumNodes(node.lb) + sumNodes(node.rb);
        } else {
            return 0;
        }
    }

    public int countLeaves(NodeTree node)
    {
        int c = 0;
        if (node != null) {
            if (node.lb == null && node.rb == null) {
                c = 1;
            }
            return c + countLeaves(node.lb) + countLeaves(node.rb);
        } else {
            return 0;
        }
    }

    public int maxNode(NodeTree node)
    {
        int m, mLeft, mRight;
        m = mLeft = mRight = Integer.MIN_VALUE;
        if (node != null) {
            if (node.lb != null) mLeft = maxNode(node.lb);
            if (node.rb != null) mRight = maxNode(node.rb);
            m = mLeft > mRight ? mLeft : mRight;
            if (node.info > m) m = node.info;
        }
        return m;
    }

    public void arrayTree(NodeTree node, int v[], int pos[])
    {
        if (node != null) {
            v[pos[0]] = node.info;
            pos[0]++;
            arrayTree(node.lb, v, pos);
            arrayTree(node.rb, v, pos);
        }
    }
}
