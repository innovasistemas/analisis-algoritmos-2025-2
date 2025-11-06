package com.packages.graphs;

import java.util.Scanner;
import com.packages.arrays.*;

public class Graph 
{
    private Scanner input;
    public Vector vertex;    
    public Matrix adjacencyMatrix;

    public Graph()
    {
        input = new Scanner(System.in);
        vertex = new Vector();
        adjacencyMatrix = new Matrix();
    }

    public void addNode(int datum)
    {
        if (vertex.searchSecuencialVector(datum) == -1) {
            vertex.setVec(datum);
            System.out.println("Nodo agregado al grafo");
            adjacencyMatrix.setM(vertex.getN());
            adjacencyMatrix.setN(vertex.getN());
        } else {
            System.out.println("Nodo existente");
        }
    }

    public void showGraph()
    {
        System.out.println("Lista de vértices");
        vertex.showVector();
    }

    public void showAdjacencyMatrix()
    {
        System.out.println("Matriz de adyacencia");
        adjacencyMatrix.showMatrix();
    }

    public void addNodeAdjacent()
    {
        int datum, posVertex, posAdjacent;
        String op;
        showGraph();
        System.out.print("\nSeleccione un nodo: ");
        datum = input.nextInt();
        input.nextLine();
        posVertex = vertex.searchSecuencialVector(datum);
        if (posVertex > -1) {
            do {
                showGraph();
                System.out.print("\nSeleccione un nodo adyacente: ");
                datum = input.nextInt();
                input.nextLine();
                posAdjacent = vertex.searchSecuencialVector(datum);
                if (posAdjacent > -1) {
                    if (posVertex != posAdjacent) {
                        System.out.print("¿Ingresar valor arista? [s/?]: ");
                        op = input.nextLine();
                        if (op.equals("s")) {
                            System.out.print("Peso arista: ");
                            datum = input.nextInt();
                            input.nextLine();
                        } else {
                            datum = 1;
                        }
                        adjacencyMatrix.setMat(posVertex, posAdjacent, datum);
                    } else {
                        System.out.println("No pueden haber nodos adyacentes a sí mismos");
                    }
                } else {
                    System.out.println("El nodo no existe");
                }
                System.out.print("¿Agregar más nodos adyacentes? [s/?]: ");
                op = input.nextLine().toLowerCase();
            } while (op.equals("s"));
        } else {
            System.out.println("El nodo no existe");
        }
    }

    public int showAdjacentNodes(int pos)
    {
        int k = 0;
        for (int i = 0; i < vertex.getN(); i++) {
            if (adjacencyMatrix.getMat(pos, i) > 0) {
                k++;
                System.out.println("Nodo " + k +": " + vertex.getVec(i));
            }
        }
        return k;
    }
}
