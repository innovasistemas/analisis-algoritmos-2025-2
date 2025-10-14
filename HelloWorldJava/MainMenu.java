import java.util.Scanner;
import com.packages.operations.*;
import com.packages.arrays.*;
import com.packages.linked_list.*;
import com.packages.stacks_queues.*;
import com.packages.recursivity.*;

public class MainMenu 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String args[])
    {
        String option;
        int datum, position;
        Operations oper = new Operations();

        do {
            System.out.println();
            System.out.println("--------------");
            System.out.println("Menú Principal");
            System.out.println("--------------");
            System.out.println("0. Finalizar");
            System.out.println("1. Total datos");
            System.out.println("2. Sumatoria");
            System.out.println("3. Productoria");
            System.out.println("4. Factorial");
            System.out.println("5. Crear vector");
            System.out.println("6. Mostrar vector");
            System.out.println("7. Matrices");
            System.out.println("8. Buscar vector");
            System.out.println("9. Modificar vector");
            System.out.println("10. Ordenar vector");
            System.out.println("11. Buscar vector (binaria)");
            System.out.println("12. Listas ligadas");
            System.out.println("13. Pilas y colas");
            System.out.println("14. Recursividad");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Programa finalizado");
                    break;
                case "1":
                    System.out.print("Ingrese un número natural: ");
                    oper.setN(input.nextInt());
                    input.nextLine(); // Limpia el búffer
                case "2":
                    if (oper.getN() > 0) {
                        System.out.println("Suma de 1 a " + oper.getN() + ": " + oper.sumNaturals());
                    } else {
                        System.out.println("No ha ingresado n");
                    }
                    break;
                case "3":
                    if (oper.getN() > 0) {
                        System.out.println("Productoria Vector: " + oper.productVector());
                    } else {
                        System.out.println("No ha ingresado n");
                    }
                    break;
                case "5":
                    if (oper.getN() > 0) {
                        oper.createVector();
                        System.out.println("Vector creado con " + oper.getN() + " elementos");
                    } else {
                        System.out.println("No ha ingresado n");
                    }
                    break;
                case "6":
                    if (oper.getN() > 0) {
                        oper.showVector();
                    } else {
                        System.out.println("Debe crear el vector");
                    }
                    break;
                case "7":
                    menuMatrix();
                    break;
                case "8":
                    if (oper.getN() > 0) {
                        System.out.println("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = oper.searchSecuencialVector(datum);
                        if (position != -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("Debe crear el vector");
                    }
                    break;
                case "9":
                    if (oper.getN() > 0) {
                        System.out.println("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = oper.searchSecuencialVector(datum);
                        if (position != -1) {
                            System.out.println("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            oper.updateVector(position, datum);
                            System.out.println("Dato actualizado en posición" + position);
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("Debe crear el vector");
                    }
                    break;
                case "10":
                    if (oper.getN() > 0) {
                        oper.bubbleSortVector();
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Debe crear el vector");
                    }
                    break;
                case "11":
                    if (oper.getN() > 0) {
                        System.out.println("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = oper.binarySearchVector(datum);
                        if (position != -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("Debe crear el vector");
                    }
                    break;
                case "12":
                    menuLinkedList();
                    break;
                case "13":
                    menuStackQueue();
                    break;
                case "14":
                    menuRecursivity();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }

    public static void menuMatrix()
    {
        String option;
        Matrix matrix = new Matrix();
        do {
            System.out.println();
            System.out.println("----------------");
            System.out.println("Submenú Matrices");
            System.out.println("----------------");
            System.out.println("0. Regresar");
            System.out.println("1. Crear");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar diagonal principal");
            System.out.println("4. Mostrar diagonal secundaria");
            System.out.println("5. Triangular inferior");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Número filas: ");
                    matrix.setM(input.nextInt());
                    input.nextLine(); // Limpia el búffer
                    System.out.print("Número columnas: ");
                    matrix.setN(input.nextInt());
                    input.nextLine(); // Limpia el búffer
                    matrix.fillMatrix();
                    break;
                case "2":
                    if (matrix.getM() > 0 && matrix.getN() > 0) {
                        matrix.showMatrix();
                    } else {
                        System.out.println("No ha creado la matriz");
                    }
                    break;
                case "3":
                    if (matrix.getM() > 0 && matrix.getM() == matrix.getN()) {
                        matrix.mainDiagonal();
                    } else {
                        System.out.println("No ha creado la matriz");
                    }
                    break;
                case "4":
                    if (matrix.getM() > 0 && matrix.getM() == matrix.getN()) {
                        matrix.secondaryDiagonal();
                    } else {
                        System.out.println("No ha creado la matriz");
                    }
                case "5":
                    if (matrix.getM() > 0 && matrix.getM() == matrix.getN()) {
                        matrix.lowerTriangular();
                    } else {
                        System.out.println("No ha creado la matriz");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!option.equals("0"));
    }

    public static void menuLinkedList()
    {
        String option;
        SimpleLinkedList lsl = new SimpleLinkedList();
        DoubleLinkedList ldl = new DoubleLinkedList();
        int datum, datumRef;
        do {
            System.out.println();
            System.out.println("----------------------");
            System.out.println("Submenú Listas Ligadas");
            System.out.println("----------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar nodo LSL por el inicio");
            System.out.println("2. Mostrar LSL");
            System.out.println("3. Buscar booleano");
            System.out.println("4. Buscar dirección");
            System.out.println("5. Insertar dato antes referencia");
            System.out.println("6. Eliminar dato");
            System.out.println("7. Agregar nodo LDL por el final");
            System.out.println("8. Mostrar LDL");
            System.out.println("9. Buscar nodo LDL");
            System.out.println("10. Eliminar nodo LDL");
            System.out.println("11. Insertar dato LDL después referencia");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato lista: ");
                    lsl.createBeginLSL(input.nextInt());
                    input.nextLine(); // Limpia el búffer
                    break;
                case "2":
                    if (lsl.head != null) {
                        lsl.showLSL();
                    } else {
                        System.out.println("No ha creado la LSL");
                    }
                    break;
                case "3":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        if (lsl.searchNodeLSL(datum)) {
                            System.out.println("Dato encontrado");
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("No ha creado la LSL");
                    }
                    break;
                case "4":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        Node p = lsl.searchNodeLSL((long)datum);
                        if (p != null) {
                            System.out.println("Dato encontrado en dirección " + p);
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("No ha creado la LSL");
                    }
                    break;
                case "5":
                    if (lsl.head != null) {
                        System.out.print("Dato referencia: ");
                        datumRef = input.nextInt();
                        input.nextLine();
                        System.out.print("Dato a insertar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        lsl.insertNodeBeforeRef(datumRef, datum);
                    } else {
                        System.out.println("No ha creado la LSL");
                    }
                    break;
                case "6":
                    if (lsl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        lsl.deleteNodeLSL(datum);
                    } else {
                        System.out.println("No ha creado la LSL");
                    }
                    break;
                case "7":
                    System.out.print("Dato lista LDL: ");
                    ldl.createEndLDL(input.nextInt());
                    input.nextLine(); // Limpia el búffer
                    break;
                case "8":
                    if (ldl.head != null) {
                        ldl.showLDL();
                    } else {
                        System.out.println("No ha creado la LDL");
                    }
                    break;
                case "9":
                    if (ldl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        NodeLDL p = ldl.searchNodeLDL(datum);
                        if (p != null) {
                            System.out.println("Dato encontrado en dirección " + p);
                        } else {
                            System.out.println("Dato no encontrado");
                        }
                    } else {
                        System.out.println("No ha creado la LDL");
                    }
                    break;
                case "10":
                    if (ldl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        NodeLDL p = ldl.searchNodeLDL(datum);
                        if (p != null) {
                            ldl.deleteNodeLDL(p);
                            System.out.println("Dato eliminado de la LDL");
                        } else {
                            System.out.println("No existe el dato en la LDL");
                        }
                    } else {
                        System.out.println("No ha creado la LDL");
                    }
                    break;
                case "11":
                    if (ldl.head != null) {
                        System.out.print("Dato referencia: ");
                        datumRef = input.nextInt();
                        input.nextLine();
                        NodeLDL p = ldl.searchNodeLDL(datumRef);
                        if (p != null) {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            input.nextLine();
                            ldl.insertNodeAfterRef(p, datum);
                        } else {
                            System.out.println("No existe el dato en la LDL");
                        }
                    } else {
                        System.out.println("No ha creado la LDL");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!option.equals("0"));
    }

    public static void menuStackQueue()
    {
        String option;
        int datum;
        Stacks stack = new Stacks();
        Queues queue = new Queues();

        do {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("Submenú Pilas y Colas");
            System.out.println("---------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Apilar");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Desapilar");
            System.out.println("4. Encolar");
            System.out.println("5. Mostrar cola");
            System.out.println("6. Desencolar");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    if (stack.TOP < 50) {
                        System.out.print("Dato a apilar: ");
                        datum = input.nextInt();
                        input.nextLine(); // Limpia el búffer
                        stack.stacking(datum);
                    } else {
                        System.out.println("Desbordamiento de pila");
                    }
                    break;
                case "2":
                    if (stack.TOP > 0) {
                        stack.showStack();
                    } else {
                        System.out.println("No ha creado la pila");
                    }
                    break;
                case "3":
                    if (stack.TOP > 0) {
                        System.out.println("Elemento desapilado: " + stack.unStacking());
                    } else {
                        System.out.println("Subdesbordamiento de pila");
                    }
                    break;
                case "4":
                    if (queue.TOP < 50) {
                        System.out.print("Dato a encolar: ");
                        datum = input.nextInt();
                        input.nextLine(); // Limpia el búffer
                        queue.push(datum);
                    } else {
                        System.out.println("Desbordamiento de cola");
                    }
                    break;
                case "5":
                    if (queue.TOP > 0) {
                        queue.showQueue();
                    } else {
                        System.out.println("No ha creado la cola");
                    }
                    break;
                case "6":
                    if (queue.TOP > 0) {
                        System.out.println("Elemento desencolado: " + queue.pop());
                    } else {
                        System.out.println("Subdesbordamiento de cola");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!option.equals("0"));
    }

    public static void menuRecursivity()
    {
        String option;
        int datum;
        

        do {
            System.out.println();
            System.out.println("--------------------");
            System.out.println("Submenú Recursividad");
            System.out.println("--------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Factorial");
            System.out.println("2. Sumatoria");
            System.out.println("3. Fibonacci");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine(); // Limpia el búffer
                    System.out.println("n! = " + Recursion.factorialRecursive(datum));
                    break;
                case "2":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine(); // Limpia el búffer
                    System.out.println("Sumatoria(1, n) = " + Recursion.sumNaturalsRecursive(datum));
                case "3":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine(); // Limpia el búffer
                    System.out.println("Fibonacci = " + Recursion.fibonacciRecursive(datum));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!option.equals("0"));
    }
}
