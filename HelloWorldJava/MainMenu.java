import java.util.Scanner;
import com.packages.operations.*;

public class MainMenu 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String args[])
    {
        String option;
        int n;
        Operations oper = new Operations();

        do {
            System.out.println("--------------");
            System.out.println("Menú Principal");
            System.out.println("--------------");
            System.out.println("0. Finalizar");
            System.out.println("1. Sumatoria");
            System.out.println("2. Productoria");
            System.out.println("3. Factorial");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Programa finalizado");
                    break;
                case "1":
                    System.out.print("Ingrese un número natural: ");
                    n = input.nextInt();
                    input.nextLine(); // Limpia el búffer
                    System.out.println("Suma de 1 a " + n + ": " + oper.sumNaturals(n));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!option.equals("0"));
    }
}
