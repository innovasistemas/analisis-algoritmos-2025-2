import java.util.Scanner;
import com.packages.operations.*;
import com.packages.arrays.*;

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
}
