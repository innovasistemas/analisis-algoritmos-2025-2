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

    }
}
