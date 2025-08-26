import java.util.Scanner;
import com.packages.operations.*;

public class MainMenu 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String args[])
    {
        String option;
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
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }
}
